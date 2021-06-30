package j06_classExtends;

import java.util.Scanner;

//Test 클래스 정의
//멤버 변수 2개 정의
//Default 생성자 ,변수를 초기화하는 생성자
//setter, getter to string 매서드 정의(조상의 변수도 포함)
//toStriong 메서드 정의 (조상의 값까지 출력)



public class Ex04_TestChild extends Ex04_Test  {
	String white ;
	
	public Ex04_TestChild () {
		System.out.println("자손 의 default 생성자");
	}
	
	public Ex04_TestChild (String pen , String eraser, String white) {
		super(pen, eraser);
		this.white=white;
		System.out.println("생성자로 초기화");

	}
	
		
	@Override
	public String toString() {
		return "Ex04_TestChild [white=" + white + ", pen=" + pen + ", eraser=" + eraser + "]";
	}

	public static void main(String[] args) {
	
		Ex04_Test t = new Ex04_Test();
		System.out.println("조상 출력"+t);
		
		Ex04_TestChild tt1 = new Ex04_TestChild();
		tt1.pen = "monami볼펜";
		tt1.eraser = "Ain지우개";
		tt1.white = "깔끔 화이트";
		System.out.println("tt1 default 출력"+ tt1);
		
		Scanner sc = new Scanner(System.in);
		Ex04_TestChild tt2 = new Ex04_TestChild();
		System.out.println("tt2의 펜 입력!!!");
		tt2.pen = sc.nextLine();
		System.out.println("tt2의 지우개 입력!!!");
		tt2.eraser = sc.nextLine();
		System.out.println("tt2의 화이트 입력!!!");
		tt2.white = sc.nextLine();
	    sc.close();
	    
//		Ex04_TestChild tt2 = new Ex04_TestChild("monami볼펜","Ain지우개","깔끔 화이트");
		System.out.println("tt2 출력"+ tt2);

		
	}

}
