package edu.kh.variable;

import javax.annotation.processing.SupportedSourceVersion;

//class: 코드를 작성하는 곳
public class VariablExample1 {

	public static void main(String[] args) {
		
		//변수 미사용
		System.out.println(2*3.140592653589793*5);//원의 둘레
		System.out.println(3.141591653589793*5*5);//원의 넓이
		System.out.println(3.141591653589793*5*5*20);
		//원기둥의 부피
	    System.out.println(4*3.141591653589793*5*5);//구의 겉넓이
	    
	    //변수 사용
	    double pi = 3.141591653589793; /*원주율 대입연산자 파이라는 상자에
	    3.14를 넣는다. 더블은 소수점을 넣을 수 있다.*/
	    int r = 5; /*반지름 r, int 정수값만 넣을수있음*/
	    int h = 20; // 높이h
	    System.out.println(2*pi*r);//원의 둘레
	    System.out.println(pi*r*r);//원의 넓이
	    System.out.println(pi*r*r*h); //원기둥의 부피
	    System.out.println(4*pi*r*r); //구의 겉넓이
	    
	    /* 변수 (Variable)
	     * -메모리에ㅔ 겂을 기록하는 공간
	     * -> 공간에 가록되는 값이 변할 수 있어서 변수
	     * -여러 종류 존재(저장되는 값의 형태, 크기가 다름)
	     * 
	     * 변수사용의 장점
	     * 1. 가독성 증가
	     * 2. 재사용성 증가(합번 만든 변수를 계속 사용 가능)
	     * 3. 코드 길이 감소
	     * 4. 유지보수성 증가(코드수정간단)
	     * */

	}

}
