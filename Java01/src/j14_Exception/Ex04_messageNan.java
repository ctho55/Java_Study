package j14_Exception;

// ** Exception Message
// ** 다중 catch 블럭 사용시 주의사항
// ** 실수형 연산의 by Zero 주의사항

public class Ex04_messageNan {

	public static void main(String[] args) {
		 
		String name = "123" ;
		int i = 0 ;
		
		// ** 실수형 연산의 by Zero Test
		// => Excception 발생 없고 아래의 결과를 return
		//    try ~ catch 로 처리 할 수 없고 래퍼클래스로 확인후 사용 
		double d1 = 1.5/0.0 ; // Infinity : 무한수
		double d2 = 1.5%0.0 ; // NaN : Not a Number (숫자가 아님)
				
		try {
			
			// => 래퍼클래스 Double 의 메서드 isNaN, isInfinity 로 Check 후 사용 
			if (Double.isInfinite(d1) || Double.isNaN(d2) ) {
				System.out.println("** Zero 연산은 허용하지 않습니다 ~~ ");
			}else  {
				System.out.println("** d1 => "+d1);
				System.out.println("** d2 => "+d2);
			}
			
			i+= Integer.parseInt(name) ;
			System.out.println(" ** i => " +i);
			name = null;
			System.out.println(" ** name.length => " +name.length()); 
			// NullPointerException 
			// => Exception 이 정의 되어있지 않으므로 비정상종료 -> 그래도 finally는 함.
			// => 그래서 안전하게 Exception catch 블럭은 작성하는것이 좋음. 
			
		} catch (NumberFormatException e) {
			System.out.println("** NumberFormat => "+e.toString());
		} catch (Exception e) {
			// ** Message 종류 Test
			System.out.println("** Exception toString => "+e.toString());	
			System.out.println("** Exception getMessage() => "+e.getMessage());	// Simple Message
			System.out.println("** Exception printStackTrace() => \n");	
			e.printStackTrace();
			// => e.toString 을 포함한 순차적인 실행경로 등이 출력되어
			//    예외발생의 원인과 경로 파악에 도움. 
			
		} finally {
			System.out.println("** finally  =>  무조건 실행 ");
		} // finally
		
		System.out.println("** Program Stop **");
	} //main

} //class
