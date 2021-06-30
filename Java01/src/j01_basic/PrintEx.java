package j01_basic;

import java.util.Date;

public class PrintEx {

public static void main(String[ ] args) {
	
		// Escape 문자 : \n 줄바꿈, \t 탭간격
		System.out.print("** print1 : 줄바꿈이 없어요 ~~\n");
		System.out.print(" print2 \t");
		System.out.print(" print3 \t");
		System.out.print(" print4 ");
		System.out.println("");
		System.out.println("** 줄바꿈이 있어요 ");
		
		System.out.printf("금액1 : %d원\n", 123); 
		System.out.printf("금액2 : %6d원\n", 123); 
		System.out.printf("금액3 : %-6d원\n", 123); 
		System.out.printf("금액4 : %06d원\n", 123); 
		System.out.printf("반지름이 %d 인 원의 넓이 : %10.2f\n",10,Math.PI*10*10); 
		System.out.printf("%6s은 %6d학년 %10s 입니다.%n", "홍길동", 1, "학생"); 
		
		Date now = new Date() ;
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다.%n", now, now, now); 
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다.%n", now); 
		System.out.printf("지금은 %1$tH시 %1$tM분 %1$tS초 입니다.%n", now); 
				
		// % : 출력형식을 의미하는 문자열은 반드시 %로 시작,
		// %d : 정수 , %f 실수, %s 문자 
		// %,d : 정수에 3자리마다  , 표시 
		// %t : 날짜 시간을  
		// %n , \n : 줄바꿈
		// $ 사용하면 매개변수의 갯수를 줄일 수 있음
		// => %2$d : 2번째 매개변수 10진수
		
		char c='A' ;
		c = 'B' ;
		int finger = 10 ;
		long big = 100_000_000_000L ;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;
		int octNum = 010 ; // 8진수 => 8
		int hexNum = 0x10 ; // 16진수 => 16 
		int binNum = 0b10 ; // 2진수 => 2 
		
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n",  finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
		System.out.printf("octNum=%#o, %d%n", octNum, octNum);   
		System.out.printf("hexNum=%#x, %d%n", hexNum, hexNum);   
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);  
		int f = Float.SIZE ;  // 단위 bit 
		System.out.printf("Float.SIZE=%d%n", f);
		
	
	} // main end
} //class END