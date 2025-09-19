package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
//배열

	public void ex1() {
		/*
		 * 배열 :같은 종류의 데이터를 한 줄로 정리해서 저장하는 상자들 한 묶음
		 * 
		 * [ 배열의 특징 ]
		 * 
		 * 1. 한 가지 자료형만 저장 가능하다.
		 * 
		 * 2. 여러 값을 저장할 수 있다.
		 * 
		 * 3. 한 번 크기를 지정하면 변경 불가능하다.
		 * 
		 */
		// heap과 과련 됨.

		int[] score = new int[5];
		// 자료형[]이름 = new 자료형 {크기]
		// 배열 선언 = 할당

		// 인덱스 번호(상자 번호) 0에서 시작
		score[0] = 1;// 첫번째 상자에 1넣음.

		/*
		 * 할당? : 정장할값을 메모리Heap에 생성
		 * 
		 * 
		 * 
		 * 
		 * 배열 선언 : 메모리Stack에 배열변수 생성.
		 * 
		 */

		// 변수 vs 배열
		// 변수선언
		int num;
		/*
		 * 지역변수 Stack영역에 int자료형을 정장할수 있는 공간 4바이트를 할당,이름은 넘
		 */
		/*
		 * 변수의 선언은 Stack 영역에 int 4바이트짜리 상자가 생기고, 이름은 넘으로 생성된다.
		 */

		/* 변수의 대입 */
		num = 10;
		/* 생성된 상자에 10 값을 넣겠다 */
		// 변수사용
		System.out.println("num에 저장된 값 : " + num);
//-----------------------------------------------------------------------

		// 배열의 선언
		int arr[];
		// & int [] arr;
		/*
		 * Stack 영역에 int[] 자료형 4바이트 짜리 박스을 할당하고, 그 공간에 arr이라는 이름을 부여함.
		 * 
		 * arr은 참조형으로 주소값만을 저장 가능 참조형은 주소값 4바이트 공간 ->실제 값이 아니라 스텍엔 숫자만 저장 되기 때문에 힙에 주소만
		 * 저장 하고 실제 값은 힙에 있다.때문에 arr만 참조형이다.
		 * 
		 * 
		 */

		// 배열 할당
		arr = new int[3];

		/*
		 * new : "new 연산자"라고하며 힙에 새로운 공간(배열, 객체)을 할당한다고 함.
		 */
		/*
		 * int [3] : int자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		 * 
		 * new int[3] : 힙에
		 */

		// JVM기본으로 힙에는 배열 상자들에 기본값들이 자동적으로 같이 생성 비여있지X
		// boolean : false
		// 나머지 : 0
		// 참조형 : null,
		// int: 다 0

		// --Stack에 저장된 주소값--
		System.out.println("arr :" + arr);
		// arr :[I@7e9a5fbe

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// 기본값 0

		// 값 대입
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 100;
		// arr[3]=500;
		// 4번째칸은 없음 , 실행시키면 애러뜸, 배열 인덱스 범위 예외
		// 컴파일 에러: 코드 작성 중 빨간색 에러
		// 런타임 에러: 실행 시키면 그때 에러 뜸

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// Arrays.toString(배열명); 한번에 배열에 모든 값을 표시할 때 (Sting형)
		// [10, 50, 100]
		System.out.println(Arrays.toString(arr));

	}

