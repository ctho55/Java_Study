package j01_basic;

import java.util.Scanner;

//**  과제 : 자기소개 하기
//=> 클래스명 : BasicTest01.java
//=> 콘솔을 통해 이름과 경력 나이, 성별 ( F/M ) 를 입력 받아 출력하기
//=> 단가 5000 원으로 기준, 지금까지 먹은 내 밥값 계산하기 
//=> 아래 처럼 출력하기 
//
//** 이름 : 엄미현
//** 경력 : 강사
//** 나이 : 20
//** 성별 : 여 (F 입력이면/ M 입력이면 남 출력하기)
//** 밥값 : 20 * 365*3 * 5000 = ???? 원

public class BasicTest01 {

	public static void main(String[] args) {
		// 1. 필요한 변수 또는 상수 정의하기
		// => 단가 5000원은 상수로 정의할것
		String name, job, gender ;
		int age=0, totalPrice=0 ; 
		final int PRICE = 5000;
		
		// 2. 데이터 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("** 이름을 입력 하세요 ~~ =>");
		name = sc.nextLine();
		System.out.println("** 경력을 입력 하세요 ~~ =>");
		job = sc.nextLine();
		System.out.println("** 나이를 입력 하세요 ~~ =>");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("** 성별을 입력 하세요 ~~ =>");
		gender = sc.nextLine();

		// 3. 처리 & 출력
		// => 밥값 계산, 성별처리 (삼항식으로 할것)
		System.out.println("** 이름 : "+name);
		System.out.println("** 경력 : "+job);
		System.out.println("** 나이 : "+age);
		System.out.println("** 성별 : "+
				(gender.equals("M") ? "남" : "여"));
				// (gender=="M" ? "남" : "여")
		System.out.println("** 밥값 : "+(age*365*3*PRICE));
		
		sc.close();
	} //main
} //class
