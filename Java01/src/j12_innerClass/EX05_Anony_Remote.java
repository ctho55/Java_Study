package j12_innerClass;

//** 실습
//추상 메서드가 2개 있는 interface 를 정의하고 
//이를  main 메서드에서 익명 클래스를 이용해서 구현하고
//실행 시켜 보세요 ~~ 

interface RemoteControl{
	void turnOn();
	void turnOff();
}//RemoteControl





public class EX05_Anony_Remote {

	
	
	public static void main(String[] args) {
		
		RemoteControl rm = new RemoteControl() {
			public void turnOn() {
				System.out.println("turnOn");
			}//on
			public void turnOff() {
				System.out.println("turnOff");
			}//off
		};//new
		rm.turnOn();
		rm.turnOff();
		
	}//main

}//class
