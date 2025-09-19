package edu.kh.control.practice;

import java.util.Scanner;

//ATMRun 재사용
public class Dice {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1(){
		
		int answer;//랜덤 정답
		String input=" ";//사용자 입력(숫자로 변환 필요)
		int count;//시도 횟수
		int win; //정답 횟수
		
		System.out.print("===주사위 맞하기 게임 시작===\n"
		+ "1~6 사이의 숫자를 맞혀보세요.(종료를 원하면 종료입력)\n");
		
		//숫자를 입력할때, 세가지 경우의 수가 있음.
		//1~6은 게임을 계속 진행, 이외의 수는 "잘못입력",종료
		
		System.out.print("숫자 입력>> ");
		input = sc.next();
		
		while(!input. equals("종료") ) {
		
			
		System.out.print("숫자 입력>> ");
		input = sc.next();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
