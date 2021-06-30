package j14_Exception;

import java.io.IOException;

// ** Checked Exception 처리
// 1) 직접 처리
// => 해당 메서드 내에서 try ~ catch 블럭 처리

// 2) 위임 처리
// => Exception 처리를 상위 메서드로 위임(떠넘기기)

public class Ex05_IOthrows {
	
	// ** IO 관련 메서드 작성
	// 1) 직접 처리 
	public static String readString() {
		byte[] bf = new byte[100] ;
		System.out.println(" ~~ 문자열을 입력 하세요 =>");
		try {
			System.in.read(bf);
			// Checked -> 컴파일 오류 발생 : Unhandled exception type IOException
		} catch (IOException e) {
			System.out.println("** IOException => "+e.toString());
		}
		return new String(bf);
	} //readString 
	
	// 2) 위임 처리 (떠넘기기)
	// => throws IOException
	//    IOException의 처리를 상위의 메서드(현재메서드를 call 한 메서드) 로 떠넘김
	// => throws 하는 Exception 은 모두 Checked 방식으로 처리 해야함\
	//    throws IOException -> main IOException :  OK
	//    throws IOException -> main Exception   :  OK
	//    throws Exception -> main Exception     :  OK
	//    throws Exception -> main IOException   :  Error
	public static String readString2() throws Exception {
		byte[] bf = new byte[100] ;
		System.out.println(" ~~ 문자열을 입력 하세요 =>");
		System.in.read(bf);
			// Checked -> 컴파일 오류 발생 : Unhandled .....
		return new String(bf);
	} //readString2 

	public static void main(String[] args) {
		// 1) 직접 처리 Test
		System.out.println("** main Test1 => "+readString());
		
		// 2) 위임 처리 Test
		try {
		System.out.println("** main Test2 => "+readString2());
		// => Unhandled exception type IOException
		}catch(Exception e) {
			System.out.println("** main Exception => "+e.toString());
		}
	} //main

} //class
