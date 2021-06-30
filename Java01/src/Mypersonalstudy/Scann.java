package Mypersonalstudy;

import java.util.Scanner;

public class Scann {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("두자리의 정수를 입력해주세여");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		
		
		System.out.println("입력내용"+input);
		System.out.printf("num = %d%n",num) ;
	}

}
