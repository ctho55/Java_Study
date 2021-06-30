package j11_test;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	private int java;
	private int html;
	private int sum;

	public Student() {
	}

	public Student(String idnum, String name, int java, int html) {
		super(idnum, name);
		this.java = java;
		this.html = html;

	}

	public int getjava() {
		return java;
	}

	public void setjava(int java) {
		this.java = java;
	}

	public int gethtml() {
		return html;
	}

	public void sethtml(int html) {
		this.html = html;
	}

	public void setsum(Student arr[]) {

		for (int i = 0; i < arr.length; i++) {
			arr[i].setSum(arr[i].gethtml() + arr[i].getjava());
		}

	}

	public int getSum() {

		return sum;
	}

	public void setSum(int sum) {

		this.sum = sum;
	}

	public void studentSort(Student arr[]) {

		// 석차 배열의 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].getSum() < arr[j + 1].getSum()) {
					Student tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		// 정렬된 석차의 학생이름 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getIdnum() + arr[i].getName() + "석차(총점)" + (i + 1) + "등" + arr[i].getSum() + "점");
		}
	}

	// 추가할 메서드 : studentSort02
	public void studentSort02(Student arr[]) {

		// Student 객체를 ArrayList 에 담고이를 매개변수로 전달받아
		List<Student> starr = new ArrayList<Student>();

		for (int i = 0; i < arr.length; i++) {
			starr.add(arr[i]);
		}

		// Student를 성적순으로 정렬하고
		Student[] a = new Student[starr.size()];

		for (int i = 0; i < starr.size(); i++) {
			a[i] = starr.get(i);
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j].getSum() < a[j + 1].getSum()) {
					Student tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}

		// 성적순으로 주민번호, 이름, 총점을 출력한다.
		
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i].getIdnum() +a[i].getName() + "석차(총점)" + (i + 1) + "등" + a[i].getSum() + "점");
		}

	}

	@Override
	public void infoPrint() {
		System.out.println("=====================");
		super.infoPrint();
		System.out.println("java점수 :" + java + "점");
		System.out.println("html점수 :" + html + "점");
		System.out.println("=====================");
	}

	@Override
	public String toString() {
		return super.toString() + "java=" + java + ", html=" + html + "\n";
	}
}
