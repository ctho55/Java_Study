package j03_forwhile;

//** 반복문 의 3요소 : 반복자의 초기값, 조건식(true or false), 증감식
//=> while, do while : 초기값(before while), 조건식(true or false => while 조건문), 증감식(in while)       
//=> for : for(초기값; 조건식; 증감식)   

//** 반복자(iterator) : 
//=> 반복문에서 횟수를 count 하는 변수

//** 변수 적용 범위 => 전역변수, 지역변수
public class ForEx01 {

	public static void main(String[] args) {
		// Test 1) 기본형 : 1~100 까지의 합을 출력
		int result = 0;
		int i = 1;
		// result = 1+2+3....+100 ;

		for (i = 1; i<=100 ; i++ ) {
			result += i ;
		}//for문 
		System.out.println("Result : "+ result);
		System.out.println(" for 종료후 i="+i );
		
		//Test 2) while 문으로
		// => 초기값이 조건에 안맞으면 1회도 안함.
		result = 0 ;
		i = 101;
		while(i<=100) {
			result += i ;
			i++;
		}
		System.out.println("Result : "+ result);
		System.out.println(" while 종료후 i="+i );
		
		
		//Test 3 do ~ while
		//=> 초기값이 조건에 안맞아도 1회는 시행됨.
		result = 0 ;
		i = 101;
		do {
			result += i ;
			i++;
		}while(i<=100);
		System.out.println("Result : "+ result);
		System.out.println(" do while 종료후 i="+i );
	}// main
}// class
