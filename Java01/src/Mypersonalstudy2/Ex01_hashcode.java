package Mypersonalstudy2;

import java.util.Objects;

class card{
	String kind;
	int number ;
	card() {
		this("SPADE",1);
	}
	card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	//equals()	를 오버라이딩하면 hashCode ()	도 오버라이딩 해야한다.
	
	public int hashCode() {
		return Objects.hash(kind,number);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof card)
			return false;
		
		card c = (card)obj;
		return this.kind.equals(c.kind) && this.number== c.number;
	}
	
	//object클래스의 tostring()을 오버라이딩
	public String toString() {
		return  "kind"+kind+", number:"+number;
	}
	
}



public class Ex01_hashcode {

	public static void main(String[] args) {
		card c1 = new card();
		card c2 = new card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
