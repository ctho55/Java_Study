package j05_classMethod;

import java.util.Arrays;
import java.util.Random;

//LottoEx02.java 의 Sort 부분을 매서드로 만들기
// 매서드 명=> mySort

public class Ex03_CallbyREf {

	
	public void mySort(int [] lo){
	
		for(int i = 0 ; i < lo.length ; i++) {
			for(int j =i+1; j<lo.length ; j++) {
				if(lo[i]>lo[j]) { //오름차순 맞바꾸기
			//  if(lotto[i]<lotto[j]) { //내림차순 맞바꾸기
					
					// 치환
					int tmp = lo[i];
					lo[i] = lo[j];
					lo[j] = tmp ;
				}
			}
		}
		
	}//mysort
	
	public static void main(String[] args) {
		//1. 로또 만들기
		// 배열생성, 랜덤, 중복확인, 정렬 출력
		 int lotto [] = new int [6];
		
		Random rn = new Random();
		
		for(int i= 0 ; i < lotto.length; i ++) {
			lotto [i] = rn.nextInt(45)+1;
		}// 배열에 난수 넣기
		
		for(int i=0 ; i < lotto.length ; i++) {
			for(int j=0 ; j< i ; j++) {
				if(lotto[i] == lotto[j]) {
					--i; break;
				}
			}
		}// 중복확인
		 System.out.println(Arrays.toString(lotto));
		 
		 Ex03_CallbyREf ex03 = new Ex03_CallbyREf();
		 ex03.mySort(lotto);//정렬
		  
		 
		  System.out.println(Arrays.toString(lotto));
		  //출력
	}

}
