package j05_classMethod;



public class EX01_car {

	public int speed ;
	public int mileage ;
	public String color ;
	
	public void speedup() {
		int k= 100;
		speed += k;
	}
	
	public void speeddown() {
		speed -=50 ;
	}
	
	
	public String toString() {
		return "speed "+speed + " mileage "+mileage + " color "+color;
	}
	public static void main(String[] args) {

	}

}//class 
