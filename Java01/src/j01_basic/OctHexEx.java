package j01_basic;

// ** 2진수, 8진수 , 16진수 표기
// => 2진수 : 0b 로시작
// => 8진수 : 0
// => 16진수: 0x
public class OctHexEx {

	public static void main(String[] args) {
	
		int bin = 0b1111; // 1+2+4+8 
		int oct = 017 ; // 8+7
		int hex = 0xf ; // 15
		System.out.println("** binary => "+bin);
		System.out.println("** oct => "+oct);
		System.out.println("** hex => "+hex);
		
		// Integer to 2, 8, 16 진수로 출력하기
		System.out.println("** binary => "+Integer.toBinaryString(bin));
		System.out.println("** oct => "+Integer.toOctalString(oct));
		System.out.println("** hex => "+Integer.toHexString(hex));
		
		// Integer to String
		System.out.println("Integer to String => "+bin+oct+hex);
		// String to Integer
		String s="12345" ;
		System.out.println("String to Integer => "+ Integer.parseInt(s)*2);
	} //main
} //class
