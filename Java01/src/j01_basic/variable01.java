package j01_basic;

//들여쓰기 : Ctrl + Shift + f
//Line삭제 : Ctrl + d

//자동 import : Ctrl+Shift+O
//들여쓰기 : Ctrl+A , Ctrl+I 
//   => 한번에 Ctrl+Shift+F

//클래스 Ctrl+클릭 => 클래스 소스보기 
//클래스 Ctrl+T => 클래스 계층도 

// ** 클래스 
// => 클래스명은 화일명과 동일함.
// => 맴버   
//    변수:value, 
//    메서드 (함수 function , 프로시져 procedure) : 동작

/*	주석의 종류
    여러줄 주석
    한줄 주석
*/
public class Variable01 {
	 
	public static void main(String[] args) {
		// 상수 (Constant 변하지 않는 고정값)
		// => 대문자로 표기
		final double PI = 3.141519;
		//pi=123.456; // Error
		// 변수 (Variable)
		String name = "엄미현";
		String job = "강사" ;
		int age;
		age = 22 ;
		age = age + 100 ;
		// age = 123 + 100 ; // Type Error
		
		name = "홍길동";
		
		
		double height = 166.77 ;
		boolean tf = true ; // true (0)  or false (1)
		
		System.out.println("** 안녕하세요 ~~ **");
		System.out.println("** 이름 : "+name);
		System.out.println("** 직업 : "+job);
		System.out.println("** 나이 : "+age); // 22100 -> 122
		System.out.println("** 신장 : "+height);
		System.out.println("** 사실확인 : "+tf);

	} //main 

} //class
