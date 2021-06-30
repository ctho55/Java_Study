package j05_classMethod;

 
public class Ex04_callby {

public void carTest(EX01_car car, int count) {
		
		for (int i= 0 ; i< count ; i++) car.speedup();
		System.out.println(car.color+"color = " +car.speed);
	}

	public static void main(String[] args) {
		// 1. 현재 클래스의 인스턴스 생성
		Ex04_callby ex04 = new Ex04_callby();
		// 2. Car 인스턴스 생성
		EX01_car mycar = new EX01_car();
		mycar.color = "Blue";
		mycar.speed = 300 ;
		
		// 3. 메서드 호출 
		ex04.carTest(mycar, 5);
		System.out.println(mycar.toString());
		
		// 참조자료형 매개변수 전달방법 : 직접생성
		ex04.carTest(new EX01_car(), 10);
		
	}//main

}//class
