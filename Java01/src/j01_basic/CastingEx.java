package j01_basic;

// ** Type Casting (형변환)
// 1. 자동 (프로모션 promotion , 확대형변환)
// => 큰자료형에 작은 자료형을 대입하면 : 자동으로 이루어짐
// 2. 강제 (디모션, demotion, 축소형변환)
// => 작은 자료형에 큰 자료형을 대입 : 자동으로 이루어지지않음

public class CastingEx {

	public static void main(String[] args) {
		// 1. 프로모션
		double d = 123.45; // 8byte
		int i = 123 ; // 4byte
		d=i; //프로모션 
		System.out.println("** 프로모션 후 d => "+d);
		System.out.println("** 프로모션 후 i => "+i);
		
		// 2. 디모션
		// => 같은 Type 의 경우 받는쪽이 크기가 다를때
		// => Type 이 다를때
		char c = 'B' ; // 2byte
		System.out.println("** char c1 => "+(int)c); 
		// Ascii 코드표 를 검색 해 보세요 ~~
		i = c+1 ; //프로모션 (4byte <- 2byte) 
		System.out.println("** int i => "+i); 
		c=(char)i ; //디모션 (2byte <- 4byte) : Type Casting (형변환)
		System.out.println("** char c2 => "+c); 
		
		float f=123.45f ; // 4byte
		int n=123; // 4byte
		// n=f ; // Type mismatch
		n=(int)f ;
		f=n;
		
		// 3. 정수연산
		// => 4byte 이하 type 의 정수형 연산의 경우 무조건 그 결과는 int (4byte) 로 처리 
		short s1=10, s2=20, s3=0;
		//s3=s1+s2; // Type mismatch  ->  short = int : 디모션 필요 
		s3=(short)(s1+s2) ;
		
		// 4. by 0 ERROR, 오버플로우/언더플로우
		// 4.1) 정수형
		// => 컴파일 오류 없음
		//    실행(런타임)오류 : java.lang.ArithmeticException: / by zero
		System.out.println("** by 0 Test1 (정수 /) => "+n/10);
		System.out.println("** by 0 Test1 (정수 /) => "+n%10);
		// 4.2) 실수형
		// => 컴파일, 런타임 오류 없음
		System.out.println("** by 0 Test1 (실수 /) => "+f/0); 
		// Infinity (무한수) -> 오버플로우
		System.out.println("** by 0 Test1 (실수 %) => "+f%0); 
		// NaN (Not a Number) -> 언더플로우
		
		// 4.3) 정수형 연산의 오버플로우/언더플로우
		// => Exception 발생하지 않음 주의 
		short sMax = Short.MAX_VALUE;
		short sMin = Short.MIN_VALUE;
		System.out.println("** sMax => "+sMax +", sMax+1 => "+(sMax+1)); //int 연산
		System.out.println("** (short)(sMax+1) => "+(short)(sMax+1));   //오버플로우 발생 
		// 1111 1111 -> 1 0000 0000
		
		System.out.println("** sMIn => "+sMin +", sMin-1 => "+(sMin-1)); //int 연산
		System.out.println("** (short)(sMin-1) => "+(short)(sMin-1));    //언더플로우 발생 
		
		// ** Error 종류 : 컴파일 오류, 실행(런타임)오류, 논리적(Logical)오류
	} //main

} //class
