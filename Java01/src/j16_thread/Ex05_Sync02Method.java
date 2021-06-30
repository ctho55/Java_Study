package j16_thread;


//** 동기화 블럭 지정 
//=> 동기화를 지정하지않은 경우와 지정한경우 비교

class Calculator {
int count=0 ; // 연산 횟수 Count
int iTot = 10000;
int uTot = 10000;
// 입금 ( U -> I 에게 입금)
// ** 동기화 전
//public void add(int m) {
//   count++;
//   iTot +=m;
//   uTot -=m;
//   System.out.printf("*입금 iTot=%d, uTot=%d, count=%d \n", iTot, uTot, count);
//} //add
// ** 동기화 후
public void add(int m) {
   synchronized (this) {
      // this : 동기화 대상을 알리는 용도
      //     => 즉, 호출된 인스턴스의 메서드를 대상으로 한다는 의미
      count++;
      iTot +=m;
      uTot -=m;
      System.out.printf("*입금 iTot=%d, uTot=%d, count=%d \n", iTot, uTot, count);
   } // synchronized
} //add
// 출금 (I-> U 에게 입금)
// ** 동기화 전
//public void min(int m) {
//   count++;
//   iTot -=m;
//   uTot +=m;
//   System.out.printf("*출금 iTot=%d, uTot=%d, count=%d \n", iTot, uTot, count);
//} //min
// ** 동기화 후
public void min(int m) {
   synchronized (this) {
      count++;
      iTot -=m;
      uTot +=m;
      System.out.printf("*출금 iTot=%d, uTot=%d, count=%d \n", iTot, uTot, count);
   } //synchronized
} //min

// 총연산 횟수 출력
public void showCount() {
   System.out.printf("*총연산 횟수 = %d \n", count);
}
} //Calculator

class AddThread extends Thread {
Calculator cal;
AddThread(Calculator cal) { this.cal=cal; }
@Override
public void run() {
   cal.add(1000);
   cal.add(1000);
} // run
} // class

class MinThread extends Thread {
Calculator cal;
MinThread(Calculator cal) { this.cal=cal; }
@Override
public void run() {
   cal.min(500);
   cal.min(500);
} // run
} // class

public class Ex05_Sync02Method {

public static void main(String[] args) {
   Calculator cal = new Calculator() ;

   AddThread at1 = new AddThread(cal);
   MinThread mt1 = new MinThread(cal);
   AddThread at2 = new AddThread(cal);
   MinThread mt2 = new MinThread(cal);
   AddThread at3 = new AddThread(cal);
   // 1) join 없는 경우
   at1.start();
   mt1.start();
   at2.start();
   mt2.start();
   at3.start();
   // 2) join
   try {
      at1.join();
      mt1.join();
      at2.join();
      mt2.join();
      at3.join();
   } catch (Exception e) {
      System.out.println("** Main Exception => "+e.toString());
   }
   cal.showCount();
   System.out.println("** Main Stop **");
} //main
} //class
