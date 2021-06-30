package j09_APItest;

//** StringBuilder
//=> StringBuffer 와 동일하나 동기화 키워드를 지원하지 않으므로 
// "thread-safe" 하지않으나 단일쓰레드에서의 성능은 StringBuffer 보다 뛰어남.

public class Ex4_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sl = new StringBuilder("가나다") ;
		sl.append(123).append("ABCD").append(false);
	
		System.out.println("sl=  "+sl);	
		System.out.println("sl.toString()=  "+sl.toString());	//toString이 오버라이드 되어있다.
		
		sl.insert(1, true);
		sl.insert(sl.length(),"END"); //length()는 길이 뒤에 붙게된다
		System.out.println("sl.length= "+sl);
		
		
	}//main	

}//class
