package j13_genCollection;

import j11_test.Person;

//** 과제
//=> 배열을 출력해주는 클래스 만들기
//=> 실행시에 원하는 타입을 결정 & 출력
//=> 배열 타입 Generic

// int[] , String[], Person[], Student[] ...

class GenArray<T> {
	private T[] arr;
	public void setArr(T[] arr) {
		this.arr=arr;
	}
	public T[] getArr() {return this.arr;}
	
	public void arrPrint() {
		for (T a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("");
	} //arrPrint()
	
	// ** 마지막 자료 출력하기 
	public T getLast() {
		return arr[arr.length-1] ;
	}
}//GenArray 

public class Ex02_GenArray {

	public static void main(String[] args) {
		// 1) String
		GenArray<String> ga1 = new GenArray<String>();
		String[] ss = {"가","나","다","라","마"} ;
		ga1.setArr(ss);
		ga1.arrPrint();
		System.out.println("ga1.getLast() => "+ga1.getLast());
		
		// 2) Integer
		GenArray<Integer> ga2 = new GenArray<Integer>();
		Integer[] ii = {1,2,3,4,5} ;
		ga2.setArr(ii);
		ga2.arrPrint();
		System.out.println("ga2.getLast() => "+ga2.getLast());
		
		// 3) Double
		GenArray<Double> ga3 = new GenArray<Double>();
		Double[] dd = {1.111,2.222,3.333,4.444,5.555} ;
		ga3.setArr(dd);
		ga3.arrPrint();
		System.out.println("ga3.getLast() => "+ga3.getLast());
		
		// 4) Character (char)
		GenArray<Character> ga4 = new GenArray<Character>();
		Character[] cc = {'A','B','C','D','E'} ;
		ga4.setArr(cc);
		ga4.arrPrint();
		System.out.println("ga4.getLast() => "+ga4.getLast());
		
		// 5) Person
		GenArray<Person> ga5 = new GenArray<Person>();
		Person [] pp = {
				new Person("890909-1234567","홍길동"),
				new Person("950505-2234567","홍길순"),
				new Person("001010-3234567","김길동"),
				new Person("030303-4234567","이길순")				
		} ;
		ga5.setArr(pp);
		ga5.arrPrint();
		System.out.println("ga5.getLast() => "+ga5.getLast());

	} //main
} //class
