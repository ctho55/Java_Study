package j14_Exception;

// ** 오류의 종류
//=> 컴파일(Compile) 오류 : 에디터 (이클립스) 에서 해결
//=> 런타임(RunTime) 오류 : 실행시 발생 오류  
//=> 논리적(Logical) 오류 : 디버거등 활용

//** Java 
//=> 예측가능한 RunTime 오류 정의 
//	-> 개발자가 대응 불가능 : 치명적 오류 (Error : 시스템, memory 관련 등) 
//	-> 개발자가 대응 가능 : 예외상황 (Exception : by zero, NullPointException...) 
//=> 실행 결과 의 오류 : 논리적 (Logical) 오류 -> 검증 및 테스트 (디버거 등 도구 활용)

//** Exception : 계층도 (ppt 12 ~ page)
//   Object -> Throwable -> Exception -> RuntimeException, IOException
//                       -> Error

//** Exception 에 적절하게 대응하도록 지원되는 구문
//=> try ~ catch  ~ finally ~
//=> 프로그램 작성 중 발생한 예외가
//   예상할 수 있는 범위에 있거나, 예외가 발생했을 때도
//   프로그램을 종료하지 않고 이후의 작업을 계속 진행하고자 할때.
//=> try 블럭을 진행 하다가 예외상황이 발생하면 catch 블럭으로 이동 
//   정상적으로 진행하면 catch 블럭 다음으로 이동
//   ( 비정상적 종료 예방 )  

public class Ex01_Basic {

	public static void main(String[] args) {
		
		String s ="100";
		int x=6, y=2;
		int result=0 ;
		// ** 배열 Test
		String[] names = {"Apple","Grape","Banana"}; 
		
		try {
			result=x/y;
			System.out.println("** Result1 => "+result);
			result=x*Integer.parseInt(s);
			System.out.println("** Result2 => "+result);
			
			System.out.println("** 배열 Test => "+names[2]);
			// NullPointerException
			s=null;
			System.out.println("** NullPointer Test => "+s.length());
			
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException=> "+e.toString());
			System.out.println("~~ 숫자를 입력 하세요 ~~ ");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException=> "+e.toString());
			System.out.println("~~ 0 보다 큰 수를 입력 하세요 ~~ ");	
		}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBounds=> "+e.toString());
				System.out.println("~~ 배열의 범위를 벗어납니다 ~~ ");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException=> "+e.toString());
			System.out.println("~~ Null 값을 접근했습니다 ~~ ");		
		}catch(Exception e) {
			System.out.println("Exception=> "+e.toString());
			System.out.println("~~ data 에 오류가 있습니다 ~~ ");
		}finally {
			System.out.println("~~ finally 는 무조건 시행 !!! ~~ ");
			System.out.println("~~ 배열 정상 Close !!! ~~ ");
			names=null;
		}
		System.out.println("~~ 정상 종료 GoodBye ~~ ");
	} //main
} //class
