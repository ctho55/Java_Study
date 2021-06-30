package j11_test;

import java.util.Scanner;

public class Persontest {

	public static void main(String[] args) {
		String id;
		Person p = new Person();
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해주세요");
		String input = sc.nextLine();
		p.setName(input);

		System.out.println("주민번호를 입력해주세요 001212-*******");
		id = sc.next();
		p.setIdnum(id);
		p.getAge();
		p.getGender();
		
		sc.close();
		
		p.infoPrint();
	
		

		
	}

}
