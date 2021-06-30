package j13_genCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//*** 해싱과 해시함수 => 정석 651p
//해싱 => 해시 함수를 이용해서 데이터를 해시 테이블에 저장하고
//      검색하는 기법

//*** Map ( Key, Value )
//=> HashMap (Key 값의 중복을 허용하지 않고, 순서 유지를 보장받지 못한다.) 
//=> TreeMap (Key 값의 중복을 허용하지 않고, 키값으로 오름차순 정렬이 된다.)
//=> LinkedHashMap (Key 값의 중복을 허용하지 않고, 입력순서 유지를 보장받는다.)

//*** HashMap : Key, Value 정보 지정
//=>Value 에 무관하게 key 값 중복 안됨.
//=>Value 는 중복 허용. 

public class Ex08_HashMap {

	public static void main(String[] args) {
		// 1.Basic Map Integer, String
		// 정의 
		Map<Integer,String> bm = new HashMap<Integer,String>();
		// put 
		//=> 동일key? , 동일 Value ?
		bm.put(1, "Java");
		bm.put(1, "JSP"); //Key만 동일 
		bm.put(2, "Servlet");
		bm.put(10, "JSP");
		bm.put(20, "MySQL");
		bm.put(30, "Oracle");
		bm.put(3, "Spring");
		bm.put(3, "Spring");// 모두동일
		bm.put(4, "Servlet"); // Value만 동일 
		
		System.out.println("Basic Map "+bm);
		
		// remove & get & 크기(size)
		//  => key 로 접근 ;
		
		bm.remove(2);
		System.out.println("get(3) Test=> " +bm.get(3));
		System.out.println("size() Test"+bm.size());
		
		// 각종 Map 비교
		Map<Integer,String> tm = new TreeMap<Integer,String>(bm);
		System.out.println("TreeMap  =>   " +tm);
		
		Map<Integer,String> hm = new LinkedHashMap<Integer,String>(bm);
		System.out.println("LinkedHashMap  =>   " +hm);
		
	}//main

}//class 
