package j02_ifSwitch;

//** switch - case - break 문
//1. => switch(key) 문의 인자로 사용 가능 Type ( int, char, String )
//2. => break : 무조건 탈출

public class SwitchEx01 {

	public static void main(String[] args) {

		// ** int Type
		int i = 1;
		switch (i) {
		case 0:
			System.out.println(" 0 입력 ");
			// break ;
		case 1:
			System.out.println(" 1 입력 ");
			// break ;
		case 2:
			System.out.println(" 2 입력 ");
			// break ;

		default:
			System.out.println(" 입력 ERROR ");

		}// switch

		// ** char Type
		char jobcode = 'C';
		switch (jobcode) {
		case 'A':
			System.out.println(" 예술가 ");
			break;
		case 'S':
			System.out.println(" 학생 ");
			break;
		case 'C':
			System.out.println(" JAVAprogramer ");
			break;
		default:
			System.out.println(" 무직 ");
		}// switch

		// ** String Type
		String color = "w";
		switch (color) {
		case "w":
			System.out.println(" White ");
			break;
		case "b":
			System.out.println(" Blue ");
			break;
		case "r":
			System.out.println(" Red ");
			break;
		default:
			System.out.println(" Black ");
		}
	}// main

}
// class
