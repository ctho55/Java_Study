package j04_array;

import java.util.Random;

//과제 
// Lotto 배열 2개를 준비
// 하나는 당첨번호 만들기 하나는 mynumber
// 중복확인 배열졍렬 당첨확인 시키기

//*** Random 클래스
//=> java.util 에 있으므로 import 와 new 선언 필요함.
//=> Random() : 호출시마다 현재시간을 이용한 종자값이 자동 설정됨 
//  Random(long seed) : 인자값으로 주어진 종자값이 설정됨 
//  종자값 : 난수 만드는 알고리즘에서 사용되는 값
//    ( 같으면 같은난수 얻음 )
//
//=> Random().nextInt(큰수 - 작은수 + 1) + 작은수 
//  Random().nextInt() , Random().nextLong() , Random().nextBoolean()
//  Random().nextDouble() ,  Random().nextFloat()
public class LottoEx03 {

	public static void main(String[] args) {
		int lotto [], mylotto[] = new int [6];
			Random rn = new Random();
			for(int i =0 ; i < mylotto.length ; i++) {
				mylotto[i] = rn.nextInt();
			}
		
	}

}
