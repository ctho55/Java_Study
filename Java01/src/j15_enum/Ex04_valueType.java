package j15_enum;

// ** enum 의 내부
// => enum은 class, interface와 동급의 형식을 가지는 단위임.
// => 실상은 class 이지만, enum만을 위한 문법적 형식을 가지고 있기 때문에
//    클래스와 구분하기 위해서 enum이라는 키워드를 사용함.
// => 아래 코드의 내부는 다음과 같다.

// class Fruit{
//    public static final Fruit APPLE  = new Fruit();
//    public static final Fruit PEACH  = new Fruit();
//    public static final Fruit BANANA = new Fruit();
//    private Fruit(){}
// }

// => 생성자의 접근 제어자가 private
//    그러므로 클래스 Fruit를 인스턴스로 만들수없도록 하여 다른 용도로 사용하는 것을 금지함. 
// => 위 생성자는 사용가능하다. 
// 

enum Fruit {
	//APPLE, BANANA, PEACH;	
	// ** 기본 생성자 사용하기
	//private Fruit(){System.out.println("Call Constructor "+this);}
	
	// ** 변수, 생성자 추가하기
	APPLE("Red"), BANANA("Yellow"), PEACH("Pink");
	String color;
	Fruit(String color){
	  System.out.println("Call Constructor "+this);
	  this.color = color;
	} //생성자2
	
	// ** 메서드 추가
	String getColor() { return this.color; 	}
}

enum Company {
	ORACLE, NAVER, APPLE	
}

public class Ex04_valueType {

	public static void main(String[] args) {
		// ** 값과 타입 비교
		// => 값과 타입을 동시에 확인하기때문에 안전한 코딩 가능
		// => 즉, enum이 서로 다른 상수 그룹에 대한 비교를 컴파일 시점에서 차단시켜줌.
		
		//if (Fruit.APPLE == Company.APPLE ) 
		//	System.out.println(" ** 컴파일 오류 발생 => 그러므로 안전 **");
		
	Fruit f = Fruit.PEACH;
	switch(f) {
	case APPLE : System.out.println("** 57 kcal , color = "+Fruit.APPLE.color); break;
	case BANANA: System.out.println("** 93 kcal , color = "+Fruit.BANANA.getColor()); break;
	case PEACH : System.out.println("** 34 kcal , color = "+Fruit.PEACH.getColor()); break;
	}
	
	Company c = Company.APPLE;
	switch(c) {
	case APPLE : System.out.println("** 연봉 5천 **"); break;
	case ORACLE: System.out.println("** 연봉 6천 **"); break;
	case NAVER : System.out.println("** 연봉 7천 **"); break;
	}

	} //main
} //class
