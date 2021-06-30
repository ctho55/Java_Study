package j13_genCollection;

import java.util.ArrayList;
import java.util.List;

import j11_test.Person;

//ArrayList (ppt 18, 19 ~)

//** ArrayList<E> 의 저장용량   
//1) 생성자 
//=> 초기값 지정 가능 :  new ArrayList<>(100) ;
//2) 메서드 이용
//=> public void ensureCapacity(int minCapacity) : ArrayList 에 정의
//=> 데이터가 증가하면 메서드 호출하지 않아도 저장용량은 자동증가 함
//=> 필요시엔 미리 설정가능

public class Ex03_ArrayList {
	
	public static void main(String[] args) {
		// 1. 정의
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 다형성 적용
		// => 단, List에 정의된 만큼만 접근 가능 : ensureCapacity(0) Test 불가
		//List<Integer> list = new ArrayList<Integer>();
		
		// 저장 용량
		// => 생성자의 매개변수로 지정 : new ArrayList<Integer>(10);
		// => 메서드로 지정
		list.ensureCapacity(10);
		// => 용량 다 채우면 자동증가 시켜줌 (매우 비 효율적)
		
		// 2. add
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		for (int i:list) {
			System.out.println(i);
		}
		// 3. 수정 & 삭제
		System.out.println("** 수정 & 삭제 **");
		list.set(0, 111);
		list.remove(3); // 400 삭제
		for (int i:list) {
			System.out.println(i);
		}
		// 4. get 
		int sum = list.get(0) + list.get(1) ;
		System.out.println("** sum => "+sum);
		
		// 5. Person Type 으로 ArrayList 를 정의하고 
		// => add 3건, 출력하기 일반 for 문 사용하기
		// 5.1 정의
		List<Person> plist = new ArrayList<Person>();
		// 5.2 3개 add
		plist.add(new Person("090909-3234567","홍길동"));
		plist.add(new Person("970707-2234567","이미라"));
		plist.add(new Person("991210-1234567","김길동"));
		
		// 5.3 출력
		// => 배열과 비교해서 차이점 정리
		for (int i=0; i<plist.size(); i++) {
			plist.get(i).infoPrint();
		}
	} //main
} //class
