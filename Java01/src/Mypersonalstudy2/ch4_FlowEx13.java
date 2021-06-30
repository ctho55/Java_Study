package Mypersonalstudy2;

import java.util.Scanner;

public class ch4_FlowEx13 {

	public static void main(String[] args) {
		// 별찍기
		//* 을 출력할 라인수를 입력하시요
		int num = 0;
		System.out.println("* 을 출력할 라인수를 입력하시요");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		sc.close();
		
		for(int i = 1; i<= num;i++) {
			for(int j =1 ; j <= i ;j++ ) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
}