//---------------------------------------------------------------	
	public void ex2() {// 선언 및 할당 방법들

		/*
		 * - 선언: 변수 만들기 - 초기화: 만들면서 값 넣기 - 대입: 이미 있는 변수에 값 넣기 - 할당: 메모리에 값 저장 (대입과 유사)
		 * 
		 */

		int[] arr = new int[4];
		// 현재 상자들0~3 값은 다 0임

		int[] arrr = new int[] { 100, 200, 300, 400 };

		/*--for문을 이용한 초기화--
		
		ex) 
		for(int i = 0; i < arr.length; i++) {
		
		arr[i] = i;
		
		}
		
		*배열의 길이(몇칸인가) : 배열명.length  ??
		*/
		System.out.println("배열의 길이 : " + arr.length);
		// 출력
		for (int i = 0; i < arr.length; i++) {

			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}

		/*--선언과 동시에 초기화--
		
		ex) int[] arr = {1, 2, 3, 4, 5};
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		String fruit[] = {"사과", "포도", "참외"};*/

		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr2));// 전체 값

	}

	public void ex3() {

		// 5명의 키를cm 입력 받고 평균구하기

		/*
		 * 1번 키 입력 : ***.* 평균 : **
		 */

		Scanner sc = new Scanner(System.in);

		double sum = 0;// 합계누적

		double[] height = new double[5];
		// 배열의 값 대입 반복문
		for (int i = 0; i < height.length; i++) {

			System.out.print((i + 1) + "번키 입력 : ");
			height[i] = sc.nextDouble();
			// heigth[0] = 170.2;

			sum += height[i];

		}
		System.out.printf("평균 : %.2f cm", sum / height.length);

	}

	public void ex4() {// 문제

		// 입력 받은 인원 수 만큼 점수에 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균 출력

		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100

		// 합계 : 290
		// 평균 : 72.5

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 인원 수 : ");
		int num = sc.nextInt();

		int height[] = new int[num];

		int sum = 0;

		for (int i = 0; i < height.length; i++) {
			System.out.print((i + 1) + "번 점수 입력 : ");
			height[i] = sc.nextInt();
			sum += height[i];

		}
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f", (double) sum / height.length);

	}

	public void ex5() {// 점심 메뉴 뽑기 프로그램

		String[] arr = { "김밥", "서ㅡ웨이", "햄버거", "백반", "국밥", "짜장면" };

		System.out.println("오늘 점심 메뉴 : " + arr[(int) (Math.random() * 6)]);

	}

	public void	ex6() {//배열을 이용한 검색 flag사용???/
		/*입력 받은 정수가 배열에 있는지 확인
		 * 만약 있다면 읻ㄱ스 몇번째에 존재 하는 지출력*/
		/*ex)
		 * 정수 입력 : 200 
		 * 1번째 인덱스에 존재
		 * 
		 *  존재하지 않음 */
		Scanner sc = new Scanner (System.in);
		int [] arr = {100,200,300,400,500,600,700,800,900,1000};
		System.out.print("정수 입력 : ");
		int height = sc.nextInt();
		System.out.printf(((arr+1)+"번째 인덱스에 존재");
		
	}

	public void ex7() {// 배열을 이용한 검색 flag사용
		// 과일 검색

		/*
		 * "사과" ,"딸기","바나나","키위","멜론","아보카도"를 입력을 받아서, 몇번째 인덱스에 존재하는지 프린트하고, 그밖의 값은
		 * 존재X라고 프린트
		 * 
		 * ex0) 과일 입력 : 사과 0번째 인덱스에 존재
		 * 
		 * 과일 입력 : 과자 인덱스에 존제하지 않음./
		 * 
		 * 
		 * /*String [] arr = { "사과" ,"딸기","바나나","키위","멜론","아보카도" }; Scanner sc = new
		 * Scanner (System.in); System.out.print("과일 입력 : "); String input = sc.next();
		 * boolean flag =true;
		 * 
		 * for (int i =0; i < arr.length ; i++) { if(input.equals(arr[i])) { //문자열 비교
		 * System.out.print(i + "번째 인덱스에 존재"); flag = false;
		 * 
		 * } } if (flag) { System.out.println("존재X"); }
		 */
		Scanner sc = new Scanner(System.in);
		String input[] = { "사과", "딸기", "바나나", "키위", "멜론", "아보카도" };
		boolean flag = true;// 깃발 역할
		System.out.print("과일 입력 : ");
		String frt = sc.next();

		for (int i = 0; i < frt.length(); i++) {
			// 입력 값이 올바를 때
			if (frt.equals(input[i])) {
				System.out.println(i + "번째 인덱스에 존재");
				flag = false;// 여기가 거짓라는 것을 표시하는 깃발
			}

		} // 입력값이 배열값 밖일 때
		if (flag) {
			System.out.println("존재하지 않습니다.");
		}

	}

	public void	ex8() {
		
		//문자열에 값이 몇개 있는지
		/*
		 * ex)
		 * 문자열 입력 : hello
		 * [h, e, l, l, o]
		 * 2개있음 / 존재하지 않음
		 * 
		 * 
		 * 1.문자열을 이력 받아 한글자씩 잘라내어 
		 *   char배열에 순서대로 저장
		 * 2.문자하나를 입력받아 일치하는 문자가 
		 *   몇개 존재하는 지 확인
		 * 3.단, 없으면 존재X
		 * 
		 * -사용해야하는 가술, 기능-
		 * 1. 배열검색
		 * 2. 문자열길이 구하기 : String.length()
		 *                        "hello'.length()-> 5
		 * 3. String. charAt(index) : 문자열애서 특정 index에
		 *                           위치한 문자 하나 얻어옴.
		 *                           "hello'.charAt(1)-> e
		 * 4. count (숫자세기)
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		//1-1. 입력받은 문자열 길이만큼의 char배열 선언 및 할당하기
		char[] arr = new char[input.length()];
		//1-2. 입력한 문자열을 한글자씩 char에 순서대로 대입하기
		for (int i = 0; i < arr.length; i++) {//String. charAt(index)이용
			
			arr[i]=input.charAt(i);
			//첫번째 반복 arr[0]='h';
			//두번째 반복 arr[1]='e';
			//세번째 반복 arr[2]='l';
			//....o까지
		}
		System.out.println(Arrays.toString(arr));
	
	
	  
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
