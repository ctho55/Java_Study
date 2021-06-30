package j09_APItest;

import java.math.BigDecimal;
import java.math.BigInteger;

// 정수 :byte(1), short(2), int(4), long(8) 
// 실수 :float(4), double(8)
// 기타 :boolean(1), char(2)

public class Ex06_BigTest {

	public static void main(String[] args) {
		
		System.out.println("기본자료형의 최대정수 => "+ Long.MAX_VALUE); // 19자리
		System.out.println("기본자료형의 최대정수 => "+ Long.MIN_VALUE);
		long lnum = Long.MAX_VALUE;
		
		// 컴파일,런타임 오류는 발생하지 않지만 결과는 틀림 = 논리적(Logical) 오류
		// => Overflow 발생
		lnum += 1;
		System.out.println(lnum);
		
		// BingInteger 정수
		BigInteger b1 = new BigInteger("12345678900000000000");
		BigInteger b2 = new BigInteger("33333333390000000000");
		BigInteger r =b1.add(b2);
		System.out.println("result => "+r);
		r = b1.multiply(b2);
		System.out.println("result2 => "+r);
		
		// BigDecimal 실수
		// => Decimal 의 의미? 
		// 1. 십진법의 2. 소수
		BigDecimal d1 = new BigDecimal ("1.23456");
		BigDecimal d2 = new BigDecimal ("0.0005");
		System.out.println("BigDecimal_result => "+ d1.add(d2));
		System.out.println("BigDecimal_result => "+ d1.multiply(d2));

	
	}

}
