package j15_enum;

// *** 열거형(enum) 상수 사용
// => interface 와 비교

enum Scale {
	DO, RE, MI, FA, SO, RA, SI 
}

public class Ex02_enumConst {

	public static void main(String[] args) {
		Scale sc = Scale.DO;
		System.out.println("*** sc => "+sc);
		
		switch(sc) {
		case DO : System.out.println("~~ 도 ~~"); break;
		case RE : System.out.println("~~ 레 ~~"); break;
		case MI : System.out.println("~~ 미 ~~"); break;
		case FA : System.out.println("~~ 파 ~~"); break;
		case SO : System.out.println("~~ 솔 ~~"); break;
		case RA : System.out.println("~~ 라 ~~"); break;
		case SI : System.out.println("~~ 시 ~~"); break;
		default : System.out.println("~~ 도 레 미 ~~시 ~~");
		}

	} //main

} //class
