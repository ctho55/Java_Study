package Mypersonalstudy;

public class ArrayEx8_My_rotto {

	public static void main(String[] args) {
		// 45개의 정수값을 저장하는 배열 생성
		int[] rotto = new int [45];
		// 배열의 각 요소에 1~45의 값을 저장한다.
		for(int i =0 ; i< rotto.length ; i++ ) {
			rotto[i] = i+1 ;
		}
		//두값을 바꾸는데 사용할 임시변수
		int tmp ; 
		// 임의의 값을 얻어서 저장할 변수
		int j = 0 ;
		// 값을 섞는다.
		for(int i= 0 ; i < 6 ; i++) {
			j = (int)(Math.random()*45) ;
			tmp = rotto[i];
			rotto[i] = rotto[j];
			rotto[j] = tmp ;
		}
		// 6개의 번호를 출력한다.
		for(int i =0 ; i < 6 ; i++) {
			System.out.println(rotto[i]);	
			
		}
	}// main

}// class
