package j02_ifSwitch;

import java.util.Scanner;

public class IFEX02 {

	public static void main(String[] args) {

		// 조건1 근무시간
		// 근무시간이 5시간 이하면 시간당 임금 10000
		// 근무시간이 6시간 이상이면 시간당 임금 9000
		// 조건2 야간근무
		// 야간 근무이면 20% 추가 해준다.
		Scanner sc = new Scanner(System.in);
		int wor_time;
		double pay = 0;
		

		System.out.println("근무한시간을 입력하세요");
		wor_time = sc.nextInt();
		System.out.printf("근무시간 %d 시간 ", wor_time);

		if (wor_time <= 5) {
			pay = wor_time * 10000;
			System.out.println("임금은" + pay);
		} else {
			pay = wor_time * 9000;
			System.out.println("pay " + pay);

			// 기능추가
			// 야간 근무 이면 20% 추가 해준다
			// 입력받기 : 야간 근무 입니까? (예 Y 아니오N)
		}
		System.out.println("아간 근무 입니까?(예 Y/ 아니오 N) :");
		String  s =  sc.nextLine();
		s = sc.nextLine();
		
		if (wor_time < 6) {
			if (s.equals("Y")) {
				pay = wor_time * (10000 * 1.2);
			} else {
				pay = wor_time * 10000;
			}
		} else {
			if (s.equals("Y")) {
				pay = wor_time * (9000 * 1.2);
			} else {
				pay = wor_time * 10000;
			}

		}
		System.out.println("pay2 " + pay);
		sc.close();
	}

}
