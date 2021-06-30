package j06_classExtends;

// 메서드 오버라이딩
// static m final

public class Ex03_01Father {

	static String country = "korea";
	String name = "홍길동";
	private int money;
	
	Ex03_01Father(){System.out.println("Ex03_01Father default 생성자");}
	
	Ex03_01Father(String name, int money){
		System.out.println("name , money 초기화 생성자");
		this.name = name;
		this.money = money;
		}
	
	public void info() {
		System.out.printf("Father info :%s, name=%s, money=%d \n",country,name,money);
	}
	
	public void bank(int money) {
		this.money+=money;
		System.out.println("Father Total money"+this.money);
	}
	
	public static void main(String[] args) {
		//
		Ex03_01Father f1 = new Ex03_01Father("홍길동",1000);
		f1.info();
		f1.bank(1000);
		
		//생성과 동시에 초기화 
		Ex03_01Father f2 = new Ex03_01Father("고길동",3300);
		f2.info();
		f2.bank(-1100);
		
	}//main

}//class
