package j09_APItest;

//** String, StringBuffer, StringBuilder 차이 및 장단점
//=> https://ifuwanna.tistory.com/221

//* String
//=> 불변(immutable) 속성을 가짐. 
//그러므로 문자열의 연산(입력,수정,삭제등) 이 빈번한 경우 힙(Heap)메모리에 
//많은 가비지(Garbage)가 생성되므로 비효율적.
//=> equals 메서드를 오버라이딩 해서 문자열의 내용을 비교할수 있도록 했음.
//=> 동기화 키워드를 지원하여 멀티쓰레드 환경에서 안전 (thread-safe)

//* StringBuffer / StringBuilder 
//(정석 ch9, 477~ )
//=> 내부적으로 buffer를 가지고 있으므로 가변성(mutable) 을 가짐.
//인스턴스 생성시 크기 지정가능 (편집할 문자를 고려하여 충분히 잡는것이 좋음)
//=> .append() .delete() 등을 이용하여 동일 객체내에서 문자열 변경가능
//그러므로 문자열의 연산(입력,수정,삭제등)이 빈번한 경우 String 보다적합.

//=> StringBuffer vs StringBuilder 차이점은 동기화의 유무
//=> 동기화 유무 
//- StringBuffer : 동기화 키워드를 지원하여 멀티쓰레드 환경에서 안전 (thread-safe)
//- StringBuilder: 동기화를 지원하지 않으므로 멀티쓰레드 환경에서 적합하지 않지만
//                단일쓰레드에서의 성능은 StringBuffer 보다 뛰어남.

//=> equals 메서드 오버라이딩 하지 않았기 때문에 내용을 비교하지 않으므로 '==' 과 동일결과 .
//=> toString 은 오버라이딩 되어 있어서 담고있는 문자열을 String으로 반환 한다.  

//** StringBuffer클래스  특징
//=> 문자열처리 속도높고, 중간에 변경가능함

//** StringBuffer클래스  메서드  (정석 480 ~ 481 p) 
//=> String 클래스와 유사한 메서드를 많이 가지고 있으며,
//저장된 내용을 변경 할 수있는 insert, replace, delete 등을 추가로 제공한다. 

//=> append : 문자열로 이어줌
//=> deleteCharAt(10) : 지정된 위치의 문자 제거  
//=> delete(3,6) : (3<= , <6) 사이의 문자 제거
//=> insert(int pos, "abc") : pos 위치에 문자열 "abc" 삽입
//      단, pos 는 0 부터 시작.               
//=> replace(int s, int e, "END")
//s <= ~ < e 구간의 문자열을 "END" 로 변경함.
//=> capacity() : StringBuffer 인스턴스의 buffer 크기
//=> length() : buffer에 담긴 문자열의 길이

public class Ex03_StringBuffer01 {

 public static void main(String[] args) {
    // ** StringBuffer 기본 특징
    StringBuffer sb1 = new StringBuffer("abc");
    StringBuffer sb2 = new StringBuffer("abc");
    
    System.out.println("sb1==sb2 => "+(sb1==sb2));
    System.out.println("sb1.equals(sb2) => "+sb1.equals(sb2));
    
    //String s=sb1; // Type mismatch 
    String s1=sb1.toString();
    String s2=sb2.toString();
    System.out.println("s1==s2 => "+(s1==s2));  // f
    System.out.println("s1.equals(s2) => "+s1.equals(s2));  // t
    
    // ** StringBuffer 메서드
    System.out.println("** StringBuffer 메서드 Test **"); 
    s1="우리나라";
    s2="대한민국";
    String data = s1+s2; // 문자열 연결
    System.out.println("** data => "+data);
    sb1.append(s1);
    sb1.append(s2);
    sb1.append(sb2);
    System.out.println("** sb1 => "+sb1);  
    // toString 메서드가 오버라이드 되어있으므로 값이 출력됨
    System.out.println("** sb1.toString() => "+sb1.toString());
    
    StringBuffer sb3 = new StringBuffer("03");
    sb3.append(100);
    sb3.append(200).append(300).append(20.345);
    System.out.println("** sb3 => "+sb3);  
    
    System.out.println("** sb3 insert => "+sb3.insert(0, "abc"));
    // . 부터 끝까지를 END 로 변경
    System.out.println("** sb3 replace => "+sb3.replace(sb3.lastIndexOf("."),sb3.length(), "END")); 
    System.out.println("** sb3 deleteCharAt => "+sb3.deleteCharAt(5));
    System.out.println("** sb3 delete => "+sb3.delete(0,3));  // 0 부터 3이전까지 삭제
    System.out.println("** sb3 capacity => "+sb3.capacity()); // 용량
    
 } //main
} //class