package j05_classMethod;

// 맴버 메서드 (method) : 함수(function) 프로시져(procedure)
// 1)정의, 실행
// 2)매개변수
// 매개변수 (argument,인자), parameter
// 매서드의 지역변수이며, 모든 타입 가능
// 매개 변수 전달방법
// CallByValue(기본자료형, 매개변수값 전달)
// CallByValue(참조자료형, 주소 전달)
// return 값

public class EX02_Method01 {
	int price = 5000;
	
	//System.out.println();
	//클래스에 직접 실행문을 사용할 수 없음
	
	//0. 매개변수,return 모두 없는 경우
	public void juiceMachine0() {
		System.out.println("어서오세요 주스가게입니다");
	}
	
	//1. 매개변수는 있지만 return 없는 경우
	public void juiceMachine(String s) {
		System.out.println(s+"쥬스를 만들었습니다");
	}
	
	//2. 매개변수는 없지만 return 있는경우
	public int juiceMachine2(String s, int c) {
		return price*c ;
	}
	
	//3. 매개변수, return 모두 있는경우
	public int juiceMachine3(String s, int c) {
		System.out.println(s+" 쥬스 "+c+" 잔 주문 ");
		return price*c ;
	}
	
	public static void main(String[] args) {
		EX02_Method01 m01 = new EX02_Method01();
		m01.juiceMachine0();
		m01.juiceMachine("orange");
		
		System.out.println("juiceMachine2= "+m01.juiceMachine2("lemon", 5));
		System.out.println("juiceMachine3= "+m01.juiceMachine3("mellon", 3));
	}

}
