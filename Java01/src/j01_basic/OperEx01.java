package j01_basic;


//연산자(operator)는 특정한 연산을 나타내는 기호
//피연산자(operand)는 연산의 대상
//연산자의 우선순위 => ppt J03_02 , 23p

public class OperEx01 {

	public static void main(String[] args) {
		// ** 사칙연산
		int a=10, b=3; 
		System.out.println("** 사칙연산 **");
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		System.out.println("a % b = "+(a%b));
		// ** 대입연산
		// a=a+b -> a+=b
		System.out.println("** 대입연산 **");
		System.out.println("a+=b "+(a+=b)); // a=13
		System.out.println("a-=b "+(a-=b)); // a=10
		System.out.println("a*=b "+(a*=b)); // a=30
		System.out.println("a/=b "+(a/=b)); // a=10
		System.out.println("a%=b "+(a%=b)); // a=1 , b=3
		// ** 단항연산
		// => 1씩 증감 (전 or 후) 
		a=10; b=10;
		System.out.println("** 단항연산 **");
		System.out.println("++a => "+(++a)); // 11 증가후 실행
		System.out.println("b++ => "+(b++)); // 10 실행후 증가 11
		System.out.println("--a => "+(--a)); // 10 감소후 실행
		System.out.println("b-- => "+(b--)); // 11 실행후 감소 10
		// ** 관계연산
		// => 모든 관계연산의 결과는 참(true) or 거짓(false) 
		a=10; b=3;
		System.out.println("** 관계연산 **");
		System.out.println("a==b => "+(a==b));
		System.out.println("a!=b => "+(a!=b));
		System.out.println("a>b => "+(a>b));
		System.out.println("a>=b => "+(a>=b));
		System.out.println("a<b => "+(a<b));
		System.out.println("a<=b => "+(a<=b));
		
		// ** 삼항식
		// => a, b 중 큰수 출력하기
		int ir = (a>b) ? a : b ;
		boolean br = (a>b) ? true : false ;
		char cr = (a>b) ? 'T' : 'F' ;
		String sr  = (a>b) ? "T" : "F" ;
		sr  = (a>b) ? "참" : "거짓" ;
		System.out.println("** 삼항식 **");
		System.out.printf("ir=%d , br=%b , cr=%s ,sr=%s \n",ir,br,cr,sr);
		
		// ** 논리(집합) 연산
		// => &&, || !
		boolean t ;
		// 1. a, b 모두 짝수이면 true
		t = (a%2==0) && (b%2==0) ;
		System.out.println("** && => "+t);
		// 2. a, b 둘중 하나가 짝수이면 true
		t = (a%2==0) || (b%2==0) ;
		System.out.println("** || => "+t);
		// 3. 부정, Not 
		System.out.println("** Not => "+!t);
		
	} //main
} //class
