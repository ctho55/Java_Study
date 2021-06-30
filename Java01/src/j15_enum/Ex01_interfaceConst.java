package j15_enum;


interface ScaleI {
	// 상수만 정의 가능 하므로 생략 가능
	// public final static String DO ="도";
	int DO = 0;
	int RE = 1;
	int MI = 2;
	int FA = 3;
	int SO = 4;
	int RA = 5;
	int SI = 6;
} //ScaleI

public class Ex01_interfaceConst {

	public static void main(String[] args) {
		// ** interface 정의된 상수 직접 사용하기
		// => interface 명으로 직접 접근 가능
		int sc = ScaleI.DO;
		sc=10;
		switch(sc) {
		case ScaleI.DO : System.out.println("~~ 도 ~~"); break;
		case ScaleI.RE : System.out.println("~~ 레 ~~"); break;
		case ScaleI.MI : System.out.println("~~ 미 ~~"); break;
		case ScaleI.FA : System.out.println("~~ 파 ~~"); break;
		case ScaleI.SO : System.out.println("~~ 솔 ~~"); break;
		case ScaleI.RA : System.out.println("~~ 라 ~~"); break;
		case ScaleI.SI : System.out.println("~~ 시 ~~"); break;
		default : System.out.println("~~ 도 레 미 ~~시 ~~");
		}
	} //main
} //class
