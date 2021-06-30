package j13_genCollection;

import java.util.Enumeration;
import java.util.Properties;

//** Properties
//=> Properties는 HashMap의 구버전인 Hashtable을 상속받아 구현한 것으로, 
// Hashtable은 키와 값을 (Object, Object)의 형태로 저장하는데 비해 
// Properties는 (String, String)형태로 저장하는 보다 단순화된 컬렉션 클래스 이다. 
//=> 주로 애플리케이션의 환경설정과 관련된 속성을 저장하는데 사용되며 
// 데이터를 파일로부터 읽고 쓰는 편리한 기능을 제공한다. 
// 그래서 간단한 입출력은 Properties를 활용하면 몇 줄의 코드로 쉽게 해결할 수 있다.

public class Ex11_Properties {

	public static void main(String[] args) {
		// 정의 
		Properties pp = new Properties();	
		pp.setProperty("insert", "MemberInset.Java");
		pp.setProperty("update", "Memberupdate.Java");
		pp.setProperty("delete", "Memberdeletet.Java");
		pp.setProperty("list", "Memberlist.Java");
		pp.setProperty("detail", "Memberdetail.Java");
		System.out.println("pp => "+pp);
		
		
		//순서처리 
		Enumeration ep = pp.propertyNames();
		while (ep.hasMoreElements()) {
			String ekey = (String)ep.nextElement();
			System.out.printf("key= %s , value=%s \n",ekey,pp.getProperty(ekey));
		}
		
	}

}
