package j06_classExtends;

// Test 클래스 정의
//  멤버 변수 2개 정의
// Default 생성자 ,변수를 초기화하는 생성자
// setter, getter to string 매서드 정의
// main에서는 인스턴스2개 생성
// 인스턴스1 default 생성자로 생성 초기화 to string 메서드로출력
// 인스턴스2 생성자로 초기화 to string 메서드로 출력

public class Ex04_Test {
	String pen ="monami볼펜" ;
	String eraser ="Ain지우개";
	
	Ex04_Test(){System.out.println("Ex04_Test의 default 생성자 ");}
	
	public Ex04_Test (String pen ,String eraser) {
		super();
		this.eraser = eraser;
		this.pen = pen;
		System.out.println("Ex04_Test의 default 생성자 ");
		}
	
	public String getPen() {
		return pen;
	}


	public void setPen(String pen) {
		this.pen = pen;
	}


	public String getEraser() {
		return eraser;
	}


	public void setEraser(String eraser) {
		this.eraser = eraser;
	}
	
	
	@Override
	public String toString() {
		return "Ex04_Test [pen=" + pen + ", eraser=" + eraser + "]";
	}


	public static void main(String[] args) {
		
		Ex04_Test t = new Ex04_Test();
		t.setPen("monami볼펜");
		t.setEraser("Ain지우개");
	
		t.getPen();
		t.getEraser();
		System.out.println("t"+t);

		
		Ex04_Test t2 = new Ex04_Test("shap pen","k지우개");
		System.out.println("t"+t2);

		
	}//main

}//class 
