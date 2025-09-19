package edu.kh.control.loop;

import java.util.Scanner;

//기능제공용 클래스
public class ForExample {

	Scanner sc =new Scanner(System.in);
	
	public void ex1() {
		
		for(int i= 1;i<=10;i++) {
			
			System.out.print(" "+i );
			
		}
	}
	/*public void ex2() {//숫자 말고, 알파벳 한줄로 출력
		//          'A'  char형은  int로 자동형변환이 가능
		for(int i = 'A'; i <= 'Z'; i++  ) {
			System.out.print(" "+(char)i);//강제형 변환
		}
		
		System.out.println("\n====================");
		
		for(char i = 'A'; i <= "Z"; i++) {
			System.out.println(i);
		}
		
	}*/
	public void ex3() {
		System.out.print
		("번호입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= input; i++) {
			System.out.println(i);
		}
		
		
	}
	public void ex4() {//정수5개를 입력 받아 합계구하기
		
		int sum = 0;//합계저장용변수
		
		for (int i = 1; i <= 5 ; i++) {
			
		System.out.print("입력 "+i+" : ");
		int input = sc.nextInt();
		
		sum += input;//s= s + i --- sum에 다 누적된다.
		
		}
		System.out.println("합계 : "+ sum);
	
	}
	public void ex5() {//1~20까지 출력 단, 3의 배수는 괄호 안에 표시
		//for문 안에 if문을 조건으로..
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for (int i = 1;i <= 20 ; i++)
		{
			if (i % num ==0) {
				System.out.print("("+i+") ");
			}else {
					System.out.print(i + " ");}
			
			
		
		
		
	}
	
	}
	public void ex6() {//구구단
	//2~9 사이 까지 단,  범위에서 벗어나면 "잘못 임력하셨습니다"
		System.out.print("단 입력 : ");
		int num =sc.nextInt();
		
		
		if ( num >=1 && num <= 9) {//<-X
		for(int i = 1; i <= 9; i++) {
			
			if(num > 0 && num < 9 ) { 
				
				System.out.println(num * i); 
				
			}else {
				
				System.out.println("잘못 입력하셨습니다.");
				
			}}
			
		}
		
		
		
	}
	public void ex7() {//수자 세기 count
		/*1~20입력 받은  수의 배수의 총 개수 출력
		 * 합계까지 출력*/
		
		String result = "";// 배수를 나열한 변수
		int count = 0;
		int sum = 0;
		
		
		System.out.print("배수입력 : ");
		int input = sc.nextInt();
		
		for (int i = 1; i <= 20 ; i++){
			
			if( i % input ==0 ) {//배수일때
				result += i + " ";//<-누적(20전까지 result에)
				count++;   //??-->강의 03:25:00
				sum += i;   //??
			}//else생략
			}
		System.out.printf("%s: %d개 \n", result, count);
		System.out.printf("%d의 배수 합계 : %d", input, sum);
		
	
	}
	public void ex8() {//구구단 모두 출력하기
		
		for(int dan = 2; dan <=9; dan++) {//2~9단
			System.out.print(" " );
			for(int num =1; num <=9; num++) {//각단의 곱해질 수 1~9
				System.out.printf("%d X %d = %2d ", dan, num, dan*num);
			}
			System.out.println();
		}//여기로 빠져나옴
		
		
	}
	
}
