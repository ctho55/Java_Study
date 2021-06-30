package j16_thread;

import java.util.Random;

// ** Sleep & Priority Test

//** 우선순위 Test
// => 1 ~ 10 
// => 우선순위 default 값 확인 : 5 
//    단, 이전 스레드의 값을 전달 받음
//    ( 이전 스레드가 10 이었으면 동일한 10 이 기본 우선순위값이 됨 )
// => sleep Time 은 동일하고 우선순위 서로 다름 
// => 우선순위를 변경(set) 하는 생성자 추가 
//    우선순위를 지정할 땐 반드시 start 전에 해야 함.

// => sleepTime 있는 경우, 없는 경우 비교

class Rabbit01 implements Runnable {
   
   String name;
   int op ; // 기본 우선순위값 보관 위한 변수
   Rabbit01(String name, int p) {
      this.name=name;
      this.op = Thread.currentThread().getPriority();
      Thread.currentThread().setPriority(p); // 우선순위 변경
   }
   @Override
   public void run() {
      for (int i=50; i>0; i--) {
         System.out.println(name+" , op="+op+" , NewPriority="+Thread.currentThread().getPriority());
         try {
            Thread.sleep(10); // 단위 1/1000 초 , Thread 클래스에 정의된 static 메서드
         } catch (InterruptedException e) {
            System.out.println("InterruptedException => "+e.toString());
         } //try
      } //for
   } //run
} //class

// ** sleep Time Test
// => 우선순위는 동일하고 sleep Time 은 서로 다름 
class Rabbit02 extends Thread {
   private String name;
   private int sleepTime;
   
   Rabbit02(String name) {
      this.name=name;
      sleepTime = new Random().nextInt(1000);
   }
   
   @Override
   public void run() {
      System.out.println("** 토끼 출발 (Thread) **");
      System.out.printf("** ThreadName=%s, %s, sleepTime=%d **\n",
               Thread.currentThread().getName(),this.name,sleepTime);
      for (int i=50; i>0; i--) {
         System.out.printf("나는 토끼 %s i=%d \n", name, i);
         try {
            Thread.sleep(sleepTime); // 단위 1/1000 초
         } catch (InterruptedException e) {
            System.out.println("InterruptedException => "+e.toString());
         } //try
      } //for
   } //run
} //Rabbit02

public class Ex02_sleepRun {

   public static void main(String[] args) {
      
      //** Rabbit02 토끼 출발 : sleepTme Test
      Rabbit02 red = new Rabbit02("Red");
      Rabbit02 blue = new Rabbit02("Blue");
      
      
      //** 거북이 출발 : sleepTme Test
      System.out.println("** 거북이 출발 **");
      for(int i=50; i>0; i--) {
         System.out.println("나는 거북이 i = "+i);
         try {
            Thread.sleep(1); // 단위 1/1000 초
         } catch (InterruptedException e) {
            System.out.println("InterruptedException => "+e.toString());
         } //try
      } //for
      
      red.start();
      blue.start();
            
      //** Rabbit01 토끼 출발 : Priority Test
//      Thread pt01 = new Thread(new Rabbit01("01_MAX",Thread.MAX_PRIORITY));
//      Thread pt02 = new Thread(new Rabbit01("02_NORM",Thread.NORM_PRIORITY));
//      Thread pt03 = new Thread(new Rabbit01("03_MIN",Thread.MIN_PRIORITY));
//      pt01.start();
//      pt02.start();
//      pt03.start();
      
      System.out.println("** main Thread info **");
      // main 메서드 도  main쓰레드 => 다른 쓰레드와 마찬가지로 자신만의 실행 흐름을 이어감
      // main 이 종료 되어도 남은 쓰레드는 실행됨
      // 모든 쓰레드가 종료 되어야 프로그램은 종료됨.
//      System.out.println("** getState()=> "+ Thread.currentThread().getState());
//      System.out.println("** getName()=> "+ Thread.currentThread().getName());
//      System.out.println("** getPriority()=> "+ Thread.currentThread().getPriority());
//      System.out.println("** MAX_PRIORITY => "+ Thread.MAX_PRIORITY);
//      System.out.println("** NORM_PRIORITY => "+ Thread.NORM_PRIORITY);
//      System.out.println("** MIN_PRIORITY => "+ Thread.MIN_PRIORITY);
      System.out.println("** Program_main() Stop **");
   } //main
} //class