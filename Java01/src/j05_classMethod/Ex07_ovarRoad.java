package j05_classMethod;

// Method OverLoading
// 하나의 클래스내에서 매서드 이름의 중복 허용
// 단, 매개변쉬 갯수 또는 타입이 반드시 달라야 함

// 과제
// 두수를 입력받아 add 연산 결과를 return 하는 메서드를 만든다. 
// 단 , 모든 기본자료형의 인자를 사용할 수 있도록 한다.
public class Ex07_ovarRoad {

	public static int add(int a,int b){ return a+b ;}
	public static double add(int a, double b){ return a+b ;} 
	public static double add(double a, int b){ return a+b ;} 
	public static double add(double a, double b){ return a+b ;} 
	
	public static void main(String[] args) {
		//Ex07_ovarRoad ad = new Ex07_ovarRoad();
		
		System.out.println("add(int a,int b) = "+ add(10,20));
		System.out.println("add(int a, double b) = "+ add(10,12.2));
		System.out.println("add(double a, int b) = "+ add(15.5,10));
		System.out.println("add(double a, double b) = "+ add(12.8,24.7));
		
	}

}
