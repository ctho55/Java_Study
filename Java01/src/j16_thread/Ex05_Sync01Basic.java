package j16_thread;

//동기화의 필요성
//** 동기화의 필요성
//** 해결
//=> 1. 메서드에 synchronized 선언
//=> 2. 메서드에 synchronized block(영역) 을 지정


class Increment {
	int num = 0;

	//public void increment() {num++;}

	public synchronized void increment() {num++;}
	// 실행중인 스레드가 완전히 작업을 마칠때 까디 다른 스레드가 접근하지 못하도록 함.
	
	
	
	public int getNum() {
		return num;
	}
}// InTread

class InThread extends Thread {
	Increment inc;

	InThread(Increment inc) {
		this.inc = inc;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				inc.increment();
				System.out.println("Thread name " + getName());
			} // for j
		} // for i

	}// run

}// InThread

public class Ex05_Sync01Basic {

	public static void main(String[] args) {

		Increment inc = new Increment();

		InThread it1 = new InThread(inc);
		InThread it2 = new InThread(inc);
		InThread it3 = new InThread(inc);
		// 동기화 되어 있지 않은 경우
		// => increment()메서드 num++ 이 완료되지 않은 상태에서 
		//    다른 스레드가 값을 사용하게 되어 부정확한 결과를 만들게 됨 
		
		
		//1) start 만 한 경우 , 값 부정확
		it1.start();
		it2.start();
		it3.start();
		try {
			// 2) join 적용
			it1.join();
			it2.join();
			it3.join();
		} catch (Exception e) {
			System.out.println("Exception" + e.toString());
		}

		System.out.println("main GetNum" + inc.getNum()); 
		System.out.println("Main Stop");

	}// main
//class
}
