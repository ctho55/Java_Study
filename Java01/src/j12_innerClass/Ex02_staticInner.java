package j12_innerClass;

public class Ex02_staticInner {
	//멤버변수
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	//멤버메소드
	//메서드 내부에도 InnerClass 정의 가능 => LocalInner Class 
	//=> LocalInner Class
	//	 static InnerClass는 허용 되지 않음
	//	 단, 상수는 허용

	void mymethod() {
		class LOcalInner {
			int ia = 333 ;
			// static int ic = 100; //XXXXX
			final static int IF = 1234; //단, 상수는 허용한다. 
		}
	}
	
	// 일반 Inner : static 멤버 정의시 오류, 단 상수는허용 
	class InsInner {
		int ia = 111;
		//static int ic = 100;
		final static int IF = 1234; 
		
		void printData () {
			System.out.println("int a => "+a);
			System.out.println("private int b=> "+b);
			System.out.println("static int c => "+c);
		}
		
	}// InsInner
	
	//Static Inner 클래스 : Static 멤버를 정의하면 InnerClass 도 static로 정의해야함.
	static class StaInner{
		int ia = 22 ;
		static int ic = 100;
	}
	
	
	public static void main(String[] args) {
		// Static 변수 접근
		System.out.printf("=== InsInner 상수 :%d \n ",InsInner.IF);
		// Static Inner Class 의 인스턴스 멤버는 인스턴스가 있어야만 접근가능//(객체 생성해야 접근가능)
		System.out.printf("=== StaInner static변수 :%d  변수ia:%s \n",StaInner.ic,"불가능");
	
		Ex02_staticInner ex02 = new Ex02_staticInner();
		Ex02_staticInner.InsInner ii = ex02.new InsInner();
		// InsInner 변수와 메서드 Test 출력
		ii.printData();
		
		// Static Inner Class 의 생성
		// Outer클래스의 인스턴스 멤버는 인스턴스가 있어야만 접근 가능
		StaInner si = new StaInner();
		System.out.printf("StaInner 변수ia:%d, \n",si.ia);
		
	}//main	

}// class
