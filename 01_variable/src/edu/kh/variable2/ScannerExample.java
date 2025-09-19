package edu.kh.variable2;

import java.util.Scanner;
/*ctrl + shift + o : 현재 클래스에서 import되지 않는 클래스를 자동르오 import,
                     사용하지 않는 것은 자동 삭제*/

// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
//java.ut.scanner : java.utill 패키지에서 설계도를 가져오는 개념

public class ScannerExample {

	public static void main(String[] args) {
		
	//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		//Scanner 객체 생성
		//-> 내 프로그램 안에 스캐너라느 기계를 새로 만드는 것.
		Scanner sc = new Scanner (System.in);
		//맞춤형 상자 sc=스캐너 기계
		//스ㅡ케너 자료형 인데, 스캐너 전용이다. 
		/* import 구문 없으면 설계도가 없는 것*/
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();//정수 input1 상자에 넣음. = 정수를 입력 받는 기능
		//ㄴ해야 녹화 가능
		//System.out.println(input1);
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();

		System.out.println("%d + %d = %d", input1, input2, input1 + input2);
		
		
		
		
		
		
	}

}
