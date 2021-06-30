package j05_classMethod;

// 접근범위 제한과 설정자 &접근자 
// => 데이터 무결성, 보안 
// 설정자(mutator) : setxxx() - > setter
// 접근자(accessor) : getxxx() - > getter
// 데이터 무결성과 보안을 위해 클래스 외부에서 변수에 직접 접근하지 못하도록하고
//위 메서드를 통해 접근하도록 함. 

// 접근제어자 
// private : 클래스내에서만 접근 가능 
// default : 기본값 같은 패키지
// public : 프로젝트 내에서 모두 접근 가능  (default + 상속)
// protected : 자손클래스 내에서 가능하다 

public class Ex08_Student {
	private int stnum;
	private String name;
	private String phone;
	private int score;
	
	//생성자 오버로드
	public Ex08_Student() {};
	
	// 생성자 메서드
	public Ex08_Student(int stnum, String name, String phone, int score) {
		this.stnum = stnum;
		this.name = name;
		this.phone = phone;
		this.score = score;
	}

	public void setStnum(int stnum) {
		this.stnum = stnum;
	}

	public int getStnum() {
		return stnum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Ex08_Student [stnum=" + stnum + ", name=" + name + ", phine=" + phone + ", score=" + score + "]";
	}

}