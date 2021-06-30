package j01_basic;

public class Vari_able_02 {
	
	static int ii ;  // 맴버변수 int 의 default 값은 0 
	
	public static void main(String[] args) {
		// ** 정수형
		// => byte(1), short(2), int(4), long(8)
		byte b = 10;
		short s = 200;
		int i = 1234567890;  // 정수는 기본 int Type
		// int ii ; // 지역변수는 사용전에 반드시 초기화 해야함.
		long l = 123456789012345l ; // L,l : Long Type 표시
		System.out.print("** 정수 Type별 숫자범위 **\n");  // 자동개행 안됨 -> \n
		System.out.println("** Byte =>"+Byte.MAX_VALUE +" , "+Byte.MIN_VALUE); // 자동개행
		System.out.printf("** Short => %d , %d \n",Short.MAX_VALUE,Short.MIN_VALUE);
		System.out.printf("** Integer => %d , %d \n",Integer.MAX_VALUE,Integer.MIN_VALUE);
		System.out.printf("** Long => %d , %d \n",Long.MAX_VALUE,Long.MIN_VALUE);
		System.out.println("** int default => "+ii); 
		
		// ** 실수형
		// => double(8) , float(4)
		double d = 123.456; // 실수는 기본적으로 double 
		float f = 123.456f;  
		System.out.print("** 실수 Type별 숫자범위 **\n");
		System.out.printf("** Double => %f , %f \n",Double.MAX_VALUE,Double.MIN_VALUE);
		System.out.printf("** Float => %f , %f \n",Float.MAX_VALUE,Float.MIN_VALUE); 
		
		// ** 문자형
		// => char(2) : 알파벳한문자, 한글 한글자
		char c = 'A' ;
		char h = '가' ;
		
		// ** 논리형
		// => boolean : 참 true (0) / 거짓 false (1)
		boolean tf = (2>3) ;
		System.out.println("** 논리형 => "+ tf);  // 거짓
		
		// ** 문자열
		// String (길이무관) : 참조자료형  
		String name = "가나다라마바사" ;
		System.out.printf("** char : %s %s , String : %s \n",c,h,name);
		
		// ** 연습
		String job = "강사" ;
		byte age = 100;
		short 나이 = 123 ; // 허용되나 비추
		float height = 177.789f;
		String bloodType = "AB" ;
		char gender = 'F' ;
		
		// ** 값의 맞교환 : 치환
		// => 동일 타입 job, bloodType 의 값을 맞교환 하기
		//    중간 보관을 위한 변수 필요함
		// => "=" 동일성을 의미하는것이 아니고 대입 연산자
		String temp = job ;
		job = bloodType ;
		bloodType = temp ;
		
	} // main
} // class
