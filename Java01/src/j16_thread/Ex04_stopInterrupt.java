package j16_thread;

//** 스레드 종료
//=> run()이 종료하면 스레드 종료
//=> 타 스레드에 의한 강제종료 Test (ppt 35p)

//***  InterruptedException
//
//말 그대로 Thread가 중단되었을 때 발생하는 예외.
//interrupt()메소드를 사용해 Thread를 중단시킬 때도  발생함.
//즉, wait()메소드나 sleep() 메소드를 사용해 Thread가 대기 상태로 들어갔다가
//깨어나지 못 할때 발생하는 예외 또한,
//interrupt()메소드를 사용해 Thread를 중단시킬 때도  발생함.

class PrintThread extends Thread {

	@Override
	public void run() {
		// ** 강제 종료 Test
		// 1) 타 스레드에 의해 InterruptedException이 발생
		// => try ~ catch 블럭에서 종료 처리
		// => 타 스레드 : interrupt() 메서드 호출하면 InterruptedException이 발생됨

//		try {
//			while(true) {
//				System.out.println("** 실행중 1 **");
//				sleep(1);
//			}
//		} catch (InterruptedException e) {
//		 System.out.println("InterruptedException =>"+ e.toString());	
//		 //무조건 메서드 종료
//		 return ; 
//		 
//		}
//		System.out.println("** 자원 정리");
//		System.out.println("** run 종료");

		// Test2) interrupted() 를 이용
		while (true) {
			System.out.println("실행중 2 ");
			if (Thread.interrupted())
				break; // 반복문 종료
		}
		System.out.println("자원 정리");
		System.out.println("RUB 정료");
		
		
		
		
	}// run

}// PrintThread

public class Ex04_stopInterrupt {

	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("main InterruptedException =>" + e.toString());
		}
		System.out.println("Main Interrupt() 호출 ");
		pt.interrupt();
		// => 타 스레드 : interrupt() 메서드 호출하면 InterruptedException이 발생됨
		// => 해당 스레드의 interripted()를 true 로 해줌
		System.out.println("Program main() Stop");
	}// main
}// class
