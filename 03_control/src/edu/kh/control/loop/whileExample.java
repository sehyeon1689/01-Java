package edu.kh.control.loop;

import java.util.Scanner;

//LoopRun를 실행용 클래스로 재사용
public class whileExample {

	/*while문
	 * 
	 * -종료조건을 자유롭게 설정
	 * 초기식, 증감식X
	 * 
	 * 박복 횟수ㅏ 확실히 정해져있지 않음
	 * 
	 * 조건식이 거짓이 되면 종료
	 * 
	 * */
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {//while문
		
		int input = 9;
		
		while(input != 0) {//0이면 반복,0이면 멈춤
			
			System.out.println("====메쥬선택====");
			System.out.println("1 떡볶이");
			System.out.println("2면");
			System.out.println("3.밥");
			System.out.println("0종료");
			
			System.out.print("메뉴선택>>");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("1를 주문함");break;
			case 2 : System.out.println("2를 주문함");break;
			case 3 : System.out.println("3를 주문함");break;
			
			case 0 : System.out.println("끝");break;
			default : System.out.println("메뉴에 없음.");break;
			
			}
			
			
		}
		
	}
	
	public void ex2() {//do~while문
		
		/* 입력되는 모든 정수의 합 구하기
		 * 단, 0이 입력외면 반복 종료후 결과 출력
		 * -> 0이 입력되지 않으면 게속 반복 */ 
		
		int input = 0;//받을값
		int sum  = 0;//합계
		
		do {
			
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum+=input;//s=s+i
			
		}while(input != 0);
			
		System.out.println("합계 : "+sum);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
