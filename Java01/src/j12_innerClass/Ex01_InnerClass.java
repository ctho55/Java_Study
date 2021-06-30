package j12_innerClass;

// 클래스의 멤버
// => 변수, 메서드(생성자, ....)
//=> 클래스도 가능 (Inner Class : 내부클래스)

class OuterClass {
	
	private String name ;
	private int num ;
	
	OuterClass (String name){
		this.name = name;
		num=0;
		System.out.println("=== OuterClass 생성자 ===");
	}
	
	public void whoAreYou () {
		num++;
		System.out.printf("whoAreYou => name:%s , num:%d \n",name,num);
	}
	
	// InnerClass : 내부클래스
	// => 독립적 클래스로서 멤버를 가질 수 있음 
	// => 변수, 메서드(생성자,....)
	// Outer 클래스의 모든 멤버(Private 포함)에 접근 가능 
	// 
	class InnerClass {
		InnerClass(String nm){
			System.out.println("=== InnerClass 생성자 ===");
			name = nm;
			whoAreYou ();
		}//생성자
	}//InnerClass
	
}// OuterClass


public class Ex01_InnerClass {
	
	public static void main(String[] args) {
		// OuterClass 생성 및 사용
		OuterClass out1 = new OuterClass(" OUT1");
		OuterClass out2 = new OuterClass(" OUT2");
		out1.whoAreYou();
		out2.whoAreYou();
		
		// InnerClass 생성 및 사용
		// OutClass 의 인스턴스를 통해 생성됨
		//OuterClass.InnerClass test  =new OuterClass.InnerClass("Test"); // xxx 않됨
		//그러나 아래의 방법은 가능하다
		//OuterClass.InnerClass test  =new OuterClass("OUT_Test").new InnerClass("Inner_Test");
		OuterClass.InnerClass in11 = out1.new InnerClass("Inner11");
		OuterClass.InnerClass in12 = out1.new InnerClass("Inner12");
		OuterClass.InnerClass in13 = out1.new InnerClass("Inner13");
		out1.whoAreYou();
		// => Outer 의 멤버를 공유함 (out2 와 비교)
		
		OuterClass.InnerClass in21 = out2.new InnerClass("Inner21");
		OuterClass.InnerClass in22 = out2.new InnerClass("Inner22");
		out2.whoAreYou();
		System.out.println("=== After out 1 ===");
		out1.whoAreYou();
	}
}
