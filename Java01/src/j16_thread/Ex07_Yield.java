package j16_thread;

// Thread yield()
// Thread 양보 

class ThreadY extends Thread {
	boolean stop = false ;
	boolean work = true ;
	
	@Override
	public void run() {
		while (!stop) {
			if(work) System.out.println("ThreadY 열심히 일합니다");
			else {
				System.out.println("ThreadY yield() -> 양보");
				Thread.yield();//running -> runnable
			}
		}//while
		System.out.println("ThreadY 종료");
	}//run
}

class ThreadZ extends Thread {
	boolean stop = false ;
	boolean work = true ;
	
	@Override
	public void run() {
		while (!stop) {
			if(work) System.out.println("ThreadZ 열심히 일합니다");
			else {
				System.out.println("ThreadYZ yield() -> 양보");
				Thread.yield();//running -> runnable
			}
		}//while
		System.out.println("ThreadZ 종료");
	}//run
}



public class Ex07_Yield {

	public static void main(String[] args) {
		ThreadY ty = new ThreadY();
		ThreadZ tz = new ThreadZ();
		
		ty.start();
		tz.start();
		
		//Test1 
		//처음에는 y,z 번갈아가면서 실행 하다가
		//=> ty.work=false ->ty는 계속 양보, tz 는 무한 ..
		
		try {
			Thread.sleep(10);
		} catch (Exception e) {e.printStackTrace();
			ty.work=false;
		}
		
		try {
			Thread.sleep(10);
		} catch (Exception e) {	e.printStackTrace();
			ty.stop = true;	
			tz.stop = true;
		}
		
		
		System.out.println("Main Stop");

	}//main
}//class
