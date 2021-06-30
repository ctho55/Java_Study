package j01_basic;


// ** XOR 연산자를 사용한 암호화/복호화 예제                         
public class OperEx02_encry {

	public static void main(String[] args) {
		int p = 123456, t=0;
		int e=0x1A253B65 ;
		System.out.println(" ** 암호화 전 Password => "+p);
		// Encryption
		t=p^e ;
		System.out.println(" ** 암호화 된 Password => "+t);
		// Decryption
		t=t^e;
		System.out.println(" ** 복호화 된 Password => "+t);
	} //main
} // class
