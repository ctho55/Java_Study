package j02_ifSwitch;

import java.util.Random;
import java.util.Scanner;

public class IFEX03 {

	public static void main(String[] args) {
		// 과제1.
		// 두개의 정수 x, y 를 정의 하고,
		Random rn = new Random();
		int x = 10, y = 7;
		x = rn.nextInt(50)+1;
		y = rn.nextInt(50) + 1;
		// x가 y보다 크고
		if (x > y) {
			if (x % 2 == 0 && y % 2 == 0) {
				System.out.println("1등 당첨" + (x * 2));
			} else {
				System.out.println("2등 당첨" + (x * 1.5));
			}
		} else {
			if (y % 2 != 0)
				System.out.println("3등 당첨" + (y * 1.5));
			else
				System.out.println("4등 당첨");

		}

		// 둘다 짝수이면 1등 당첨, x 값을 2배로 늘려줌
		// 둘다 짝수가 아니면 2등 당첨, x 값을 1.5배로 늘려줌
		// 아니고
		// y 가 홀수 이면 3등 당첨, y 값을 1.5배로 늘려줌
		// y 가 홀수 아니면 4등 당첨

		// 과제 2
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력 하세요 :");
		int score = sc.nextInt();
		if (score >= 90)
			System.out.println(" 점수 : " + score + ",  A 등급");
		else if (score >= 80)
			System.out.println(" 점수 : " + score + ",  B 등급");
		else if (score >= 70)
			System.out.println(" 점수 : " + score + ",  C 등급");
		else
			System.out.println(" 점수 : " + score + ",  D 등급");
		// 비교 Test
		if (score >= 90)
			System.out.println(" 점수2 : " + score + ",  A 등급");
		if (score >= 80)
			System.out.println(" 점수2 : " + score + ",  B 등급");
		if (score >= 70)
			System.out.println(" 점수2 : " + score + ",  C 등급");
		if (score < 70)
			System.out.println(" 점수2 : " + score + ",  D 등급");
	}// main
}// class