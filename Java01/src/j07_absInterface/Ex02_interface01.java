package j07_absInterface;

// ** interface I.
// * 기본 특징
// => 상수와 추상메서드만 정의 가능함. 
//    즉, 추상을 더 강화한것임
// => 단, Java8 부터 static, default 메서드가 추가 되었고,
//    이들은 인터페이스내에서 구현가능하고 후손클래스의 오버라이딩 의무 없음 
// => 기본적인 키워드 생략가능
//    상수 앞의 static final,  메서드 앞의 public abstract
// => 직접 인스턴스를 생성하지 못함.
//    그러나 참조형 변수로 선언은 가능하다.
//    그리고 후손으로 인스턴스를 생성할 수 있음.
// => 다형성의 적용은 가능하다.

interface NumInter {
	// static final int NUM = 100;
	int NUM = 100;
	// public abstract int getNum();
	int getNum();
} //NumInter

class NumChild1 implements NumInter {
	// ** 오버라이딩
	// => 반드시 조상의 접근범위보다 같거나 넓어야함
	@Override
	//int getNum() {   // 조상은 public, 나는 default => 오류 
	public int getNum() {
		return NUM;
	}
} //NumChild1 

class NumChild2 implements NumInter {
	@Override
	public int getNum() {
		return NUM*NUM;
	}
} //NumChild2

public class Ex02_interface01 {

	public static void main(String[] args) {
		
		NumChild1 nc1 = new NumChild1();
		System.out.println("nc1.getNum()=> "+nc1.getNum());
		
		NumChild2 nc2 = new NumChild2();
		System.out.println("nc2.getNum()=> "+nc2.getNum());
		
		// 인터페이스는 직접 인스턴스를 생성하지 못함.
		// 그러나 참조형 변수로 선언은 가능하다.
		// => 다형성 적용 가능
		//NumInter ni = new NumInter(); // XXXXXXX
		NumInter ni = new NumChild1();
		System.out.println("ni.getNum()=> "+ni.getNum());

	} //main
} //class
