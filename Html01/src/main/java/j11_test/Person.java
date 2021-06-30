package j11_test;

import java.util.Calendar;

public class Person {
	private String idnum; // 주민번호
	private int age; // 나이
	private String name; // 이름
	private char gender; // 성별

	
	

	
	public Person() {
	};
	public Person(String idnum,String name) {
		setIdnum(idnum);
		setName(name);
		getAge();
		getGender();
		
	};
	
	public String getIdnum() {
		StringBuffer idbuf = new StringBuffer();
		idbuf.append(idnum);
		idbuf.replace(idbuf.lastIndexOf("-"), idbuf.length(), "******");
		String idbuftost = idbuf.toString();
		
		
		
		return idbuftost;
	}

	
	public void setIdnum(String idnum) {
		StringBuffer idbuf = new StringBuffer();
		
		idbuf.append(idnum);
		String idbuftost = idbuf.toString();
		
		
		this.idnum = idbuftost;
		
	}

	public int getAge() {
		Calendar now = Calendar.getInstance();
		int yy;
		yy = now.get(Calendar.YEAR);
		int yearnum = Integer.parseInt(idnum.substring(0, 2));
		// 입력한 주민번호 앞 두자리 추출
		
		if (idnum.charAt(7) == '1' || idnum.charAt(7) == '2') {
			age =  yy-(1900+yearnum);
			
		} else if (idnum.charAt(7) == '3' || idnum.charAt(7) == '4') {
			age =  yy-(2000+yearnum);
		}
		
		return age;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		if (idnum.charAt(7) == '1' || idnum.charAt(7) == '3') {
			gender = '남';
		} else if (idnum.charAt(7) == '2' || idnum.charAt(7) == '4') {
			gender = '여';
		} else {
			System.out.println("주민번호를 잘못입력하셨습니다.");
		}
		return gender;
	}

	public void infoPrint (){
		System.out.println("이름 :" + name);
		System.out.println("주민번호 :" + getIdnum());
		System.out.println("나이 :" + age+"세");
		System.out.println("성별 :" + gender+"자");
	}
	
	
	@Override
	public String toString() {
		return "\n idnum=" + idnum + ", age=" + age + ", name=" + name + ", gender=" + gender + "\n";
	}

}
