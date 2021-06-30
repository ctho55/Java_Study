package j05_classMethod;

// static (클래스 종속 cv)
// 클래스 변수 (모든 인스턴스 공유) , 클래스 매서드
// no_static (인스턴스 종속 iv)
// 인스턴스변수(인스턴스별로)


// 멤버들 : 속성 , 메서드 에 적용이 가능하다 .

// ex) 4칙연산 계산기 만들기 

public class Ex06_static {
	int result;
	static int total;

	public static int addr(int i, int j ) { 
		int result ; 
		result = i+j;
		total += result ;
		return result;
	}

	public static int minus(int i, int j ) { 
		int result ; 
		result = i-j;
		total += result ;
		return result;
	}

	public static int multiple (int i, int j ) { 
		int result ; 
		result = i*j;
		total += result ;
		return result;
	}

	public static double division (int i, int j ) { 
		double result = (double)i/j ;
		total += result;
		return result ;
	}

	public static void main(String[] args) {
		System.out.println("addr ="+addr(3,5));
		System.out.println("minus ="+minus(10,3));
//		System.out.println("multiple ="+multiple(3,5));
	System.out.println("division ="+division(24,5));
		System.out.println(total);
	}

}
