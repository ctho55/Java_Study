package j09_APItest;

public class Ex02_String01 {

	public static void main(String[] args) {
		// 1. 선언 과 instance
		// => 참조형 변수 이므로 주소값을 가지고 있음
		
		// 묵시적 선언
		String s1 = "그린" ;
		String s2 = "그린" ;
		// 명시적 선언
		String s3 = new String("그린") ;
		String s4 = new String("그린") ;
		
		// Test1. 주소로비교
		// => 값 변경 후 Test
		s1 ="Green" ; s2="Green"; s3="Green"; s4="Green" ;
		
		if (s1==s2) System.out.println(" s1==s2 : true"); // t , t
		else System.out.println(" s1==s2 : false");
		
		if (s1==s3) System.out.println(" s1==s3 : true"); // f , t
		else System.out.println(" s1==s3 : false");
		
		if (s3==s4) System.out.println(" s3==s4 : true"); // f , t
		else System.out.println(" s3==s4 : false");
		
		//값비교
		if(s1.equals(s2))	System.out.println("equals 비교 s1==s2 : true"); // t , t
		else System.out.println(" s1==s2 : false");
		
		// 2. length(글자수로 만 비교한다.)
		s1="My name is Green" ;
		System.out.println(" 영문 => "+s1.length()); // 16
		s2="안녕하세요 Green 입니다!";
		System.out.println(" 한글 => "+s2.length()); // 16 
		
		// 3. Add
		// => 문자열이 이어짐
		int i=123, j=200; 
		System.out.println(" 한글 => "+s1+s2+s3+s4+i+j);
		System.out.println(" 한글 => "+s1+s2+s3+s4+(i+j));

	} //main
} //class
