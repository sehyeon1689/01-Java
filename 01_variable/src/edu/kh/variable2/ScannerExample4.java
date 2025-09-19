package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//다른거 쓰다가 라인쓰면 이상해짐.왜?
		/*nextInt(),nextdouble(),next(),공백을 수집하지 않는다.
		 * ㄴ 위기능을 사용한 후 nextLine() 사용시 문제,*/
		System.out.println("nextInt() 입력 : ");
		int intNum = sc.nextInt();// 정수O, 공백X, 뒤에는 입력버퍼에 남음
		
		
		
		//방지책: 라인을 한번더 쓴다,입력버퍼에 남은 개행문자 제거!
		
		
		
		
		
	}

}
