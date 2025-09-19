package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {//실습문제1
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
		for (int i = 1; i <= num ; i++) {
			System.out.print(i);
			System.out.print(" ");
		}}
		else {
	    System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	public void practice2() {//실습문제2
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
		for (int i = num; i <= num&&i>0; i--) {
			System.out.print(i);
			System.out.print(" ");
		}}
		else {
	    System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
	}
	public void practice3() {//실습문제3
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		//빈 변수를 만들어서 누적키켜 표현하기 문자,숫자
		int sum = 0;
		//String result =" "; 여기에 문자 누적해도됨
			for ( int i= 1; i < num; i++) {
				System.out.print(i + " " + "+ ");
			}
		
				System.out.print(num + " = " );
				
			for ( int i= 1; i <= num; i++) {
				//for를 이용하여 sum에 누적시키기.
				
				sum+=i;//0=0+1->1=0+2.....
				
			}System.out.print(sum);//???
				
	}
	public void practice4() {//실습문제4
		//??치완->강사풀이 복습 필수
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
		if(num1 <= 0 || num2 <= 0 ){
			System.out.println("1이상의 숫자를 입력해주세요.");}
		/*
		else { 
		 int start = num1;
		 int end = num2;
		 if (num1 > num2){  }
		 
		 
		  */
			else if(num1 > num2) {
		for(int i = num2; i <= num1; i++) {
			System.out.print(i + " ");
		}
		}else
		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
		}
		}
			
	}
	public void practice5()	{//실습문제5
		
		System.out.print(" 숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===="+num+"단====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(num +" * " + i + " = ");
			System.out.println(num*i);//??프린트F써도됌
		}
		
	}
	public void practice6() {//실습문제6
		//???
		System.out.print(" 숫자 : ");
		int num = sc.nextInt();
		
		
		for(int dan = num; dan <= 9; dan++) {
			System.out.println("===="+num+"단====");
		for(int i = 1; i <= 9; i++) {
			System.out.print(num +" * " + i + " = ");
			System.out.println(num*i);
		//System.out.printf(" %d X %d = %d\n ", num, i, num*i);
		}}
		
	}
	public void practice7()	{
		
	}
	
	public void practice8() {//4번
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) { // 1미만의 숫자가 입력된 경우
			System.out.println("1이상의 숫자만 입력하세요!");
			
		} else { // 정상인 경우
			
			// 일단 start에 첫번째 숫자, end에 두번째 숫자 대입
			int start = num1; 
			int end = num2;
			
			// 만약 첫 번째 숫자가 크다면 start, end의 값 바꾸기
			if(num1 > num2) {
				start = num2;
				end = num1;
			}
			
			for(int i = start; i <= end; i++) {
				System.out.print(i + " ");
			}
			
		}
		
	}
	
	}
		
	

	
	
	

