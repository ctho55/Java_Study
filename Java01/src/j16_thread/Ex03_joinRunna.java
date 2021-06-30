package j16_thread;


//병렬처리 실습
//=> 1~100까지의 합을 구하는 것을 멀티스레드로 처리하기 
//=> Sum2 class ,Adder2 는 Runnable interface 구현

class  Sum2 {
	int start, end ,num ;
	
	
	void addNum(int i) {
 		num += i ;
 	}
 	int getNum() {
 		return num;
 	}

}

class Adder2 extends Sum2 implements Runnable {
    
     
     Adder2(){}
     Adder2(int e , int s){
 		this.start = e;
 		this.end = s;
 	} 
     
	@Override
	public void run() {
		for(int i =start ; i<=end ; i++) {
			addNum(i);
			System.out.println("start => "+start+ "num =>"+ num);
		}//for 
	}//run
	
	
	
}



public class Ex03_joinRunna {

	public static void main(String[] args) {

		Adder2 aa1 = new Adder2(1,50);
		Adder2 aa2 =new Adder2(51,100);
		Thread ad1 = new Thread(aa1);
		Thread ad2 = new Thread(aa2);
		
		ad1.start();
		ad2.start();
		try {
			ad1.join();
			ad2.join();
		} catch (Exception e) {
			System.out.println("main Exception =>"+e.toString());
		}
	
		
		
		System.out.println("main 총합계 => "+ (aa1.getNum()+aa2.getNum()));
	
		System.out.println("Program main() Stop");
		
	}

}//class
