package edu.kh.control.practice;

import java.util.Scanner;

/* 기능제공 클래스->실행할 프로그램을 여기서 만든다.
                    메인 메서드는 실행만, 때문에 메인이 필요 없다.*/
public class ConditionPractice {
	
	Scanner sc = new Scanner (System.in);//필드
			
	/*public void->어디서든 호출할 수 있고, 
	               값을 반환하지 않는 메서드 선언부의 일부
	               메소드의 명은 practice1, 마무리는();*/
	
	
	/*ctrl + shift + F : 자동 정렬*/
	
	public void practice1(){//실습문제1
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num <= 0) {
			System.out.println("양수만 입력해주세요.");
		}else if( num % 2 == 0) { 
			System.out.println("짝수입니다.");
		}else { 
			System.out.println("양수입니다.");
		}
		
		/*결과값을 저장할수 있는 문자열 변ㅅ 선언
		 * 
		 *프린트 매서드를 부르는 대신 result 후
		 *result를 맨 아래 result 프린트*/
}
	public void practice2() {//실습문제2
		
		System.out.print("국어점수 : ");
		int kor =sc.nextInt();
		System.out.print("수학점수 : ");
		int math =sc.nextInt();
		System.out.print("영어점수 : ");
		int eng =sc.nextInt();
		
		int sum = (kor + math + eng );
		double avg = ((kor + math + eng )/3.0);
		
		if (sum < 120 && avg < 60) {//<-sum 오답, 각각 써야함
			System.out.println("불합격입니다.");
		} else {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n" , avg);
			System.out.println("축하합니다, 합격입니다!");
		}
			
		
	
	}
		
	public void practice3() {//실습문제3
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1 : System.out.println(month+"월은 31일까지 있습니다.");break;
		case 2 : System.out.println(month+"월은 28일까지 있습니다.");break;
		case 3 : System.out.println(month+"월은 31일까지 있습니다.");break;
		case 4 : System.out.println(month+"월은 30일까지 있습니다.");break;
		case 5 : System.out.println(month+"월은 31일까지 있습니다.");break;
		case 6 : System.out.println(month+"월은 30일까지 있습니다.");break;
		case 7 : System.out.println(month+"월은 31일까지 있습니다.");break;
		case 8 : System.out.println(month+"월은 31일까지 있습니다.");break;
		case 9 : System.out.println(month+"월은 30일까지 있습니다.");break;
		case 10 : System.out.println(month+"월은 31일까지 있습니다.");break;
		case 11 : System.out.println(month+"월은 30일까지 있습니다.");break;
		case 12 : System.out.println(month+"월은 31일까지 있습니다.");break;
		default : System.out.println(month+ "월은 잘못 입력된 달입니다.");
		
		}
		
	}
		
	public void practice4() {//실습문제4
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight /(height*height);
		System.out.printf("BMI 지수 : %.14f\n", bmi);
		
		/*밑에 System.out.println();대신
		 String result 써서 적용해도 됨.*/
		
		if (bmi<18.5) { System.out.println("저체중");}
		else if (bmi >= 18.5 && bmi < 23) {System.out.println("정상체중");}
		else if (bmi >= 23 && bmi < 25) {System.out.println("과체중");}
		else if (bmi >= 25 && bmi < 30) {System.out.println("비만");}
		else if (bmi >= 30 ) {System.out.println("고도 비만");}
		//중가로는 생략가능 하지만, 사용하는 것을 권장함.
		
		
		//System.out.println(result);
	}
	
	public void practice5() {//실습문제5
		
		System.out.print("중간 고사 점수 : ");
		int mdl = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fnl = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hwk = sc.nextInt();
		System.out.print("출석 횟수 : ");
		double cls = sc.nextDouble();
		
		System.out.println("=================결과==================");
		
		if (cls < 14 ) 
		{System.out.printf("Fail [출석 횟수 부족 ("+"%.0f"+ "/20)]",cls);}//????????
		else {
		System.out.println("중간 고사 점수(20) : " + (mdl * 0.2));
		System.out.println("기말 고사 점수(30) : " + (fnl * 0.3));
		System.out.println("과제 점수(30) : " + (hwk * 0.3));
		System.out.println("출석 점수(20) : " + (cls));
		double sum = (mdl * 0.2)+(fnl * 0.3)+(hwk * 0.3)+(cls);
		System.out.println("총점 : " + sum);
		
		if (sum >= 70) {System.out.println("Pass");}
		else if (sum < 70 ) {System.out.println("Fail [점수 미달]");}}
		
		
		
		
	}
}
