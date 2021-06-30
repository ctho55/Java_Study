package Mypersonalstudy2;

//checked 예외와 unchecked 예외 
// checked 예외는 Exception 클래스들과 자손들 이고 예외처리(try-catch)필수
// unchecked 예외는 RuntimeException과 자손들이고 예외처리(try-catch)선택

public class Ex02_TryCatch {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int) (Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
		} // for
	}// main

}
