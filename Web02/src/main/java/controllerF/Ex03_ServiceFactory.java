package controllerF;

import java.util.HashMap;
import java.util.Map;

// ** ServiceFactory
// => FrontController 가 요청한 서비스 컨트롤러 클래스를 제공

// => 요청명(mappingName)에 해당되는 서비스를 바로 사용가능하도록 전달

// ** Map 적용
// => HashMap 객체 정의 : 전역변수(멤버)
// => 자료put : 생성자에 정의 

//** 싱글톤 패턴 : 인스턴스를 단 1개만 허용
//=> 일반적인 경우 : 복수의 인스턴스 가능 
// Student s1 = new Student();
// Student s2 = new Student();
//** 방법
//=> 생성자를 private 으로 내부에서만 사용가능하도록하고
//=> 내부에서 getInstance() 메서드로 생성 제공해줌 
//=> 외부에서는 getInstance() 메서드를 통해서만 사용

public class Ex03_ServiceFactory {
	// ** Map 적용
	private Map<String, Ex04_Controller> mappings;
	// => 싱글톤 적용을 위해 생성자를 private 으로 적용
	private Ex03_ServiceFactory() {
		mappings = new HashMap<String, Ex04_Controller>();
		mappings.put("/blist.do", new Ex05_BList());
		mappings.put("/bdetail.do", new Ex06_BDetail());
		mappings.put("/binsert.do", new Ex07_BInsert());
		mappings.put("/login.do", new Ex08_Login());
		
	}// 생성자
	
	// ** 싱글톤 적용 
	private static Ex03_ServiceFactory instance = new Ex03_ServiceFactory();
	
	public static Ex03_ServiceFactory getInstance() {return instance ;}
	

	
	// ** ver01
	public Ex04_Controller getController(String mappingName) {
//
//		Ex04_Controller controller = null;
//		if ("/blist.do".equals(mappingName)) {
//			controller = new Ex05_BList();
//		} else if ("/bdetail.do".equals(mappingName)) {
//			controller = new Ex06_BDetail();
//		} else if ("/binsert.do".equals(mappingName)) {
//			controller = new Ex07_BInsert();
//		}
//		return controller;

	//** ver02 map 적용
	return mappings.get(mappingName);
	} // getController
} // class
