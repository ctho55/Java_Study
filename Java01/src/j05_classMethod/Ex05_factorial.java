package j05_classMethod;

// 재귀적 호출 (Recursive Call)
// 메서드가 메서드내부에서 자신을 호출 
// 5! = 5*4*3*2*1 이라면 n! = n*(n-1)*(n-2)...
// n! = n*(n-1)*(n-2)... & f(n)= n*f(n-1)

//public class Ex05_factorial {
//	public  int factorial(int n) {
//
//		if (n == 1) return 1 ; 
//			return n * factorial(n - 1);// 메서드 자신 호출
//	}
//
//	public static void main(String[] args) {
//		Ex05_factorial a = new Ex05_factorial();
//		System.out.println("factorial 10 ! = "+a.factorial(10));
//		System.out.println("factorial 10 ! = "+a.factorial(5));
//		
		//static 사용하기 
		
		public class Ex05_factorial {
			public static int factorial(int n) {

				if (n == 1) return 1 ; 
					return n * factorial(n - 1);// 메서드 자신 호출
			}

			public static void main(String[] args) {
				System.out.println("factorial 10 ! = "+factorial(10));
				System.out.println("factorial 10 ! = "+factorial(5));
		
	}// main 	

}// class
