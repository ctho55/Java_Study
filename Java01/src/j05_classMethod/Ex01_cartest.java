package j05_classMethod;

public class Ex01_cartest {
	public static void main(String[] args) {
		//1.객체일생 : 객체사용  생성 --> 사용 -->소멸
		// 인스턴스 mycar, ucar 생성
		Ex01_Car mycar = new Ex01_Car();
		Ex01_Car ucar = new Ex01_Car();
		
		mycar.color = "Yellow" ;
		mycar.speed = 100;
		mycar.mileage = 15000;
		System.out.println("mycar ="+ mycar.toString());
		System.out.println("mycar ="+ mycar);
		// toString() :클래스에서 toString() 메서드를 작성해놓으면 
		// 인스턴스명을 사용했을때 자동 호출됨
		// 클래스의 속성값들을 편리하게 출력해줌
		//소멸 : 메모리청소
		//mycar=null;
		//System.out.println("mycar ="+ mycar.toString());
		
		ucar.color = "REd" ;
		ucar.speed = 200;
		ucar.mileage = 25000;
		System.out.println("mycar ="+ ucar.toString());
	}
}
