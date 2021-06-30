package j15_enum;

// ** 일반 상수와 안전성 비교
// => 메서드 에 적용

enum Animal { DOG, CAT, BEAR }

enum Person { MAN, WOMAN, CHILD }

public class Ex05_enumTets02 {
	// ** 일반 상수 정의
	static final int DOG=0;
	static final int CAT=1;
	static final int BEAR=2;
	
	static final int MAN=0;
	static final int WOMAN=1;
	static final int CHILD=2;
	

	public static void main(String[] args) {
		// 1) 일반 변수를 사용한 메서드, 일반변수 사용 
		whoAreYou(DOG) ;
		whoAreYou(MAN) ;
		// => 비교할수 있는 타입이 없기 때문에 성격이 다른 값이 적용될수도 있다.
		
		// 2) enum 사용
		// =>컴파일시에 타입 검증 가능 (컴파일 오류 발생)
		// 2.1) 직접 사용 
		whoAreYouE(Person.CHILD);
		
		// 2.2) 인스턴스 정의
		Person myFriend1 = Person.MAN;
		whoAreYouE(myFriend1);
		
		Animal myFriend2 = Animal.BEAR;
		//whoAreYouE(myFriend2);  // 컴파일 오류
		
		// 인스턴스 확인
		if (myFriend2 instanceof Animal) 
			System.out.println(" Animal 은 whoAreYouE() 메서드 입장 불가 입니다 ~~");
		
	} //main
	
	static void whoAreYou(int p) {
		switch(p) {
		case 0: System.out.println("~~ 남성 입니다 ~~"); break;
		case 1: System.out.println("~~ 여성 입니다 ~~"); break;
		case 2: System.out.println("~~ 어린이 입니다 ~~"); break;
		}
	} //whoAreYou
	
	static void whoAreYouE(Person p) {
		switch(p) {
		case MAN: System.out.println("~~ 남성 입니다 ~~"); break;
		case WOMAN: System.out.println("~~ 여성 입니다 ~~"); break;
		case CHILD: System.out.println("~~ 어린이 입니다 ~~"); break;
		}
	} //whoAreYou
	
	
	
} //class
