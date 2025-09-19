package edu.kh.control.practice;

import java.util.Scanner;

public class ATM {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		int cash =10000;
		//int out,in;
	
		System.out.println("===ATM프로그램 시작===\n"+
							"현재 잔액 10000원\n");
		
		int input =0;
		
		while(input != 4) {//..123 4 5678..
			System.out.print(	"메뉴를 선택하세요:\n"+
					"1.입금하기\n"+
					"2.출금하기\n"+
					"3.잔액조회\n"+
					"4.종료\n"+
					">>");
					input = sc.nextInt();
		
		switch (input) {
		
		case 1 : System.out.println("임금할 금액을 입력하세요 : ");
					int in = sc.nextInt();
					cash += in;
					//cash+=sc.enxtInt();
					System.out.printf("임금완료!현재 잔액: %d원\n",cash);break;
		
		case 2 : System.out.print("출금할 금액을 입력하세요: ");
			 		int out = sc.nextInt();
			 		
			 	if(cash < out) {
			 	System.out.printf("잔액부족 현재잔액은 %d원 입니다.\n",cash);
			 	continue;} else {
			 		cash  -= out;
			 	 System.out.printf("출금완료!현재잔액: %d원\n",cash);}break;
		
		
		case 3 : System.out.printf("현재 잔액은 %d원입니다.\n", cash );break;
			
		case 4 : System.out.println("프로그램을 종료합니다."
				                    + "이용해주셔서 감사합니다.");break;
	    default: System.out.println("잘못 입력된 값입니다.");
			 		
			 		
			 	}
			 	
			
		
					
		}
		
		}
		

	}
		
	
	
	
	
	
	

