package edu.kh.op.practice;

//기능제공용
import java.util.Scanner;//ctrl + shift + o: 자동 임포트

public class OperratorPractice {
	
	//깃허브에서 강사님 코드 해설 한번더 정확히 봅시다.
	
	//              메서드명
	    public void practice1() {//<-??
		
		//실습문제1
		/*모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
	      1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	      
	      
	      [실행화면]
	        인원 수 : 29
			사탕 개수 : 100
			1인당 사탕 개수 : 3
			남는 사탕 개수 : 13
			
	      */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int input = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.print("1인당 사탕 개수 : ");
		System.out.println(input2 / input);
		//System.out.println("1인당 상탕 걔수 : %d\n", input2 / input);
		System.out.print("남는 사탕 개수 : ");
		System.out.println(input2 % input);
		
		
		//입력받아 = 스캐너
		
	}
		
		
		public void practice2(){
			
			
			//실습문제2
			/*키보드로 입력 받은 값들을 변수에 기록하고 
			  저장된 변수 값을 화면에 출력하여 확인하세요.
			  
			  ex)
				이름 : 홍길동
				학년(정수만) : 3
				반(정수만) : 4
				번호(정수만) : 15
				성별(남학생/여학생) : 남학생
				성적(소수점 아래 둘째 자리까지) : 85.75
				
				3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
			  
			  */
		
			
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			String input = sc.next();
			System.out.print("학년(정수만) : ");
			int input2 = sc.nextInt();
			System.out.print("반(정수만) : ");
			int input3 = sc.nextInt();
			System.out.print("번호(정수만) : ");
			int input4 = sc.nextInt();
			System.out.print("성별(남학생/여학생) : ");
			String input5 = sc.next();
			System.out.print
			("성적(소수점 아래 둘째 자리까지) : ");
			float input6 = sc.nextFloat();
			
			System.out.println(" ");
			
			System.out.println
			(input2 + "학년 " + input3 + "반 " + input4 + 
			"번 " + input + " " + input5 + "의 성적은 " + 
			input6 + "이다.");
			
		
			//스케너 필요, 기계만듬.
			/*두번쨰로 ㅅ캐너를 만들 땐 발간줄이 안뜸. 
			 왜냐 이미 있기때문
			 
			 nextint는 문자에 개행까지 있다.입력버퍼에 개행이 남아 있음.
			 성별자리 
			 System.out.print("성별(남학생/여학생) : ");
			String input5 = sc.next();
			
			System.out.print("성별(남학생/여학생) : ");
			String input5 = sc.nextline();  라인을 써도되는데 ,
			
			System.out.println(" "); 개행문자 제거용 써야함.
			
			마자막 프린트F는 힘듦.
			System.out.println("%d학년 %d반 %d번 %s %s의 성적은 %s.2f이다 ",
			input? ,input2?,input?,input?,input?);  <---??/
			 
			 */
			
			
			
			
			
		}
		
		
		
		public void practice3() {
			
		
		//실습문제3
		/*국어, 영어, 수학에 대한 점수를 키보드를 이용해 
		  정수로 입력 받고,세 과목에 대한 합계
		  (국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		  
		 [실행화면]
			국어 : 60
			영어 : 80
			수학 : 40
			
			합계 : 180
			평균 : 60.0 
			
			*/
			
			Scanner sc = new Scanner(System.in);
			System.out.print("국어 : ");
			int gm = sc.nextInt();
			System.out.print("영어 : ");
			int gm2 = sc.nextInt();
			System.out.print("수학 : ");
			int gm3 = sc.nextInt();
			
			System.out.println(" ");
			
			System.out.print("합계 : ");
			System.out.println((gm+gm2+gm3));
			
			System.out.print("평균 : " + ((gm+gm2+gm3)/3.0));
			
			/*int sum =  상자들의 합계
			 * doulbe avg = sum / 3.0
			 * 
			 * System.out.println("합계 : " + sum);
			 * System.out.printf("합계 : .1f", avg);*/
			

			/*기계 만들고, 
			  프린드구문 만들고 정수값*/
			
			/*각 과 목이 40 이상이고,
			 *  평균 60점 이상이여야 하격
			 *  긔 외 ㅜㄹ합격 출력
			 *  
			 *  */
			
			/*boolean result = ( kor >= 40 && (eng >= 40) &&
								( math >= 40) && (avg >= 60);*/
			//System.out.println(result ? "합격" : " 불합격");
			//                   함수도 조건식이다.!!!
			
			
			
		
}
		
	}


