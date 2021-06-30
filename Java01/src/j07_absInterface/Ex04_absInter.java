package j07_absInterface;

// ** 추상클래스 와 intertrace 의 활용 
// => 일반적인 경우 사례
// => 실무에서는 interface 가 많이 사용되고,  
//    API 의 계층도에서는 추상클래스도 많이 이용됨 

// ** 과제
// => 게시판을 종류별로 10개 이상 만든다고 가정.
// => 기본 기능 (interface) : insert, update, delete, listPrint, detail, replyInsert
// => 게시판 종류별로 : 일반게시판(i,u,d,l,detail,r), QnA(i,r,l), 공지사항(i,l,detail)
// => 모든 게시판은 interface 를 구현해야한다면
//    게시판 종류에 따라 필요없는 메서드도 오버라이딩 해야함.
//    이런 경우 interface 를 구현하는 추상 클래스를 작성하고
//    게시판은 이 추상클래스를 구현한다면 의무적 구현에서 벗어나 필요한 메서드만 구현 할 수 있음.

interface Boardi {
	void insert();
	void update();
	void listPrint();
	void detail();
}
// ** 추상클래스
// => 추상클래스가 interface 를 구현하는 경우에는, 추상메서드를 구현 하지 않아도 됨. 
// => 모든 게시판에서 구현해야하는 insert , listPrint 만 추상으로
//    나머지는 body를 구현해 놓음으로 의무를 완화시켜줌.
abstract class BoardA  implements Boardi {
//	@Override
//	public  abstract void insert();
//	@Override
//	public abstract void listPrint();

	@Override
	public void update() {  	}
	@Override
	public void detail() {  	}
}

class Memberb extends BoardA {
	@Override
	public void insert() { System.out.println("** Memberb Insert **"); }
	@Override
	public void listPrint() {System.out.println("** Memberb listPrint **"); }
	@Override
	public void detail() { System.out.println("** Memberb detail **"); }
}

class QnABoard extends BoardA {
	@Override
	public void insert() { System.out.println("** QnABoard Insert **"); }
	@Override
	public void listPrint() {System.out.println("** QnABoard listPrint **"); }
}

public class Ex04_absInter {

	public static void main(String[] args) {
		Memberb mb = new Memberb();
		mb.insert();
		mb.listPrint();
		mb.detail();
		
		QnABoard qb = new QnABoard();
		qb.insert();
		qb.listPrint();
		
		// ** 다형성 적용
		BoardA ba = new QnABoard();  // Memberb() , QnABoard() 
		ba.insert();
		ba.listPrint();
		ba.detail();  
		// QnABoard 에는 구현하지 않았으나, 조상인 BoardA 에 있으므로 오류 없음.
		
	} //main
} //class
