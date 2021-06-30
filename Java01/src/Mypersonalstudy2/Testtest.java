package Mypersonalstudy2;

import javax.swing.JOptionPane;

public class Testtest {
    public static void main(String[] args) throws Exception {
         ThreadEx9_1 th1 = new ThreadEx9_1();
         th1.start();

        String input = JOptionPane.showInputDialog("아무거나 입력하세요");
        System.out.println("입력하신값은 "+input+"입니다.");
        th1.interrupt(); // 주의) 여기서 interrupted() 메서드 호출시 메인쓰레드가 false가 된다.(static 메서드라서)
        System.out.println("isInterrupted(): "+ th1.isInterrupted()); // isInterrupted가 해당 쓰레드의 상태확인.
    }
}

class ThreadEx9_1 extends Thread{

    public void run(){
        int i = 10;

        while (i!=0 && !isInterrupted()) // 기본적으로 interrupted 값은 false
        {
            System.out.println(i--);


            try{
                sleep(1000);
            }catch (InterruptedException e){
                System.out.println("ㅎㅇ");
            }      //  질문하기 … for로는 작동 잘됨

            //  for(long x=0;x<2500000000l ;x++); // 단순 지연용


       }
        System.out.println("카운트다운 종료");
    }
}