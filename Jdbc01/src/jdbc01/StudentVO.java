package jdbc01;

// ** VO (Value Object) , DTO (Data Transfer Object)
//=> 자료의 구조로서의 클래스
//=> 대부분 Table 별로 만들며, 
//=> Table 과 동일한 필드명을 사용한다. 

// => 맴버 필드(컬럼) , setter/getter, toString

public class StudentVO {
	private String idno;
	private String name;
	private String gender;
	private int age;
	private int java;
	private int html;
	
	public StudentVO() { }
	
	//** 모든 필드를 초기화 하는 생성자 만들기
	public StudentVO(String idno, String name, String gender, int age, int java, int html) {
		super();
		this.idno = idno;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.java = java;
		this.html = html;
	}
	
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	
	@Override
	public String toString() {
		return "StudentVO [idno=" + idno + ", name=" + name + ", gender=" + gender + ", age=" + age + ", java=" + java
				+ ", html=" + html + "]";
	}
} // class
