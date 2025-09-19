package edu.kh.basic;

// 
public class JavaTest {

	// main 메서드 : 애블리케이션 실행에 필요한 구문
	
	//main 작성 후 ctrl + space -> 엔터 자동완성
	public static void main(String[] args) {
	// 메인 메서드 안에 작성한 코드를 실행시키는 방법
		// 1. 단축키:ctrl + F11
		// 2. 상단에 초록색 재생 버튼
		System.out.println("Hello Worid!!!");
		//syso 작성후 ctrl + space -> enter 자동완성
		// 저장단축키 ctrl + s
		System.out.println("hii");
		System.out.println();//개행만 실행
		System.out.println("한글");
		System.out.println(1234);
		
		
		//ctrl +alt + 위아래방향키
		//: 방향키 방향으로 줄 복사
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
				
		
		//숫자연산
		System.out.println("1+2");//1+2
		System.out.println(1+2);//3
		//쌍따옴표는 문안에 작성된 코드 문자열로 인식
		//이외 코드는 숫자나 변수로 인식
		System.out.println(50-23);
		System.out.println(12 * 13);
		System.out.println(300/5);
		System.out.println(12%2);//%는 모듈러 나머지값
		
		//""(문자열) + 숫자를 같이 쓰면 : 이어쓰기
		// +이어쓰기의 기능
		// 숫자+숫자 : 더하기 연산
		System.out.println("14*19="+ 14*19);
		
		//자바는 사칙연산의 우선순위를 그대로 따름,*는 먼저
		//->우선계선을 원하면 괄호사용
		System.out.println("90+70+60="+(90+70+60));
		System.out.println("90+70+60="+90+70+60);
		System.out.println("A"+"B"+"형");
		
		
		
	}
}
