 package Mypersonalstudy2;

public class test {

   public static void main(String[] args) {
//      Unit[] group = {new Marine(), new Tank(), new Dropship() }; //생성 + 초기화
      
      Unit[] group = new Unit[3]; //객체 배열= 참조변수 묶은것 // 공통적인부분
      group[0] = new Marine();
      group[1] = new Tank();
      group[2] = new Dropship();
      
      
//      Object[] group = new Object[3]; //객체 배열= 참조변수 묶은것 // object로 하면 리모컨 move가 없어서 하단에 오류
//      group[0] = new Marine();
//      group[1] = new Tank();
//      group[2] = new Dropship(); 
      
      group[0].move(100, 200); // Marine 객체의 move(100,200)호출
      group[1].move(100, 200);// Tank 객체의 move(100,200)호출
      group[2].move(100, 200);// Dropship 객체의 move(100,200)호출
   
      Unit unit = new Dropship(); // 조상 클래스를 자손 클래스로 참조 
      if(unit instanceof Marine) { 
         // unit이 martine으로 형변환 가능한지
         //위에서 조상클래스를 자손 클래스로 참조하면 true
         // 조상 클래스 에 참조된 자손클래스랑 다른 걸 우측에 넣으면 false
         Marine m = (Marine)unit; //
         m.stimPack();
      }
      
     
      
      
      Unit un = new Dropship(); // 조상 클래스를 자손 클래스로 참조
      if(un instanceof Dropship) {
         // unit이 martine으로 형변환 가능한지
         //위에서 조상클래스를 자손 클래스로 참조하면 true
         // ㅈ
         Dropship d = (Dropship)un;
         d.unload();
      }
      
      
//   Dropship d = new Dropship();
//      d.stop(); // 에러 

       
      
      
      

      
   
      // group[0] = 참조변수 
//     for (int i =0; i < group.length; i++)
//        group[i].move(100, 200);
      

      
      
}

}







abstract class Unit {
   int x, y;
   
   abstract void move(int x, int y); // 추상 메서드라도 만들어서 리모컨에 호출
    void stop() {/*현재 위치에 정치*/}
    void cancel() {/*모든 행동 취소*/}
}

class Marine extends Unit { // 보병
   void move (int x, int y) {
      System.out.println("Marine[x="+ x + ",y="+y+"]");
      
   }
   void stimPack() {/*스팀팩을 사용한다. */
      System.out.println("이동속도 + 5 향상");
   }
}
 class Tank extends Unit {
    void move (int x, int y) { //탱크
       
       System.out.println("Tank[x=" + x + ",y=" + y +"]");
       
    }
    void changeMode() {/* 공격모드로 변환한다 */}
 }
 class Dropship extends Unit {
    void move (int x, int y) { //수송선
       
       System.out.println("Dropship[x=" + x + ",y=" + y +"]");
    }
    
    void load() {/* 선택된 대상을 태운다.*/}

 void unload() {
    System.out.println("모든 마린을 내립니다");
    /*선택된 대상을 내린다*/}
 
 }