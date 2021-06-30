package j16_thread;



//wait, notify , notifyAll()
//=> Object 클래스에 정의되어 있음 
//동기화된 블럭 내에서만 적용 가능 
//=> notifyAll()
// wait() 로 대기중인 모든 스레드를 깨우고 모두 RUNNABLE 상태로 만든다. 

class Worker {
	public synchronized void methodA() {
		System.out.println("methodA() 작업중");
		notify();//wait()에 의해 Block 되어있는 현재 Thread를 깨움
		try {
			wait(); // 자신을 wait로
		} catch (Exception e) {
			System.out.println("Exception " + e.toString());
		}

	}

	public synchronized void methodB() {
		System.out.println("methodA() 작업중");
		try {
			wait(); // 자신을 wait로
		} catch (Exception e) {
			System.out.println("Exception " + e.toString());
		}

	}
}// Worker

	class ThreadA extends Thread {
		Worker worker;
		ThreadA(Worker worker){this.worker=worker;}
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				worker.methodA();
				System.out.println("Thread i =>" + i);
			}
		}
	}

	
	class ThreadB extends Thread {
		Worker worker;
		ThreadB(Worker worker){this.worker=worker;}
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				worker.methodB();
				System.out.println("Thread i =>" + i);
			}
		}
	}
	

public class Ex06_waitnotify {

	public static void main(String[] args) {
		Worker wk = new Worker() ;
		
		ThreadA ta = new ThreadA(wk) ;
		ThreadB tb = new ThreadB(wk) ;		
		
		ta.start();
		tb.start();
	}

}
