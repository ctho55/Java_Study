package jdbc02_MY;

public class MYTableVO {

	private String member_num;
	private String name;
	private String addr;
	private String nickname;
	private String phone;

	public MYTableVO() {
	}

	public MYTableVO(String member_num, String name, String addr, String nickname, String phone) {
		super();
		this.member_num = member_num;
		this.name = name;
		this.addr = addr;
		this.nickname = nickname;
		this.phone = phone;
	}

	public String getMember_num() {
		return member_num;
	}

	public void setMember_num(String member_num) {
		this.member_num = member_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "MYTableVO [member_num=" + member_num + ", name=" + name + ", addr=" + addr + ", nickname=" + nickname
				+ ", phone=" + phone + "]";
	}

}// class
