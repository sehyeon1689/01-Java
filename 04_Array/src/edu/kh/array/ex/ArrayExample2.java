package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	
	public void	shallowCopy() {//배열 얕은 복사
		
		//얕은 복사
		/*주소값만 복사
		 * 
		 * 
		 * 
		 * 깊은 복사
		 * 데이터를 복사
		 * 데이터 그대로 다른 묶음 집이 하나더 생성
		 * 근데 주소는 다름
		 * 때문에 복사본을 변경해도 원본은 그대로 유지
		 * 
		 * */
		
		/*얕은 복사
		 * ->주소를 복사하여 원본을 참조*/
		
		int [] arr = {1, 2, 3, 4, 5,};
		
		//얕은 보사 진행
		int [] copyArr = arr;
		
		System.out.println("arr 주소"+arr);
		System.out.println("copyArr 주소"+copyArr);
		System.out.println("arr 요소"+arr);
		System.out.println("copyArr 요소"+ Arrays.toString(copyArr));
		
		copyArr[2]=999;
		System.out.println("변경후");
		
		
		
		
	}
	public void	deepCopy() {//깊은 복사
		int[] arr = {1,2,3,4,5};//원본
		//1.for문 이용
		int[] copyArr = new int [arr.length];
		
		for(int i=0; i < arr.length;i++) {
			copyArr[i] = arr [i];
			
			
		}
		
		System.out.println("arr 주소 : " + arr);
		System.out.println("copyArr 주소 : " + copyArr);
		
		System.out.println("arr값: " + Arrays.toString(arr));
		System.out.println("copyArr값: " + Arrays.toString(copyArr));
		
		//2. System.arrycopy(원본배열명, 원본복사 시작 인덱스,
		//				복사할 배열명, 복사배열의 삽입 시작 인덱스,
		//              복사길이);     
		
		int[]copyArr2 = new int [arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, arr.length);
		
		System.out.println("copyArr2값: " + Arrays.toString(copyArr2));
		
		//3. 복사할 참조변수 = Arrays.copyOf(원본배열명, 복사할 길이);
		int[] copyArr3 = Arrays.copyOf(arr,arr.length);
	    System.out.println("copyArr3값: " + Arrays.toString(copyArr3));
		
	    
	  //값변경후 확인
	  		copyArr[2] = 0; 
	  		copyArr2[2] = 999; 
			copyArr3[2] = 5000; 
			
		System.out.println("arr : " + Arrays.toString(copyArr));	
		System.out.println("arr 2: " + Arrays.toString(copyArr2));
		System.out.println("arr 3: " + Arrays.toString(copyArr3));
	}
	public void createLottoNumber() {//로또번호생성기
		//배열을 이묭한 중복데이터 제거 + 정렬
		//1. 1~45 사이 중복되지 않은 난수 6개 생성
		//2. 생성돤 닌수를 오름차슨 정렬
		//
		
		
		int [] lotto = new int [6];
		
		for(int i = 0; i <lotto.length ;i++) {
			
			int random = (int)(Math.random()*45+1);
			
			lotto[i] = random;
			
			for (int x =0; x < i; x++) {
				
				if (random == lotto[x]) {
					i--;
					break;
					
					
				}
				
			}
			
			
		}
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
