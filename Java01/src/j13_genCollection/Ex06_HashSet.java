package j13_genCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//** Set : ppt 27 p
//=> 원소의 중복을 허용하지 않고, 순서가 없음
//=> HashSet, TreeSet, LinkedHashSet
//** HashSet
//=> HashSet은 해쉬 테이블에 원소를 저장하기 때문에 성능면에서 가장 우수,
// 하지만 원소들의 순서가 일정하지 않은 단점이 있다.

public class Ex06_HashSet {

	public static void main(String[] args) {
		// 정의
		//=> 순서 없고 , 중복 불가 
		// => set 동질성 Test 
		// 제네릭을 적용하지 않거나, Object Type 인경우
		Object [] ob = {"가","나",new Integer(123),"다","123"};
		
		
		
		
		HashSet<String> set = new HashSet<>();
		// add
		set.add("짜장면");
		set.add("칼국수");
		set.add("언남수제비");
		set.add("짜장면");
		set.add("쌀밥정식");
		set.add("매운짬뽕");
		set.add("쌀국수");
		// set.add(12345); X Error

		// 출력
		// => 순서 없고, 중복 불가
		System.out.println("set => " + set);
		// 실습
		// = > 메뉴중에서 "쌀" 이 포함되어 있으면 삭제하고 출력하기 
		Iterator<String> mset = set.iterator();
		while(mset.hasNext()) {
			if(mset.next().contains("쌀")) {
				mset.remove();
			}
		}
		System.out.println("mset "+set);
		
		
		// 배열 -> set
		// => 중복자료 ?
		String[] sarr = { "가", "나", "123", "가", "다", "나","짜장면","쌀국수" };
		HashSet<String> aset = new HashSet<>();
		for (String s : sarr) {
			aset.add(s);
		}

		System.out.println("aset => " + aset);

		
		// 순차처리
		// 순차적으로 비교하면서 원하는 값 찾기, 삭제 
		// iaset 의 remove는 aset에 반영됨
		Iterator<String> iaset = aset.iterator();
		while(iaset.hasNext()) {
			if(iaset.next().equals("123")) iaset.remove();
		}
		System.out.println(" aset 2 =>"+aset);
		
		
		// 순차 출력 
		// 다시 처음부터 출력할 수 있도록 해준다
		iaset = aset.iterator();
		while (iaset.hasNext()) {
			System.out.println(iaset.next());
		}
		
		// 합집합 (대량연산)
		// => Set 과 aset의 합집합, 교집합
		Set<String> union = new HashSet<String>(set);
		union.addAll(aset); //합집합
		set.addAll(aset); // set = aset
		System.out.println("aset+set => "+set);
		
		set.removeAll(aset);
		System.out.println("차 => "+set);
		
		
		Set<String> intersection = new HashSet<String>(set);
		intersection.retainAll(aset); //교집합
		System.out.println("intersection => "+intersection);
		System.out.println("union => "+union);
		
		
	}//main	

}//class
