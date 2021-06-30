package j02_ifSwitch;

import java.util.Random;
import java.util.Scanner;

public class IFEX04_randomGame {

	public static void main(String[] arg) {

		// 1~10 범위에서 숫자 하나를 입력받아
		// 입력 숫자가 범위를 벗어나면 잘못 입력햇습니다. 다시입력하세요 출력
		// 1~10 범위의 숫자를 입력하세요
		// random 함수의 결과와 일치하면 금메달
		// 차이가 1이면 은메달, 차이가 2면 동메달, 아니면 꽝

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int a;
		int r;

		System.out.println("1~10사이의 숫자를 하나 입력해주세요.!");
		// 1.숫자입력받기
		a = sc.nextInt();
		r = rn.nextInt(10) + 1;
		// 2. 입력값의 오류 확인 => 반복문 필요!
		if (a < 0 || a > 10) {
			System.out.println("잘못입력 하셨습니다. 1부터 10까지의 숫자 하나를 다시입력하세요!.");
			a = sc.nextInt();
		}

		if (a == r) {
			System.out.println("금메달입니다!!");
		} else if ((r == a - 1) || (r == a + 1)) {
			System.out.println("은메달입니다!!");
		} else if ((r == a - 2) || (r == a + 2)) {
			System.out.println("동메달입니다!!");
		} else {
			System.out.println("꽝 입니다!!");
		}
		sc.close();
	}
}
