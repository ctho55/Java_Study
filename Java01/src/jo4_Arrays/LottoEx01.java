package j04_array;

import java.util.Arrays;
import java.util.Random;
// LOtto 번호 생성기 
// 1.6개의 정수를 담을 수 있는 Lotto 배열을 만든다. 
// 2. 1~45의 서로다른 정수를 Random을 이용해서 생성해서 초기화 한다. 
// 3. 출력하기 
// => Lotto 번호 생성기 만들기 

public class LottoEx01 {

	public static void main(String[] args) {
	
		//1. 6개 정수를 담는 배열 생성
		
		int lotto [] = new int [6] ;
		Random rn = new Random();
		for(int i = 0 ; i < lotto.length ; i++) {
			Lotto[i]= rn.nextInt(45)+1;
		}
		if(lotto[i] == lotto[i])
		
		/*
		int [][] Lotto = new int [4][5] ;
		
		//2. 1~45의 서로다른 정수 Random 생성 초기화 
		Random rn = new Random();
		//2-1 반복문으로 초기화
		
		for(int i = 0 ; i< Lotto.length ; i++) {
			for(int j =0 ; j < Lotto[i].length; j++) {
				Lotto[i][j]= rn.nextInt(45)+1;
				//2-2 중복확인
				if(Lotto[i][j]==Lotto[i][j]) {
					--i; --j; 
					break;
				}// if
			}// for j
		}// for i
		*/
		
		
		//3 . 출력하기
		System.out.println(Arrays.toString(Lotto));
	}//main

}//class
