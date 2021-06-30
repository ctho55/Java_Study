package j13_genCollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Ex07_SetLotto {

	public static void main(String[] args) {
		// Set 의 특징을 이용하여 로또 번호 생성하기

		HashSet<Integer> lot = new HashSet<>();

		for (; lot.size() < 6;) {
			int n = (int) (Math.random() * 45 + 1);
			lot.add(n);
		}
		System.out.println("lot 출력" + lot);

		// ** 오름차순 출력
		// => Set -> 순차구조 (Iterator , List)
		// => Set -> List
		// LinkedList 의 생성자중에 set을 매개변수로 사용하면
		// 이 set 을 list 생성해주는 생성자가 있음.

		List<Integer> list = new LinkedList<>(lot);
		Collections.sort(list);
		// ** Collections
		// => Collection 들의 RapperClass
		// Collection 과 관련된 편리한 메서드를 제공
		// 단, interface Collection 과 구별
		// interface Collector 의 구현클래스 Collectors 와 구별
		// => Collections.sort(List<T> list)
		// 인자로 List 타입이 필요함

		System.out.println("sorted lot" + lot);
		System.out.println("sorted list" + list);

	}// main

}// class
