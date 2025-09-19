package edu.kh.control.condition;

import java.awt.DefaultFocusTraversalPolicy;
import java.util.Scanner;

public class ConditionExample {//기능 재공용 -기능을 여개러 만들어서 씀.
	
	Scanner sc = new Scanner(System.in);//전역 변수 = 필드 변수
	  
	
	
	//매서드 (+ 생성자)  
	
	public void ex1() { 
		
		/* if문 
		  
		 조건식이 참일때만 내부코드 수행
		 
		 입역받은 정수가 양수인지 검사
		 양수라면 "야수입ㄴ니다." 출력
		 *
		 */
		
		System.out.println("정수입력 : ");
		int input  = sc.nextInt();
				
				if ( input > 0 ) {		
					System.out.println("양수입니다.");
					
		
					
		System.out.println("정수입력 : ");
		int input1  = sc.nextInt();
		//홀수
		if(input % 2 != 0) {//홀수라면
		
		} else {//짝수 거나 
			if() {
				
			}else {}
	}
		
		
		
		
		
	}}
	
	public void ex3() { 
		
		//양수인지, 음스, 0 판별
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) { 
			System.out.println("양수입니다.");
			
		}else if( input < 0 ) {
			System.out.println("음수입니다.");
			
		}else {
			
			System.out.println("0입니다.");
	    }
		
	}

	public void ex4() {
		
		/*달(month)을 입력 받아 행당 달의 맞는 계절 출력
		 * 
		 * 겨울/여름에는 온도 입력 받아요
		 * 
		12,1,2 겨울(-15도 이하 : "한파 경보" / 
		            -12도 이하 : "한파 주의보")
		345 봄
		 678 여름 (35도 이상 : "여름 폭염경보")
		 			 (33도 이상 : "여름 폭염 주의보")
		 9 12 1 가을 
		1 12 아닌때"해당하는 계절이 없습니다." 출력*/
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 계절명을 저장할 변수
		
		
		if (month==1 || month==2 || month==12) {season="겨울";//||OR연산자
			System.out.print("온도입력 : ");
			int temprature = sc.nextInt();
			if (temprature <= -15) {season += " 한파 경보 ";}//+=는 중첩, 겨울 +한파주의보
			else if(temprature <= -12) {season += " 한파 주의보 ";}}
			
		else if(month>=3 && month<=5) {season = "봄";}
		
		else if(month>=6 && month<=8) {season = "여름";
			System.out.print("온도입력 : ");
			int temprature = sc.nextInt();
			if (temprature >= 35) {season += " 폭염 경보 ";}
			else if(temprature >= 33) {season += " 폭염 주의보 ";}}
			
		else if(month>=9 && month<=11) {season = "겨울";}			
		
		else {season= "해당하는 계절이 없습니다.";}
			
			System.out.print(season);}
		
	public void ex5() {
		
		/*나이를 입력 받아
		 * 13세 아하면 "어린이 입니다."
		 * 13세 초과 19세 이하면 "청소년입니다."
		 * 19세 초과 시 " 성인입니다." 출력*/
		
		System.out.print(" 나이 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age <= 13)  result = "어린이 입니다.";
		else if (age <= 19)  result = "청소년입니다.";
		else  result = "성인입니다.";
		//**중가로{} 없어도 실행된다.
		System.out.println(result);
		
	}
	public void ex6() {
		
		/*점수를 입력 받아
		 * 90점이상 = A
		 * 80점 이상 90점 미만 : B
		 * 70점 이상 80점 미만 : C
		 * 60점 이상 70점 미만 : D
		 * 60점 미만 :F
		 *0점 미만, 100 점 초과 : "잘못 입력하셨습니다." 출력
		 *
		 *점수 입력 : 60
		 *D*/
		
		System.out.print("점수 입력 :");
		int sco = sc.nextInt();
		
		String result;
		
		//처리방식을 생각해야 예외부터--예외가 최종 울타리 같은 역할을 학 때문에
		if (sco <0 || sco >100 ) result = "잘못 입력하셨습니다.";
			else if (sco >= 90) result = "A";
			 else if (sco >= 80 ) result ="B";
			 else  if(sco >= 70 ) result = "C";
			 else if(sco >= 60) result = "D";
			 else if(sco < 60) result = "F";
					 
		System.out.println (result);
		
		
		/*if (sco >= 90) result = "A";
		 else if (sco >= 80 ) result ="B";
		 else  if(sco >= 70 ) result = "C";
		 else if(sco >= 60) result = "D";
		 else if(sco < 60) result = "F";*/
			}
		
	public void ex7() {
		
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0 이상일 경우에만 "탑승가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다"
		// 키가 140.0 미만 : "적정 키가 아닙니다"
		// 나이가 0세 미만, 100세 초과 시 : "잘못 입력하셨습니다" 
				
		// [실행화면]
		// 나이 입력 : 10
		// 키 입력 : 160
		// 적정 연령이 아닙니다
			
		// 나이 입력 : 15
		// 키 입력 : 110
		// 적정 키가 아닙니다
				
		// 나이 입력 : 15
		// 키 입력 : 160
		// 탑승 가능
				
		// 나이 입력 : 300
		// 잘못 입력하셨습니다
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		//String result; //결과 저장용 변수 선언
		
		if( age <0 || age > 100) result " 잘못 입력하셨습니다.";
		else 
			
		
		System.out.print("키 입력 : ");
		double hit = sc.nextDouble();
		
		if (age <12) result ="적정 연령이 아닙니다";
		else if (hit  )
		
		//String result;
		
		if ( age < 0 && age > 100) reult = "잘못 입력하셨습니다" ;
		else if ( age > 12 && hit > 140.0 ) result = "탑승가능"
		else   result = "탑승가능"	
		
		//System.out.println(result);
		
		
	}
	
	public void ex8() { 
		
		System.out.print("나이 입력 : ");
		int age =sc.nextInt();
		
		String result;
		
		if (age <0 || age >100) result = "나이를 잘못 입력 하셨습니다.";
		else 
			System.out.print("키 입력 : ");
		    double hight =sc.nextDouble();
		if (hight <0 || hight > 250.0) result = "키를 잘못 입력 하셨습니다.";
		
		
		
		System.out.println(result);
		
		
	}
	
	public void ex9() {
		
		//switch 문  여러 케이스 중 한나를 선택하여 하나를 수행하는 조건문
		
		// 요일번호 입력 (1~7) : 3
		//수
		
		System.out.print("요일번호 입력 : " );
		int day = sc.nextInt();
		
		//String result;
		
		switch (day) {
		case 1 : System.out.println("월");break;
		case 2 : System.out.println("화");break;
		case 3 : System.out.println("수");break;
		case 4 : System.out.println("목");break;
		case 5 : System.out.println("금");break;
		case 6 : System.out.println("토");break;
		case 7 : System.out.println("일");break;
		default : System.out.println("X");
		}
		
	}
	
	public void ex10() {
		
		System.out.print("점수입력 : ");
		int scr = sc.nextInt();
		
		switch ( scr / 10 ) { 
		case 10 , 9 :System.out.print("학점 A"); break;
		case 8 : System.out.println("학점 B"); break;
		case 7 : System.out.println("학점 C"); break;
		case 6 : System.out.println("학점 D"); break;
		case 5,4,3,2,1,0 : System.out.println( "학점 F"); break;
		default : System.out.println("잘못X"); }
		
	}
		
	}



	
	
	
	


