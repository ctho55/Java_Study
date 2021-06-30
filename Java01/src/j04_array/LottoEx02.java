package j04_array;

import java.util.Arrays;
import java.util.Random;

// 찾기(search) & 정렬(sort) 알고리즘 !
// 3. 오름차순정렬 (Sort)
// => 순차정렬 (Sequence Sort)
// => 정렬 알고리즘에서 가장 간단하고 기본이되는 알고리즘으로
//    배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘
// ** 정렬 알고리즘 : 삽입(insert)정렬, 합병(Merge)정렬, 퀵(Quick)정렬...
// => https://blog.naver.com/tepet/221690306235

public class LottoEx02 {

	public static void main(String[] args) {
		//1. 배열 정의	
		int[] Lotto = new int [6] ; 
		Random rn = new Random();
		//2. Lotto 번호 생성 & 중복확인 (search)
		for(int i = 0 ; i < Lotto.length; i++) {
			Lotto[i] = rn.nextInt(45)+1;
			for(int j = 0 ; j < i ; j++ ) {
				if(Lotto[i] == Lotto[j]) {
					--i; break ;
				}//if
			}//for j
		}//for i
		System.out.println("Lotto 정렬전 ="+ Arrays.toString(Lotto));
		// 오름차순 정렬
		
		for(int i = 0 ; i < Lotto.length ; i++) {
			for(int j =i+1; j<Lotto.length ; j++) {
				if(Lotto[i]>Lotto[j]) { //오름차순 맞바꾸기
			//  if(Lotto[i]<Lotto[j]) { //내림차순 맞바꾸기
					
					// 치환
					int tmp = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = tmp ;
				}
			}
		}
		System.out.println("Lotto 정렬후 ="+ Arrays.toString(Lotto));
		
		int[] Lotto2 = {34,23,36,10,15,8};
		Arrays.sort(Lotto2);
		if(Arrays.equals(Lotto, Lotto2))//인덱스별로 동일성 비교
		System.out.println("당첨");
		
		else System.out.println("꽝");
	}

}
