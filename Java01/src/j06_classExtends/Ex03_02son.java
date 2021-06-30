package j06_classExtends;

public class Ex03_02son {
	static String country = "korea";
	String name = "홍길동";
	int money;
	
	Ex03_02son() {System.out.println("son default 생성자");}
	
	
	Ex03_02son(String name, int money){
		System.out.println("son name , money 초기화 생성자");
		this.money = money;
		this.name = name; 
			}
	
	public void info() {
		System.out.printf("\n son info : %s, name= %s, money = %s\n",country, name ,money );
	}// super.country , this,name , this.money
	
	public void bank (int money) {
		this.money += money;
		System.out.println("son Total money ="+ this.money);
		
	}
	public static void main(String[] args) {
		Ex03_02son s1 = new Ex03_02son();
		s1.money = 1200;
		s1.name = "고희동";
		s1.info();
		s1.bank(500);
		
		
	}

}
