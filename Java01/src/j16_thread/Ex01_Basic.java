package j16_thread;

// ** Thread 클래스 구현
// 1) Thread 클래스 상속
// 2) Runnable interface 구현

// ** run() 메서드
// => thread 실행의 주체 메서드
// => 생성된 thread 의 main 메서드
// => thread 를 통해 실행 하려는 기능 (객체가 해야되는 일) 을 여기에 작성함.
// => start 메서드 호출에 의해 실행됨.
//    자신의 일을 다 마치면 (run 메서드의 종료) 자동으로 소멸됨   

// ** Thread 클래스 source
// => Runnable 을 구현함.
// public class Thread implements Runnable { ....

// => 생성자 중 -> Runnable 을 구현한 MyThread02 생성시 이용됨
// public Thread(Runnable target) {
// this(null, target, "Thread-" + nextThreadNum(), 0);
// }

class MyThread01 extends Thread {
	@Override
	public void run() {
		for (int i=0; i<50; i++) {
			//조상 Thread의 getName() 호출
			System.out.printf("Thread01 i=%d , Thread Name=%s \n", i, getName()); 
		} //for
	} //run
} //MyThread01

class MyThread02 implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<50; i++) {
			// Thread 의 getName() 직접 호출 불가능
			// => Thread.currentThread() : 현재 실행중인 Thread 를 반환함
			System.out.printf("Thread02 i=%d , Thread Name=%s \n", i, Thread.currentThread().getName()); 
		} //for
	} //run
} //MyThread02

public class Ex01_Basic {

	public static void main(String[] args) {
		// ** 생성
		// 1) Thread01 생성
		MyThread01 t01 = new MyThread01();
		
		// 2) Thread02 생성
		//Runnable r = new MyThread02() ;
		//Thread t02 = new Thread(r) ;
		
		Thread t02 = new Thread(new MyThread02());
		//Runnable 을 구현 한 것만으로는 Thread 클래스의 start 메서드를 호출 할 수 없으므로
		//Runnable 의 참조값(인스턴스)을 이용하여 Thread 생성해야 함 
		//Thread 클래스의 생성자 중에는 Runnable 인터페이스의 참조값(인스턴스)을 인자로 하는 생성자가 구현되어있음				
		//=> 생성자 Thread(Runnable target)
		
		// ** 실행
		// => start() 호출 -> run() 을 실행함
		t01.start();
		t02.start();
		
		// ** 비교 : run() 직접호출 
		// => multi thread 는 실행되지 않고 main 이 일반 메서드 호출 실행.  
		//t01.run();
		//t02.run();
		
		System.out.println("** Program_main() Stop **");
	} //main
} //class
