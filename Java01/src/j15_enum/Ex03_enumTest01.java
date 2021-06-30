package j15_enum;

//** 열거형의 정의 (정석 691p)
//=> 열거형은 서로 연관된 상수들의 집합

//** 열거형의 특징
//=> 상수의 사용을 편리하게 지원.
//=> 의미가 있는 단어를 상수로 사용하기 편리함.
//=> 값과 타입을 동시에 확인하기때문에 안전한 코딩 가능

//** Enum 클래스 (java.lang.Enum)
//=> 모든 열거형의 조상
//=> 열거형을 지원하는 다양한 메서드제공
//   values(), valueOf(), name(), ordinal() 등
//   ordinal() 은 열거형 상수가 정의된 순서를 정수로 반환 (0부터 시작)
//   그러나 이값은 내부적 용도이므로 열거형 상수의 값으로 사용하지 않는것이 좋다.

enum Direction {
	EAST, WEST, SOUTH, NORTH
}

public class Ex03_enumTest01 {

	public static void main(String[] args) {
		// ** 열거형 사용 => 열거형이름.상수명
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		System.out.printf("d1=%s, d2=%s, d3=%s \n",d1,d2,d3);
		
		// ** 배열처리 가능
		Direction[] darr = Direction.values() ;
		for (Direction d:darr) {
			System.out.printf("%s = %d \n", d.name(), d.ordinal());
			// name() : 상수명 , ordinal() : index
		}
		
		// ** 열거형의 상수간의 비교
		// => '==' 비교 가능 (그러므로 equals() 보다 빠른 성능)
		// => < , > 등 위 외의 관계연산자는 사용불가능  
		// => compareTo 는 같으면 0 , 왼쪽이 크면 양수, 오른쪽이 크면 음수 
		//    ordinal() 값으로 비교
		System.out.println("\n** 열거형의 상수간의 비교 **");
		System.out.printf("d1==d2 => %b \n", d1==d2);
		System.out.printf("d1==d3 => %b \n", d1==d3);
		System.out.printf("d1.equals(d3) => %b \n", d1.equals(d3));
		System.out.printf("d1.compareTo(d3) => %d \n", d1.compareTo(d3));
		System.out.printf("d1.compareTo(d2) => %d \n", d1.compareTo(d2));
		System.out.printf("d2.compareTo(d1) => %d \n", d2.compareTo(d1));

	} //main
} //class
