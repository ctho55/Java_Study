package j09_APItest;

import java.util.Arrays;

// ** String 의 메서드 들

public class Ex02_String02 {

	public static void main(String[] args) {

		String name = "홍길동" ;
		String city = "~~~SeoulinKorea~~~";
		String country = "  ,I,Love,Korea,   ";
		// 문자열 추출
		// => charAt, length, indexOf, lastIndexOf, substring, trim

		System.out.printf("** charAt => %s , %s \n",city.charAt(0),name.charAt(0));
		// => index 가 범위를 벗어나면 OutOfBound....Exception 발생

		System.out.printf("** indexOf => %d , %d \n",city.indexOf("e"),name.indexOf("김"));
		System.out.printf("** lastIndexOf => %d , %d \n",city.lastIndexOf("e"),name.lastIndexOf("김"));
		// => 없는 문자를 매개변수로 사용하면 음수 결과 (-1) 

		System.out.printf("** substring => %s, %s \n",city.substring(3,6),city.substring(3));

		String url =  "D:\\Mtest\\WorkSpace\\Jav01\\src\\j09_APItest\\Ex02_String02.java" ;

		System.out.printf("파일명 추출하기 = %s \n",url.substring(url.indexOf("E"),url.lastIndexOf("2")+1));
		// => 파일명만 추출하기 





		// 3~5 까지 , 3 부터 끝까지
		// city 에서 substring, indexOf ..로 Korea 추출하기
		System.out.printf("** Korea 추출 => %s\n",
				city.substring(city.indexOf("K"),city.lastIndexOf("a")+1)); 
		// trim
		System.out.printf("** trim => %s\n",country.trim()); 
		System.out.printf("** country1 => %s\n",country); // 메서드 결과로 해당변수의 값이 변경되는것은 아님 
		// => 메서드 실행결과를 반영하고 싶으면
		country = country.trim();
		System.out.printf("** country2 => %s\n",country);

		// 2. 문자열 변경
		// => toLowerCase, toUpperCase, replace, split
		// => int to String, String to int 
		System.out.printf("** toLowerCase => %s , %s \n",country.toLowerCase(),country);
		System.out.printf("** toUpperCase => %s , %s \n",country.toUpperCase(),country);
		System.out.printf("** replace => %s , %s \n",country.replace("o","Apple"),country);
		System.out.printf("** replace => %s , %s \n",country.replace("Korea","한국"),country);

		//split : 문자열을 인자로 전달괸 기호를 기준으로 잘라 배열에 담아줌
		String[] test = country.split(",") ;
		System.out.println("** split => "+ Arrays.toString(test));

		// 3. 형변환
		// => String -> int : Integer.parseInt
		// => int -> String : 문자열 연산에 연결되면 자동 형변환 됨 +"" 
		// => 기본 자료형의 값을 문자열로 바꾸기 : valueOf()
		//    모든 기본자료형 적용 가능 
		//    static String valueOf(boolean b)
		//    boolean, char, float, int, long ..
		double d = 123.456;
		String sd = String.valueOf(d);

		// 4. 비교

		//비교대상 문자열의 각문자들을 첫번째 자리부터 하나씩 비교하다가
		//가장 먼저 만나는 상이한 문자들의 AscII 코드값 차이를 반환하고 끝낸다 (이후 문자열을 비교하지 않는다)
		String abc = "abc" ;
		System.out.println("** result1 => "+ abc.compareTo("abc"));
		System.out.println("** result2 => "+ abc.compareTo("ab"));
		System.out.println("** result3 => "+ abc.compareTo("a"));
		System.out.println("** result4 => "+ abc.compareTo("bc"));
		System.out.println("** result5 => "+ abc.compareTo("b"));
		System.out.println("** result6 => "+ abc.compareTo("abcabc"));
		System.out.println("** result7 => "+ abc.compareTo("abcabcd"));

	} //main
} //class
