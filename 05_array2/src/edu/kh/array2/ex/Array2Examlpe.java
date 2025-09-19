package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Examlpe {
	
	public void ex1() {//2차원 배열
		
		//-선언-
		int [][]arr;
		//-할당-
		arr=new int[2][3];
		//heap영역에 2행 3열 할당
		//첨조변수를 대입함(참조변수, 참조형, 래퍼런스 변수 같은 말)
		
		//-초기화-
		//1.직접 초기화
		//arr[0][0]=1;
		//System.out.println(Arrays.toString(arr[0]));//Arrays.toString은 1차원, 때문에
		System.out.println(Arrays.deepToString(arr));//Arrays.deepToString 사용
		
		//arr= {{1,2,3,},{4,5,6}};
		
		
		//2.중첩(2중) for문 초기화
		int num = 10;//배열초기화
		//*배열의 길이
		System.out.println(arr.length);//행길이->열의 주소값
		System.out.println(arr[0].length);//열 인덱스0의 길이
		System.out.println(arr[1].length);//열 인덱스1의 길이
		System.out.println(Arrays.toString(arr[0]));
		
		//10씩 반복 증가하는 배열문(일정한 규칙이 있으면 반복문 사용
		for(int row=0; row < arr.length; row++) {//행row반복
			for(int col = 0; col < arr[row].length; col++ ) {//열 반복
				arr[row][col]=num;
				num+=10;
			}
		}System.out.println(Arrays.deepToString(arr));
			
		//3.선언과 동시에 초기화
		 int[][]arr2= {
				 {10,20,30},
				 {40,50,60}
		 };System.out.println(Arrays.deepToString(arr2));
	}
	
	public void ex2() {//2중 for문
		//선언과 동시에 초기화
		//3행 3열 정수로 
		//1~9로 초기화
		
		int[][]arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//형별로 합계출력
		for(int row=0;row <arr.length;row++) {
		
		int sum = 0;
		
		for(int col=0; col < arr[row].length;col++) {
		sum+=arr[row][col];
			}
		System.out.printf("%d행의 합 : %d\n",row , sum);
	}
	System.out.println("=============================");
	
		/*열별로 합출력
		 * for문 안밖을 바꾸면 됨*/
		for (int col =0; col < arr[0].length; col++) {
			
			int sum = 0; 
			
			for(int row = 0; row < arr.length;row++) {
				
				sum+=arr[row][col];//<-핵심(열은 고정 되어 돌아감)
				
			}System.out.printf("%d열의 합 : %d\n", col, sum);
			
		}
		
	
	
	}
	
	public void ex3() {//가변 배열
	//행별 열의 길이 각각 저장
		char [][]arr = new char[4][];
		arr[0]= new char[3];
		arr[1]= new char[4];
		arr[2]= new char[5];
		arr[3]= new char[2];
		
		char ch = 'a';
		for(int row=0;row < arr.length; row++) {
		
			for(int col=0;col < arr[row].length; col++) {
			
				arr[row][col]=ch++;
				
			}
		
		}
		System.out.println(Arrays.deepToString(arr));	
	}
		
	
}	


