package j14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// ** AgeException 만들기1 -> Checked
// => 나이의 값이 범위를 벗어나면 Exception 발생
// => 예외처리를 강제함 -> try ~ catch 처리하지 않으면 컴파일 오류 발생 
// => Exception 을 상속

class AgeException extends Exception {
	private static final long serialVersionUID = 1L;
	AgeException() {
		super("나이가 범위를 벗어남");
	}
} //AgeException 

public class Ex08_MyExceptionChecked {
	
	// 나이 입력받는 메서드 만들기
	public static int readAge() throws AgeException, InputMismatchException  {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("나이를 입력 하세요 => ");
		int age = sc.nextInt() ;  // InputMismatchException 가능
		sc.close();
		if (age<0 || age>150) {
			throw new AgeException();
		}else return age;
	} // readAge()
	
	public static void main(String[] args) {
		
		// Checked Exception 을 throw 했기 때문에
		// 얘외처리를 해야함
		// System.out.println(" 당신의 나이 => "+readAge()); -> 컴파일 오류
		try {
			System.out.println(" 당신의 나이 => "+readAge());
		} catch (AgeException e) {
			System.out.println("AgeException => "+e.toString());
		} catch (Exception e) {
			System.out.println("Exception => "+e.toString());
		}
		System.out.println("** Program Stop **");
	} //main
} //class
