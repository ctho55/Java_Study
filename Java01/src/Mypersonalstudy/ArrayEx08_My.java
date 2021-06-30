package Mypersonalstudy;

public class ArrayEx08_My {

	public static void main(String[] args) {
		int[] numarr = new int[10];
		for (int i = 0; i < numarr.length; i++) {
			numarr[i] = i; // 배열을 0~9의 숫자로 초기화 한다.
			System.out.println(numarr[i]);
		} // for
			System.out.println("");
			
			for (int i = 0 ; i < 100 ; i++) {
				int n = (int)(Math.random() * 10) ;// 0~9중의 한 값을 임의로 얻는다.
				int temp = numarr[0];
				numarr[0] = numarr[n];
				numarr[n] = temp ;
			} //for 섞는다. 
			for (int i = 0; i < numarr.length ; i++) {
				System.out.println(numarr[i]);
			}// for 출력 
	}// main

}// class
