package j06_classExtends;

import javax.management.remote.SubjectDelegationPermission;

class Animal {
	 String name ; // 동물의 이름
	 int legs ; // 다리갯수
	
	void breath(String a) { // 숨을쉬는 행동
		System.out.println(this.name+"은 숨을쉽니다.");
	}
}

 class mamal extends Animal {
	 String cry;//울음
	 String run;// 다리
	 
}

 class wild extends mamal {
	  String zoo;// 동물원
 }
 
class pet extends mamal {
	String ject;//주사
 }

 class reptile extends Animal {
	String swim;//수영
}


public class Ex02_Animal {

	public static void main(String[] args) {
		
		
		System.out.println("포유류"+);
		System.out.println("야생 동물원");
		System.out.println("애완 예방접종");
		
		System.out.println("파충류");
		
	}

}
