package jdbc02_MY;

import java.util.List;

public class MYTableUser {

	private MYTableService service = new MYTableService();
	private MYTableVO vo = new MYTableVO();

	public void selectList() {
		List<MYTableVO> list = service.selectList();
		for (MYTableVO s : list) {
			System.out.println(s);
		}
	}

	public void insert() {

		vo.setMember_num("member_111_011");
		vo.setName("시넥스");
		vo.setAddr("강원");
		vo.setNickname("맛있는만듀");
		vo.setPhone("010-5452-6673");

		if (service.insert(vo) > 0) {
			System.out.println(vo.getName() + "님 회원가입 성공 **");
		} else
			System.out.println(vo.getName() + "님 회원가입 실패 **");
	}

	public void update(String phone, String nickname, String name) {
		vo.setPhone(phone);
		vo.setNickname(nickname);
		vo.setName(name);

		if (service.update(vo) > 0) {
			System.out.println(vo.getName() + "님 수정성공 성공 **");
		} else
			System.out.println(vo.getName() + "님 수정 실패 **");
	}

	public void delete(String name) {
		vo.setName(name);
		if (service.delete(vo) > 0) {
			System.out.println(vo.getName() + "님 회원탈퇴 성공 성공 **");
		} else
			System.out.println(vo.getName() + "님 회원탈퇴 실패 **");
	}

	public static void main(String[] args) {
		MYTableUser user = new MYTableUser();

		// user.selectList();
		user.insert();
		user.update("010-3546-1234", "맛있는만듀", "유이");
		System.out.println("insert & update 후");
		user.selectList();
		user.delete("시넥스");

	}

}
