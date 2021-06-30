package j06_classExtends;

//** 상속 : extends
//=> 기능을 확장해서 업그레이드 버젼 만듦.

//** 조상 : super class
//=> super.  : 조상의 인스턴스를 의미 (조상의 맴버에 접근 가능)
//=> super()
// 조상의 생성자를 의미 (조상의 생성자에 접근 가능).
// this() 처럼 생성자 메서드 내에서 첫줄에 위치해야함.

//** 후손 : sub class ( super class 를 포함 )

class Car {
public int speed ;
public int mileage ;
public String color;

public Car() {System.out.println("** Car Default 생성자 실행 **"); } 

public Car(int speed, int mileage, String color) {
   super();
   this.speed = speed;
   this.mileage = mileage;
   this.color = color;
   System.out.println("** Car 생성자2 실행 **");
}
public void speedUp() {
   speed+=100;
} //speedUp()

@Override
public String toString() {
   return "Car [speed=" + speed + ", mileage=" + mileage + ", color=" + color + "]";
}
} // Car


class SportsCar extends Car {

int turbo ;

public SportsCar() {
   //super(1000,12345,"Green");
   System.out.println("** SportsCar Default 생성자 실행 **"); 
}

public SportsCar(int speed, int mileage, String color, int turbo) {
   super(speed,mileage,color);
   this.turbo=turbo;
}

public void turboSpeeduUp() {
	// super(); // 일반 메서드에서 조상 생성자 호출 불가능 
	turbo += super.speed; // 조상의 멤버에는 접근가능
	super.speedUp();// 조상 메서드는 가능
	
}

@Override
public String toString() {
   return "SportsCar [turbo=" + turbo + ", speed=" + speed + ", mileage=" + mileage + ", color=" + color + "]";
} 
} // SportsCar


public class Ex01_Car {

public static void main(String[] args) {
   
   Car car = new Car(100,300,"Red") ;
   System.out.println("Car =>"+car);
   
   System.out.println("*** SportsCar Test ***");
   SportsCar scar = new SportsCar();
   // 자동적으로 조상의 생성자 (Default 생성자) 호출 
   // 순서 : 조상 먼저 생성 
   scar.color="Blue" ;
   scar.mileage=12345;
   scar.speed=1000;
   scar.turbo=3000;
   System.out.println("SportCar =>"+scar);

   System.out.println("*** SportsCar Test2 ***");
   
   SportsCar scar2 = new SportsCar(200,56789,"Pink",5000);
   System.out.println("scar2 "+ scar2);
   
} //main

} //class