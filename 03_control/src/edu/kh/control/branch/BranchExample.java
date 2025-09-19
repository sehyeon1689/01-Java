package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	public void ex1() {//break문
		
		// 1부터 10 까지 출력
		//단, 5는 종료
		//1 2 3 4 5
		
		
		for(int i = 1; i <=10; i++) {
			
			System.out.print(i + " ");
			
			if(i==5) {
				break;
			}
			
		}
		
	}
	
	public void ex2() {
		
		//입력 받은 모든 문자열을 누적 시키겠다.
		//단, "esit@"를 만나면 종료하고 출력
		
		Scanner sc = new Scanner (System.in);
		
		String str =" ";
		
		while(true) {
			
			System.out.print
			("문자열입력(exit@ 입력시 종료) : ");
			String input = sc.nextLine();//공백포함,한줄
			
			
			
			//자바에서 문자 비교는 
			
			//String은 참조형
			//equals() -->문자열1. euals(문자열2)
			// 같으면 참, 같지않으면 거짓 
			//boolean 값으로 나옴.
			if (input.equals("exit@")) {
				break;
			}
			
			str += input + "\n";
			
		}
		System.out.println("=================");
		System.out.print(str);
		
		
	}
	
	public void ex3() {//continue문
		
		//1~10 까지 출력
		//단, 3의 배수는 제외
		//1 2 4 5 7 8 10
		
		for(int i =1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print( i + " ");
			
		}
		
	}
	
	public void ex4() {//문제
		//1~100까지 출력
		//단, 5의 배수는 X
		//40이 되면 멈춤(예외 먼자
		
		for(int i = 1 ; i <= 100; i++) {
			
			if (i == 40) {
				break;
			}
			
			if (i % 5 == 0) {
				continue;
			}
			
			
			System.out.println(i);
			
		}
		
	}
	

	public void RSPGame() {//가위바위보 게임
		
		
		/* 1.몇판인지 입력 받아 그만큼 반복하고, 
		     몇번째게임인지 표시후, 플레이어의 수를 입력 받음. */
		
		
		/* 2.랜덤 : Math.radom() : 0.0 ~1.0 사이 난수 생성
		     1~3 사이 난수 로 바꿔야함
		     1=가위,2=바위,3=보*/
		
		
		/* 3.컴퓨터와 플레이어 수에따른 승부 판별
		     플레이어 승! / 졌습니다 ㅠㅠ / 비겼습니다*/
		
		
		// 4.매판 마다 - 현재기록 : ?승 ?무 ? 패  출력
		

// 1. -------------------------------------------------------
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("[가위 바위 보 게임~!!!]");
		System.out.print("몇판? : ");
		int round = sc.nextInt();
		
		//승패기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i =1; i <= round; i++) {//몇판반복
			
			System.out.println("\n"+i+"번째 겜");
			System.out.print("수입력: ");
			String input = sc.next();
			
// 2. ------------------------------------------------------ 
			
			int random = (int)(Math.random()*3+1 );
			//0.0~1.0사이의 결과<--??????
			//0.0<=x<0.1---->x에 *3+1
			
			
			//스위치switch로 random랜덤값을 문자열로 바꾸기
			String com = null;
			//null : 아무것도 참조하고 있지 않음.강의03:05:00
			
			switch(random ) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;	
			}
			
// 3. -----------------------------------------------------		
			
			/*//승패기록용 변수
			int win = 0;
			int draw = 0;
			int lose = 0;
			
			if변수 밖에 써야한다. 그래야 프린트 가능
			*/
			
			System.out.printf("컴퓨터는 [%s]\n",com);
			//컴과 플레이어 수 판별
			
			if( input.equals(com) ) {//무승부인 경우
				System.out.println("비김.");
				draw++;
				
			}else {//이기거나 진 경우
			boolean win1 = input.equals("가위")&&
					com.equals("보");
			
			boolean win2 = input.equals("바위")&&
					com.equals("가위");
			
			boolean win3 = input.equals("보")&&
					com.equals("바위");
			
			if (win1 || win2 ||win3 ) {
				
				System.out.println("플레이어 승!");
				win++;
				
			}else {
				System.out.println("졌으");
				lose++;
			}
			
		}//if 끝
			
// 4. ----------------------------------------------------		
			
		System.out.printf("%d승 %d무 %d패\n",win, draw, lose);
		//여기쓰면 매판 반복되고 업뎃이 안됨
	}
		//System.out.printf("%d승 %d무 %d패\n",win, draw, lose);
	//프린트문을 여기에 써야 승패용기록 변수가 인식이 된다.
	}
	
	public void RSPGmae2() {
		
		
		
	}




}
