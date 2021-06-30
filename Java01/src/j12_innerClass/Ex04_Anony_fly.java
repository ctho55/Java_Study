package j12_innerClass;

//** 익명클래스 (Anonymous 클래스)
//이름이 없는 클래스이며, 한번만 사용하고 버려지는 객체를
//사용 할 때 유용하게 쓰이는 내부클래스로서,
//다른 클래스를 상속 받는 경우 또는 인터페이스를 구현 하는 경우 이용됨  

interface Flyer {
	void fly();
}

// 1. 일반적인방법
// => 용도가 많을때는 구현 클래스를 작성해놓고 필요할때 사용'
class Flyer1 implements Flyer{
	@Override
	public void fly() {
		System.out.println("===일반적인 방법: 구현 클래스 작성===");
	}
	
}




public class Ex04_Anony_fly {

	public static void main(String[] args) {
		//1.일반적인 방법
		Flyer f1 = new Flyer1();
		f1.fly();
		
		//2. 익명클래스
		// Flyer fi = new Flyer(); XXXX
		
		 // 인터페이스는 직접 생성(new) 될수 없고 implements 하는 클래스를 통해 생성후 사용되어짐.
	      // 인터페이스의 구현 클래스를 new 다음에 직접 기술
	      // => 그러므로 익명 클래스는 추상클래스를 상속받거나, 인터페이스를 구현하는 형태만 가능하며,
	      //    강제성을 부여한 일회성 코드에 주로 이용됨 (예, 이벤트 핸들러 또는 이벤트 리스너 구현)  
	      // => Anonymous 클래스에서는 인터페이스이름으로 new 하고 { ...}; 블럭에서 구현
	      // 마지막에는 반드시 ;
	      // => 내부적으로 Flyer 를 구현한 익명의 클래스가 생성되며 이를 Anonymous 클래스 라함.
		Flyer f2 = new Flyer() {

			@Override
			public void fly() {
				System.out.println("=== 익명클래스 방법: 직접 오버라이딩 메서드 작성");
				
			}
			
		};

				
	}

}
