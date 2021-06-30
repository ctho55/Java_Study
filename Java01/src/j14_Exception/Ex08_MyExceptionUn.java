package j14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// AgeException 만들기2 -> UnChecked Exception 
// => extends RuntimeException
// => 즉, 컴파일러가 예외처리(try~catch~)를 확인하지 않음
// => 주로 프로그래머의 실수로 발생 가능한 오류들

class AgeExceptionU extends RuntimeException {
	private static final long serialVersionUID = 1L;
	AgeExceptionU() {
		super("나이가 범위를 벗어남");
	}
} //AgeExceptionU

public class Ex08_MyExceptionUn {
	
	// 나이 입력받는 메서드 만들기
	// => 예외처리를 컴파일시에 확인하지 않음.
	public static int readAge() {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("나이를 입력 하세요 => ");
		int age = sc.nextInt() ;  // InputMismatchException 가능
		sc.close();
		if (age<0 || age>150) {
			throw new AgeExceptionU();
		}else return age;
	} // readAge()

	public static void main(String[] args) {
		// ** 에외처리 적용하지 않은경우
		//System.out.println(" 당신의 나이 => "+readAge());
		// 오류 발생시 AgeExceptionU 발생하고 비정상 종료됨.
		
		// ** 에외처리 적용
		try {
			System.out.println(" 당신의 나이 => "+readAge());
		} catch (AgeExceptionU e) {
			System.out.println("AgeException => "+e.toString());
		} catch (Exception e) {
			System.out.println("Exception => "+e.toString());
		}
		System.out.println("** Program Stop **");
	} //main
} //class
