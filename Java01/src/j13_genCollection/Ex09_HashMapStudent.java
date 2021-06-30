package j13_genCollection;

import java.util.HashMap;
import java.util.Map;

import j11_test.Student;

public class Ex09_HashMapStudent {

	public static void main(String[] args) {
		//1. map 정의
		Map<String,Student> sm = new HashMap <String,Student>();
		//2. 데이터 추가 
		sm.put("030213-3039444",new Student("960232-1124535", "철수", 80, 78));
		sm.put("001232-2124535",new Student("001232-2124535", "미아", 82, 76));
		sm.put("010232-3124535",new Student("010232-3124535", "철왕", 50, 64));
		sm.put("940232-4124535",new Student("940232-4124535", "영미", 88, 92));
		sm.put("020232-1124535",new Student("020232-1124535", "민수", 79, 96));
		//3. 출력
		System.out.println(sm);
		//4. 객체(Student)의 멤버의 접근
		sm.get("940232-4124535").setName("영철");
		System.out.println("수정 데이터 확인"+sm.get("940232-4124535"));
	}//main	

}//class
