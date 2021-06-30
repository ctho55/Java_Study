 package Mypersonalstudy;

 class CCar {
	 String color;
	 int door ;
	 
	 void drive() {
		 System.out.println("drive, Brrrr~");
	 }
	 
	 void stop() {
		 System.out.println("stop!!");
	 }
 }
 
 class FireEngine extends CCar {
	 void water () {
		 System.out.println("water!!!");
	 }
 }
 
 
public class EX01_Polymor {

	public static void main(String[] args) {
		//  참조변수의 형변환 예제
		CCar car = null;
		FireEngine fe = new FireEngine();
		//CCar c = new FireEngine();
		
		
		FireEngine fe2 = (FireEngine) car; // 조상 -> 자손으로 형변환
		CCar car2 = (CCar)fe2;  //자손 -> 조상으로 형변환
		car2.drive();// NullpointerException 발생
		
		
//		FireEngine fe = new FireEngine();
//		FireEngine fe2= null ;
//		
//		fe.water ();
//		car = fe; // car = (CCar)fe;  에서 형변환이 생략됨
//		//car.water(); // 에러. CC타입의 참조변수인 car 로는 water()를 사용불가.
//		
//		fe2 = (FireEngine)car; // 자손탑입 <-- 조상타입 형변환 생략불가
//		fe2.water();
	}

}
