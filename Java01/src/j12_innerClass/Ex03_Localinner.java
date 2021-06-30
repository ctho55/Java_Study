package j12_innerClass;

// LoclaiInner Class

// => 메서드의 내부에 정의 되는 InnerClass 
// => 메서드내에 정의되는 지역변수와 같다. (즉 , 메서드내에서만 사용됨)
// static InnerClass는 허용 되지 않음
// 단, 상수는 허용

public class Ex03_Localinner {

	int a = 100;

	public void innerTest(int n) {
		int b = 200;
		final int c = n;
		class Inner {
			public void getDate() {
				System.out.printf(" getData() => a:%d, b:%d c:%d \n", a, b, c);
			}

		}// Inner

		// Local InnerClass는 메서드내에서 지역변수 처럼 사용됨.
		Inner in = new Inner();
		in.getDate();

	}// innerTest

	public static void main(String[] args) {
		Ex03_Localinner ex03 = new Ex03_Localinner();
		ex03.innerTest(500);

		// Ex02_staticInner 의 클래스 변수 접근
		System.out.println("Ex02_staticInner static int c =>" + Ex02_staticInner.c);
		System.out.println("Ex02_staticInner.IInner static =>" + Ex02_staticInner.InsInner.IF);
		System.out.println("Ex02_staticInner.StaInner ic =>" + Ex02_staticInner.StaInner.ic);
	}// main

}// class
