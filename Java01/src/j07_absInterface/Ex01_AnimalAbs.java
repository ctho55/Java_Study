package j07_absInterface;

//** 추상 클래스 
//=> J10 , 3page
//=> 추상메서드가 하나라도 정의되면 그 클래스는 반드시 추상클래스로 정의 해야 함 
//=> 직접 인스턴스를 생성하지 못함. ( new 사용불가 )
//   그러나 참조형 변수의 타입으로 선언은 가능하다.
//   그리고 후손으로 인스턴스를 생성할 수 있음. 

//** 추상 메서드
//=> Body 부분이 없고 Header 만 선언
//=> 앞쪽에 abstract, 매개변수 뒤에 ; 붙여야됨.
//=> Body 부분은 Child 클래스에서 반드시 재정의(오버라이딩) 해서
//   실행문을 작성 해야 함.
//=> 추상 메서드 목적 : 후손에게 오버라이딩 의 강제성을 부여 (메서드명의 통일성)

//** 다형성(polymorphism) ppt 17p

//=> 본래 '여러 개의 형태를 갖는다'라는 의미의 그리스어에서 유래
//=> 또 사전에서 찾아보면 poly(하나 이상), morph(형태)가 합성된 단어로
//	    '하나 이상의 형태'를 뜻한다. 
	
//** 다형성 적용
//=> 조상의 타입 으로 변수 선언, 후손의 타입으로 인스턴스 생성
//=> 조상에 정의된 범위내에서만 후손의 맴버 사용가능
	
//** 다형성 적용의 장점
//=> 계층구조에서 일괄 작업 가능 (개발 및 유지보수의 효율을 높여줌)
//=> 실행시 클래스의 교체가 간편


abstract class Animal {
	
	String kind;
	
	// 일반 메서드 : 후손에 구현(Override) 의무 없음
	void breathe() {System.out.println(kind+"는 숨을 쉽니다 ~~");}
	
	// 추상메서드
	// => 후손에 구현(Override) 의무 있음
	// => 추상메서드를 하나라도 가진 클래스는 추상 클래스로 정의 해야함
	abstract void sound();
	abstract void special();
} //Animal

class Cat extends Animal {
	Cat() { kind="고양이" ;}
	@Override
	void sound() { System.out.println("~~ 야옹 야옹 ~~"); }
	@Override
	void special() {System.out.println("~~ 눈의 color 가 멋져요 ~~"); }
	// ** 조상에 없는 메서드는 다형성에 적용할 수 없음 -> 불편 
	// => 일원화 하기 위해  special() 를 추가함
	void color() {System.out.println("~~ 눈의 color 가 멋져요 ~~"); } 
} //Cat

class Dog extends Animal {
	Dog() { kind="강아지" ;}
	@Override
	void sound() { System.out.println("~~ 멍 멍 멍 ~~"); }
	@Override
	void special() {System.out.println("~~ 엄청 빠르게 달려요 ~~"); }
	
 	void speed() {System.out.println("~~ 엄청 빠르게 달려요 ~~");} 
} //Dog

class Eagle extends Animal {
	Eagle() { kind="조류"; }
 	@Override
	void sound() { System.out.println("독독수리~수리수리~~"); }
	@Override
	void special() { System.out.println("훨 훨 잘 날아요~~"); }
	
	void flying() { System.out.println("훨 훨 잘 날아요~~"); }
	
} //Eagle 

class Bear {
	void breathe() { System.out.println("곰 은 숨을 쉽니다 ~~"); }
	void sound() { System.out.println("곰~곰 곰~~"); }
	void special() { System.out.println("훨 훨 잘 날아요~~");	}
} // Bear


public class Ex01_AnimalAbs {

	public static void main(String[] args) {
		
		//Animal ani = new Animal() ;  
		// 추상 클래스는 인스턴스를 생성할 수 없다.
		// Test1) 각각 생성
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
		cat.color();
		cat.special();
		
		Dog dog = new Dog();
		dog.breathe();
		dog.sound();
		//dog.speed();
		dog.special();
		
		Eagle eagle = new Eagle();
		eagle.breathe();
		eagle.sound();
		//eagle.flying();
		eagle.special();		
		
		// Test2) 추상 클래스 적용
		// 추상 클래스는 참조형 변수의 타입으로 선언은 가능하다.
		// 그리고 후손으로 인스턴스를 생성할 수 있음. 
		// => 단, 후손에 정의된 맴버가 실행 되지만,
		//    맴버의 사용범위는 조상에 정의된 만큼만 접근가능.
		// => 다형성
		Animal ani = new Cat();
		ani.breathe();
		ani.sound();
		//ani.color();  // color() is undefined Error
		
		Animal and = new Dog();
		and.breathe();
		and.sound();
		//and.speed(); // undefined Error
		
		Animal ane = new Eagle();
		ane.breathe();
		ane.sound();
		//ane.flying(); // undefined Error  
		
		// Test3) 다형성 적용
		// => 우측의 생성자만 교체하면 쉽게 클래스 교체 가능
		// => 코드 내에서 조상의 정의된 맴버만 사용 했다는 의미 
		System.out.println("** Animal Test **");
		Animal am = new Eagle();  // Cat(), Dog() , Bear() : XXXX
		am.breathe();
		am.sound();
		am.special();
		
		System.out.println("** 메서드, 다형성 Test **");
		// Test4) 메서드를 만들어서 다형성 적용 
		// => 동일한 조상에 의한 계층적 구조를 가지고 있음의 편리성 
		//    Bear 와 비교 
		// => 클래스(Animal) 를 매개변수로 하는 경우
		//    해당 클래스 또는 그 후손 클래스의 인스턴스들만 매개변수로 사용 가능
		//    만약, 상속관계가 없다면 컴파일 오류 발생
		// => instanceof : 인스턴스의 계보를 확인할때 사용하는 연산자 
		if (cat instanceof Animal) animalUse(cat) ;
		else System.out.println(" Animal 의 인스턴스를 생성할 수 없습니다 ~~");
		
		animalUse(and) ;
		animalUse(new Eagle()) ;
		
		Bear bear = new Bear() ;
		bear.breathe();
		bear.sound();
		bear.special();
		//animalUse(bear);  // XXXXX
		//animalUse(new Bear()); // XXXXX
		//if (bear instanceof Animal) 
		/// => 컴파일 오류 발생
		//  => 그러나 비교대상(Animal) 이 인터페이스라면 컴파일 오류 발생하지 않고,
		//     런타임 오류 발생 그래서 확인이 필요함 
		
		// Test5) Object 와 비교
		// => Object 는 모든 클래스의 조상
		System.out.println("** Object Test **");
		objectTest(dog);
		objectTest(bear);
		
		// Test6) Animal Type 배열을 매개변수로 적용
		System.out.println("** Animal Type 배열 Test **");
		Animal[] ams = {new Cat(), new Dog(), new Eagle(), cat, dog, eagle};
		//ams[0].breathe(); OOOOO
		//ams[0].color();  XXXXX
		animalUse(ams);
	} //main
	
	// ** 메서드 오버로딩
	public static void animalUse(Animal[] ams) {
		for (int i=0; i<ams.length; i++) {
			ams[i].breathe();
			ams[i].sound();
			ams[i].special();
		}
	}
	public static void animalUse(Animal am) {
		am.breathe();
		am.sound();
		am.special();
	}
	
	public static void objectTest(Object ob) {
		System.out.println("** Your Address => "+ob);
	}
	
} //class
