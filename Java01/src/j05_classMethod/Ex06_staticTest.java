package j05_classMethod;

// 외부클래스 에서 static, non-static 접근 


public class Ex06_staticTest {

	public static void main(String[] args) {
		// static 멤버 접근 
		Ex06_static.total = 100 ; 
		System.out.println(Ex06_static.total);

		System.out.println(Ex06_static.addr(10, 3));
		System.out.println(Ex06_static.total);
		
		// 인스턴스 멤버 접근 
		Ex06_static ex06 = new Ex06_static();
		ex06.result = 1000;
		System.out.println("addr  "+ ex06.addr(10, 3));
		System.out.println("minus  "+ex06.minus(10, 3));
//		System.out.println("multiple  "+ex06.multiple(0, 0));
//		System.out.println("division  "+ex06.division(0, 0));
		System.out.println("total  "+ Ex06_static.total);
		System.out.println("result  "+ ex06.result);
		
		
	}//main
}//class
