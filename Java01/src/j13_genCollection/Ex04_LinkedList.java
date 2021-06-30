package j13_genCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j11_test.Person;

//ppt 12 ~ 17
//** List 인터페이스 (ppt 18, 23)
//=> List의 특징 : 순서가 있으며 중복된 원소를 가질 수 있다.
//=> 구현 클래스 : ArrayList, LinkedList

//** LinkedList<E>  
//=> ArrayList 및 배열의 단점을 보완하여 고안됨.   
//=> 장점 
//	1) 저장공간을 늘리는 과정이 간단.
//	2) 자료 입력 & 삭제 과정이 단순.
//=> 단점 : 순차처리의 access time 이 느리다.
//=> 빈번하게 삽입과 삭제가 일어나는 경우에 사용 

//** ArrayList<E> 
//=> 순서를 유지하며 중복을 허용하는 자료구조  
//=> 배열(Array)의 향상된 버전 또는 가변 크기의 배열이라고 생각하면 된다. 
//=> 장점 : 자료구조가 간단하며 사용이 쉽고 순차처리의 access time이 가장 빠르다.
//=> 단점
//1) 크기 변경시 새로운 배열을 생성해서 복사해야 하므로 비효율적
//2) 비순차적인 자료의 추가,수정,삭제시에 복사 및 이동 때문에 비효율적
//=> 크기가 일정하고 비순차적인 자료 수정이 발생하지 않는 경우 유리. 

public class Ex04_LinkedList {

	public static void main(String[] args) {
		// 1.정의 
		List<String> list = new LinkedList<String>() ;
		// 2.add
		// => 중복자료 허용 확인
		list.add("Java");
		list.add("Html");
		list.add("CSS");
		list.add("Servlet");
		list.add("JSP");
		list.add("Java");
		// 3. 출력 
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 4. remove & set & add
		System.out.println("** remove & set & add **");
		list.remove(1) ;
		list.set(1, "Update") ;
		list.add(3, "MySql");
		list.add("Spring");

		for (String s:list) {
			System.out.println(s);
		}
		// 5. Person 적용
		List<Person> plist = new LinkedList<Person>() ;
		plist.add(new Person("090909-3234567","홍길동"));
		plist.add(new Person("970707-2234567","이미라"));
		plist.add(new Person("991210-1234567","김길동"));
		for (Person p:plist) {
			p.infoPrint();
		}
		System.out.println("** Person remove & set & add **");
		plist.remove(1);
		plist.set(0, new Person("880808-2234567","이수정"));
		plist.add(1, new Person("770707-1234567","이철수"));
		for (int i=0; i<plist.size(); i++) {
			plist.get(i).infoPrint();
		}
		
		// 6. 배열--> 리스트로 ->  Iterator 로 변환하기
		String[] country = {"Korea","USA","Japean"};
		List<String> cList = Arrays.asList(country);
		Iterator<String> iList = cList.iterator();
		while(iList.hasNext()) {
			System.out.println(iList.next());
		}
		
	} //main

} //class
