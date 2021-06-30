package Mypersonalstudy2;

public class Ex02_equals {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2))
			System.out.println("v1과v2는 같습니다.");
		else
			System.out.println("v1과v2는 다릅니다.");
	}//main

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		Value v =(Value)obj; // obj를 value로 형변환
		//참조변수의 형변환 전에는 반드시 instanceof로 확인해야함.
		
		
		return this.value == v.value;
	}
}