package j02_ifSwitch;

import java.util.Scanner;

public class IFEX01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 100, b = 50;
		// int ir = (a > b) ? a : b;
		if (a > b) {
			System.out.println("큰수는 :" + a);
		} else {
			System.out.println("큰수는 :" + b);
		}

// scanner로 근무시간을 입력받아 임금계산하기
// 조건
// 근무시간이 5시간 이하면 : 시간당 임금 10000원
// 근무시간이 6시간 이상이면 : 시간당 임금 9000원

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
		String s = sc.nextLine();
		
		s = sc.nextLine();
		if (wor_time < 6 && s.equals("Y")) {
			pay = wor_time * (10000 * 1.2);
		}
		if (wor_time < 6 && s.equals("N")) {
			pay = wor_time * 10000;
		}
		if(wor_time >= 6 && s.equals("Y")){
			pay = wor_time * (9000*1.2);
		}
		if(wor_time >= 6 && s.equals("N")){
			pay = wor_time * 10000;
		}
		System.out.println("pay2 " + pay);
		sc.close();
	}
}