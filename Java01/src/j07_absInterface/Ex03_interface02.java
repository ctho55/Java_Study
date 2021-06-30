package j07_absInterface;

// ** interface II.
// 1) 인터페이스와 인테페이스 관계
// => 인터페이스 간의 상속(extends) 가능.
// => 다중상속, 계층적 상속 모두 가능 

// 2) 클래스 와 인터페이스 관계
// => 다중 구현(implements) 가능
// => 클래스가 클래스를 상속(extends) 받으면서 동시에
//    인터페이스를 구현(implements, 다중구현도 포함) 하는것 가능 

interface Inter1 {
	float PI = 3.14159f;
	int getA();
}
interface Inter2 { int getB(); }
// ** 인터페이스간 다중상속 가능
interface Inter3 extends Inter1, Inter2 { float getC(); }
// ** 다중구현
class InterMul1 implements Inter1, Inter2, Inter3 {
	int a=100 ,b=123 ;
	@Override
	public int getA() { return a; }
	@Override
	public int getB() { return b; }
	@Override
	public float getC() { return (a+b)*PI; }
} //InterMul1

class Add { 
	int addNum(int a, int b) { return a+b; } 
} //Add
// ** extends & implements
//class InterMul2 extends Add implements Inter1, Inter2, Inter3 {
class InterMul2 extends Add implements Inter3 {
	int a=200 ,b=223 ;
	@Override
	public int getA() { return a; }
	@Override
	public int getB() { return b; }
	@Override
	public float getC() { return addNum(a,b)*PI; }
} //InterMul2

public class Ex03_interface02 {

	public static void main(String[] args) {
		InterMul1 in1 = new InterMul1();
		System.out.printf("in1 getA=%d, getB=%d, getC=%f \n",in1.getA(),in1.getB(),in1.getC());
		InterMul2 in2 = new InterMul2();
		System.out.printf("in2 getA=%d, getB=%d, getC=%f \n",in2.getA(),in2.getB(),in2.getC());
		
		// 다형성 적용
		Inter3 it3 = new InterMul2();
		System.out.printf("it3 getA=%d, getB=%d, getC=%f \n",it3.getA(),it3.getB(),it3.getC());
		
		// => instanceof 확인 후에 적용하기
		if (in1 instanceof Inter1) {
			Inter1 it1 = new InterMul1();
			  System.out.println("** it1.getA() =>"+it1.getA());
		}else System.out.println("** False ** ");
		
		// Inter1 과 무관한 Add 클래스를 비교
		// => 컴파일 오류 없고, 런타임시에 비교 결과(적합성 여부) 알려줌
		if (new Add() instanceof Inter1) {
			System.out.println("** Add 비교 True ** ");
			// Inter1 it1 = new Add(); // 컴파일 오류
		}else System.out.println("** Add 비교 False ** ");
		
	} //main

} //class
