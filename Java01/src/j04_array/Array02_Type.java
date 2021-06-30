package j04_array;

import java.util.Arrays;

public class Array02_Type {

	public static void main(String[] args) {
		// 타입별로 배열을 정의 하고 출력해본다.(묵시적 정의)
		// =float , char ,String
		// 배열 출력 : Arrays.toSting(배열이름)

		// 1.float

		float[] arr_fl = { 0.1f, 0.2f, 0.3f };
		System.out.println("float: " + Arrays.toString(arr_fl));

//		for(int i =0 ; i< arr_fl.length; i++) {
//			System.out.println(arr_fl[i]);
//		}

		// Integer.parseInt("123") -> int 123
		// 모든 기본자료형에는 래퍼(Rapper)클래스 : Float, Char, Double

		// 2. char
		char[] arr_ch = { 'A', 'B', 'C', 'D', 'E' };
		for (char s : arr_ch) {
			System.out.printf("%c\t", s);
		}
		System.out.println("");
		// 3. String
		String[] arr_st = { "JAVA_PROGRAM" };
		for (int i = 0; i < arr_st.length; i++) {
			System.out.println(arr_st[i]);
		}

	}// main

}// class
