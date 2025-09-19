package edu.kh.variable;

public class VariableExample4 {
	public static void main(String[] args) {
		
		/*강제형변환
		 * -기존 자료형을 원하는 잘형으로 강제 변환 시키는것
		 * 
		 * 1. 갓의 범위가 큰 자료현을 값의 범위가 작은 자료형으로 변환할 때
		 * 2.출력되는 데이터의 표기버을 변환시키고 싶을 때
		 * 
		 * 강제형변환 방버
		 * -자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형)을 작성
		 * 
		 * */
		
		double temp = 3.14;
		int num = (int)temp;
		
		System.out.println(num);
		
		//int-> byte
		int iNum = 290;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
		
		//같은 정수형끼리의 변환시에도 값의 범위 차이로 인한 데이터 손실 발생
		
		//char->int 강제형변환
		char ch = 'A';
		System.out.println((int)ch);
		
		//int -> char 강제형변환
		//44085
		int inum3 = 44085;
				System.out.println((char)inum3);
				
		//오버플로우는 컴퓨터가 미리 예측할수 없다->캐발자가 미리 예측해야함.		
		int i6 = 2147483647; //int 형의 최대값
		int resuelt2 = i6 + 1;
		System.out.println(resuelt2);
		

	}

	}


