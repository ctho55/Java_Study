package j05_classMethod;

public class Ex08_Member {

	// 자료의 형을 표현하는 클래스 유형
	// => 생성자 필드정의 setter, getter, 생성자, toString메서드

	//생성자 메서드 
	//클래스와 이름 동일하고 , return 값이 없음.
	//생성시에 단한번 호출가능 
	//한 클래스의 생성자는 여러개 가능 (생성자 오버로딩)
	//생성자를 작성하지 않으면 컴파일러가 자동으로 기본생성자를 만들어줌(Default constructor)
	// (단, 하나라도 생성자 메서드를 작성하면 default 생성자는 만들어지지않음)
	private String id;
	private String password;
	private String name;
	private char gender;
	private String idNo;
	private String eMail;

	// 생성자

	public Ex08_Member(String id, String password, String name, char gender, String idNo, String eMail) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.idNo = idNo;
		this.eMail = eMail;
	}

	// setter getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	
	// toString 
	@Override
	public String toString() {
		return "Ex08_Member [id=" + id + ", password=" + password + ", name=" + name + ", gender=" + gender + ", idNo="
				+ idNo + ", eMail=" + eMail + "]";
	}

}// Member
