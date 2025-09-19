package edu.kh.variable;

public class VariableExample2 {

	public static void main(String[] args) {
		
		/*자바의 가본 자료형 8가지
		 * 
		 * 논리형 : boolean 91byte)
		 * 정수형 : byte(1byte, short(2byte),
		 * 			int(byte)....
		 * 실수형:foat(4byte), double (8byte)
		 * 무자형: char(2byte)
		 * 
		 * 참조형- 문자열 String*/
		
		/*변수의 선언 : 메모리에 값을 
		                저장할 공간을 할당하는 것
		변수값 대입 : 변수의 값을 최초로 집어 넣는 것(==초기화)*/
		
		boolean booleanData; //변수의 선언
	  //자료형  변수명
		//메모리에 논리값을 저장할 공간크기을 1byte로 할당(상자 만들기)
		//이름을 booleanData로 정함.(상자이름 정하기)
		
		booleanData = true;//대입,(초기화),(상자 안에 값을 넣음)
		
		System.out.println("booleanData"+booleanData);
		
		//-정수형-
		byte byteDate; //-> 변수의 선언
		// 메모리에 정수값을 저장할 공간크기을 byte 할당
		// 이름을 byteDate로 정함.
		
		byte byteNumber = 127; //-128~+127
		//선언과 대입 초기화
		
		short sNum = 32767; // -32768~32767
		
		//정수자료형의 대표! int
		int iNum = 2147483647;
		
		//리터널 : 변수에 대입되거나 작성되어지는 값 자체.
		// 자료형에 따라 리터럴 표기버이 다름. 
		//그냥 숫자는 int값으로 인식, 리터널 L를 값끝에 붙여야 long
		long lNum = 10000000000l;
		//The literal 10000000000 of type int is out of range 
		// -> 값을 int 로 인식하고 있음. 때문에 L을 붙임.
		// int가 기본형이기때문.
		
		
		//-실수형-
		float fNum = 1.2345f; // 리터널 = f 
		// bouble이 기본형, 때문에 f를 값끝에 붙여 표시함.
		
		double dNum = 3.141592;// 리터널 D를 쓸수는 있음. 
		
		
		//문자형(char) 리터널 표기법 : ' ' 홑따옴표
		//문자 하나만 표시 가능 
		char ch = 'A'; //A는 65
		char ch2 = 66;
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		//---------------------------------------------
		
		//-변수의 명명 규칙-
		
		//1. 대소문자 구분, 길이제한X
		int abcdefg123456789; //G가 다름
		int abcdefG123456789;
		
		//2. 예약어 사용X
		//double final;
		
		//3. 숫자 시작 X 포함은 O
		//char 1abc; -> X
		
		//4. 특수문자 $,_만 가능 근데 안씀
		int $iNum; //문제없음.-는 DB에서 많이 씀. 자바의 상수에서 사용 
		
		//5.카멜표기법 (소문자 시작, 후속 대글자)
		char helloWorldApple;
		
		//6. 변수명은 한글도 됨. 하지만 않씀 관습에 X
		//-----------------------------------------------
		
		final double PI_VALUE = 3.14;
		
		//PI_VALUE = 2.23;
		
		/*상수
		 * 항상 같은 수, 변수의 한종류, 변수지만 변수라고 잘 말하지 않음. 
		 * 재대입이 안된다.
		 * 자료형앞에 final를 작성
		 * 상수의 명명 규칙 : 모두 대문자, 단어구분시 _사용
		 * 
		 * 상수를 사용하는 경우
		 * 1.변하면 않되는 고정돤 값을 저장할때
		 * 2. 특정한 값에 의미를 부여한 경우 MIN_AGE = 1;,MAX_AGE = 130;
		 * 									LEFT_MOVE = -1;,RIGHT = 1;
		 * */
		
		
		
		
		
		
		
	}

}
