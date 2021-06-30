package Mypersonalstudy2;

import java.util.Random;
import java.util.Scanner;

public class ch4_flowEX18 {

	public static void main(String[] args) {
	
		int answer ;
		int input;
		Scanner sc = new Scanner(System.in);
	    Random rn = new Random();
	    answer = rn.nextInt(10)+1;
		
		do {
			System.out.println("1부터 10가지의 정수를 입력하시오");
			input = sc.nextInt();
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요");
			}
			else if(input  < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요");
			}
		}while(input !=  answer);
	    
		System.out.println("정답입니다.");
	}
}
