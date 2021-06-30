package j08_CastingEncap;

// *** 클래스의 형변환
// => 자동 형변환 (형변환 생략가능)
//    조상 <- 자손 (Up_Casting)

// => 명시적 형변환 (형변환 생략불가능)
//    자손 <- 조상 (Down_Casting)
//    실제적 클래스타입이 변환가능한 경우에만 적용됨 
//    (변환불가능한 경우에는 컴파일 오류 없어도 런타임 오류(ClassCastException) 발생)

//Animal => Mammal 포유류  => PetAnimal
//Animal => Reptil 파충류 

class Animal {
	int legsA=2;
	String name;
	public Animal() {System.out.println("** Animal 생성자 **"); }
	public Animal(String name) { this.name=name ;}
	void breath() {
		System.out.println(name +" 는 숨을 쉽니다 ~~");
	}
} // Animal

class Mammal extends Animal {
	String cry ;
	int legs=3;
	public Mammal() {System.out.println("** Mammal 생성자 **"); }
	void crying() {
		System.out.println(super.name+ " 은(는) "+cry + " 웁니다 ~~");
	}
} // Mammal

class PetAnimal extends Mammal {
	int legs=4 ;
	PetAnimal() { System.out.println("~~ PetAnimal 생성 ~~"); }
	void legsPrint(int legs) {
		System.out.printf("%s의 다리 => (Local):%d, Pet(Global):%d, Mam(Father):%d, Ani(할아버지):%d \n"
						,name,legs,this.legs,super.legs, super.legsA) ;
	} 
} //PetAnimal

class Reptile extends Animal {
} // Reptile




public class Ex01_ClassCasting {
	public static void main(String[] args) {
		
		PetAnimal dog = new PetAnimal() ;
		// ** instanceof Test
		if (dog instanceof PetAnimal) System.out.println("~~ dog 는 PetAnimal 입니다 ~~");
		if (dog instanceof Mammal) System.out.println("~~ dog 는 Mammal 입니다 ~~");
		if (dog instanceof Animal) System.out.println("~~ dog 는 Animal 입니다 ~~");
		if (dog instanceof Object) System.out.println("~~ dog 는 Object 입니다 ~~");
		
		// ** Casting Test
		Animal an1 = new PetAnimal() ; // Up_Casting
		//PetAnimal pa = new Animal() ;  // Down_Casting (XXXXXX)
		//an1.legsPrint(4); // 조상에 없는 맴버 접근 불가능
		
		Animal an2 = new Animal() ;
		// an1 과 an2 는 다르다
		//an2 = dog ; // Up_Casting 허용 , an2에 정의된 맴버만 접근허용
		// an2.legsPrint(4);  XXXXXXX 
		dog.legsPrint(4);
		
		// Down_Casting -> 명시적으로
		dog = (PetAnimal)an1;   // 컴파일 오류 , 런타임 오류 모두 발생하지 않음
		//dog = (PetAnimal)an2; // 컴파일 오류 없지만 , 런타임 오류(ClassCastException) 발생 (62행 an2 = dog; 없다면)
		dog.legsPrint(10);
		
		// ** 인스턴스의 Class Type 출력하기
		System.out.println("~~ dog ClassType => "+ dog.getClass().getName());
		System.out.println("~~ an1 ClassType => "+ an1.getClass().getName());
		System.out.println("~~ an2 ClassType => "+ an2.getClass().getName());

	} //main
} //class
