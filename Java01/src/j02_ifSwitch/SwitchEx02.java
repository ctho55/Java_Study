package j02_ifSwitch;

import java.util.Scanner;

//실습 : 
//1. 월을 입력 받아서 
//2. 몇일까지 인지,  
// => 1,3,5,7,8,10,12월 => ?월은 31일 까지 입니다.
// => 4,6,9,11 월 => ?월은 30일 까지 입니다.
// => 2 월 => ?월은 29일 까지 입니다.
//3. 무슨 계절인지 출력 하기
//  => 3~5:봄 , 6~8:여름, 9~11:가을, 12~2:겨울

public class SwitchEx02 {
	public static void main(String[] args) {

		int mon;
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해주세요");
		mon = sc.nextInt();

		switch (mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월은 31일 까지 입니다.", mon);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%d월은 29일 까지 입니다.", mon);
			break;
		default:
			}// switch
		System.out.println("월을 다시 입력해주세요!");
		if(mon>=3 && mon<= 5) {
			System.out.printf("%d월은 봄 입니다.", mon);
		}
		if(mon>=6 && mon<= 8) {
			System.out.printf("%d월은 여름 입니다.", mon);
		}
		if(mon>=9 && mon<= 11) {
			System.out.printf("%d월은 가을 입니다.", mon);
		}
		if(mon>=12 && mon<= 2) {
			System.out.printf("%d월은 겨울 입니다.", mon);
		}
	}// main
}// class
