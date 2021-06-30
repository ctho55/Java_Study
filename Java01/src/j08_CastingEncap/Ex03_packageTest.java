package j08_CastingEncap;

import j06_classExtends.Ex03_01Father;

// ** package & import Test
// => 접근범위 
//    default : package 내에서만 가능
//    protected : default + 상속
//    public : 프로젝트 전체

public class Ex03_packageTest {

	public static void main(String[] args) {
		// 동일 패키지에 있으므로 import 없이 사용가능
		Animal am = new Animal() ;
		am.breath();  // default 메서드 호출가능
		
		// 다른 패키지에 있는 Bear 사용
		// => 독립적인 소스코드(.java) 가 아니면 import 안됨.
		//Bear bear = new Bear() ;
		
		// import 하지 않은 경우
		// j06_classExtends.Ex03_01Father father = new j06_classExtends.Ex03_01Father() ;
		Ex03_01Father father = new Ex03_01Father() ;
		// 생성자 메서드가 default, protected 이면 생성할 수 없음
		father.info();  // public 인 경우에만 호출가능
		
	} //main

} //class
