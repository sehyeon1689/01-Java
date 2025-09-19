package edu.kh.op.ex;

import java.util.Scanner;

//예제코드 작성용 클래스 (기능용/메서드용) 새로운 설계도 정의 하겠다.
public class OpExample {
	
	/*기능들만 모아둔 곳 == 메서드(기능,설계도)들만 */
	// ex1() method
	public void ex1() {
		System.out.println("안녕!");
		
	}
	
	public void  ex2() {
		System.out.println("점심뭐먹지");
	}
	
	//메서드 명은 소문자로 시작
	public void testEx1() {
		//증감 연산자: ++,--
		// 1을 증감하는는 연산자
		//=도 연산  후위에서주의
		
		int iNum1 = 10;
		int iNum2 = 10;
		iNum1++;
		iNum2--;//변수에 넣지 않아도 됌
		System.out.println("iNum1  : " +iNum1);
		System.out.println("iNum2  : " +iNum2);
		
		//전위연산
		int temp1 = 5;
		
		System.out.println(++temp1 + 5);//11
		//후위 연산
		int temp2 = 3;
		
		System.out.println( temp2-- + 2);//
							//3-- + 2 -> 5
							//3-- -> 2
		
		
		
		
	}
	
	public void testEx2() {
		
		
		/*비교연산자:
		  값은 참과 거짓.
		 * */
		int a =10;
		int b = 20;
		
		System.out.println((a ==b) == false );//true
							//(f)==f
							// true
		
		int c = 4;
		int d = 5;
		
		System.out.println( (++c != d) == (--c != d) );
		//                  (++4 != 5) == (--5 != 5)  *앞괄호에서 C는 5로 먼저바뀜. 우선순위 괄호 먼저
		//   				(5   != 5) == (4   != 5)
		// 					(false)    == (true)
		//					false
		
		System.out.println( 100 > 99);//true
		System.out.println( 100 >= 100);//true
		System.out.println( 99 < 64);// false
		System.out.println( 99 <= 100);// true
		
		//논리 연산자
		// shift +  \\ = ||
		//
	}
	
	public void testEx3() {
		
		//논리연산자: &&(AND), ||(OR)
		/*AND : 와, 그리고, 면서, 부터, 까지, 사이
		        모두 true면 T*/
		
		int a = 101;
		// a는 100 이사이면서 짝수인가?
		System.out.println( ( a >= 100) && ( a % 2 == 0));//F
		//                     T                 F
		
		int b = 5;
		//b는 1부터 0까지  숫자범위에 포함되어 있는가?
		//1~10 -> b는 1보다 크거나 같으면서, 10보다 작거나 같다.
		System.out.println((b >= 1) && (b<= 10));
		
		
		// || (OR): 둘다 F이면 F
		//또는 혹은 거나
		
		int c =10;
		// c는 10을 초과허거나 짝수인가?
		System.out.println( (c > 10) || (c % 2 == 0) );
		//                     F             T
		
		
		
	}
	
	public void testEx4(){
		//삼항 연산자: 조건식 ?, T일때 수행될 값: F일때 수행될 값
		/*조건식에는 참, 거짓으로 나와야함. */
		
		int num = 30;//여기 바꾸면 참,거짓이 바뀜.
		
		// num이 30 보다 크면 "num은 30보다 큰수이다."
		// 아니면 "num은 30 이하의 수이다" 출력하십쇼.
		
		String result = num > 30 ? "num은 30보다 큰수이다.": "num은 30 이하의 수이다.";
		System.out.println(result);
	
	//------------------------------------------------------------------

			
			//입역받은 정수가 음수인지 양수인지 구분
			//단, 0은 양수로 처리
			
			/* ex)
			 * 정수 입력 : 4
			 * 양수입니다.
			 * --------------
			 * 정수입력 : -5
			 * 음수 입니다*/
			

		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		String result2 = input >= 0 ? "양수입니다.": "음수입니다.";
		
		System.out.println(result2);
	
	}


	
	public void testEx5(){
		//목합대입 연산자
		// +=, -=, *=, /=, %=
		
		int a =10;
		// a=a+10;
		a +=10;
		System.out.println(a);//20
		
		int b =20;
		///b = b - 10;
		b -= 10;
		System.out.println(b);
		
		
		//부정연산자; ! 논리값 앞에 붙인다.
		//논리값을 반대로 적용 하는 것.
		
		System.out.println(!true);// false
		
		System.out.println(!(10 != 10));
		
		
		//비트 단위 부정 연산자 
		//
		int c= 5; 
		System.out.println(~c);
		
	
	
	
	
	
	
	
	
	
	
	
	}}
		
		
	
		
	
	
	
	
	
	
	
	
	
	