package j16_thread;

//병렬처리 실습 
// => 1~100 까지의 합을 구하는것을 멀티스레드로 처리하기 

interface Sum {
	// 상수와 추상메서드
	void addNum(int i);

	int getNum();
}

class Adder extends Thread implements Sum {
	int start, end, num;

	Adder(int s, int e) {
		this.start = s;
		this.end = e;
		num = 0;
	}// 생성자

	@Override
	public void addNum(int i) {
		num += i;
	}

	@Override
	public int getNum() {
		return num;
	}

	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			addNum(i);
			System.out.println("start =>" + start + " num =>" + num);
		} // for

	}// run

}// Adder

public class Ex03_joinThread {

	public static void main(String[] args) {

		Adder ad1 = new Adder(1, 50);
		Adder ad2 = new Adder(51, 100);

		ad1.start();
		ad2.start();
		try {
			ad1.join();
			ad2.join();
			// join() : 해당 쓰레드가 종료 될 때 까지 상위 쓰레드 실행 멈춤 
			// ad1, ad2가 종료 되어야 다음 문장 실행됨
		} catch (Exception e) {
			System.out.println("main Exception =>"+e.toString());
		}

		System.out.println("main 총합계 => " + (ad1.getNum() + ad2.getNum()));
		System.out.println("Program main() Stop");

	}// main

}// class
