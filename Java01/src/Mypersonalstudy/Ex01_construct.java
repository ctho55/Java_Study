package Mypersonalstudy;

class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);
	}
	
	Car(String color){
		this(color,"auto",4);
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door ;
	}
}



public class Ex01_construct {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2  = new Car("blue","sudong",4);
	}

}
