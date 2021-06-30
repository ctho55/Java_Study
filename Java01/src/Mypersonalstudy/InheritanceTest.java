package Mypersonalstudy;

class Point{
	int x;
	int y;
}

//class Circle extends Point{
//	int r;
//}

class Circle {
	Point p = new Point();
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x =1 ;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x ="+c.p.x);
		System.out.println("c.p.y ="+c.p.y);
		System.out.println("c.r ="+c.r);
			
	}

}
