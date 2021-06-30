package jdbc01;

import java.util.List;

public class StudentUser {

	private StudentService service = new StudentService();
	private StudentVO vo = new StudentVO();

	// ** 결과출력 View
	// => 요청 -> Service -> DAO -> MYSQL
	public void selectList() {
		List<StudentVO> list = service.selectList();
		for (StudentVO s : list) {
			System.out.println(s);
		}
	} // selectList()

	public void selectOne(String name) {
		vo.setName(name);
		vo = service.selectOne(vo);
		if (vo != null) {
			System.out.println("======================");
			System.out.println("* 이름 => " + vo.getName());
			System.out.println("* 번호 => " + vo.getIdno());
			System.out.println("* 나이 => " + vo.getAge());
			System.out.println("* 성별 => " + vo.getGender());
			System.out.println("* Java : " + vo.getJava());
			System.out.println("* Html : " + vo.getHtml());
			System.out.println("* 총 점 : " + (vo.getJava() + vo.getHtml()));
		} else
			System.out.println("** 해당되는 자료는 없습니다 **");
	} // selectOne

	public void insert() {
		// 입력 Data 처리
		vo.setIdno("000202-4123456");
		vo.setName("가나다");
		vo.setGender("여");
		vo.setAge(20);
		vo.setJava(90);
		vo.setHtml(97);
		if (service.insert(vo) > 0)
			System.out.println(vo.getName() + "님 회원가입 성공 **");
		else
			System.out.println(vo.getName() + "님 회원가입 실패 **");
	}

	public void update(String name, int java, int html) {
		vo.setName(name);
		vo.setJava(java);
		vo.setHtml(html);
		if (service.update(vo) > 0)
			System.out.println(vo.getName() + "님 수정성공 성공 **");
		else
			System.out.println(vo.getName() + "님 수정 실패 **");
	}

	public void delete(String name) {
		vo.setName(name);
		if (service.delete(vo) > 0) {
			System.out.println(vo.getName() + "님 회원탈퇴 성공 성공 **");
		} else
			System.out.println(vo.getName() + "님 회원탈퇴 실패 **");

	}

	public void selectgenderlist(String gender) {
		vo.setGender(gender);
		List<String> list = service.selectgenderlist(vo);
		for (String s : list) {
			System.out.println(s);
		}

	}

	public void transactionTest() {
		service.transactionTest();
	}

	public static void main(String[] args) {
		StudentUser user = new StudentUser();
		// 1) selectList
		// user.selectList();
		// user.selectOne("홍길동");
		user.selectgenderlist("남");
		// user.insert();
		// user.update("가나다",66,33);
		// System.out.println("insert & update 후");
		// user.selectList();
		// user.delete("최길동");

		// Transaction Test
		// => DML 에 적용
		// => SQL 명령어 : commit , rollback

		// user.transactionTest();

		// program 종료전 DB Close
		DBConnection.dbClose(StudentDAO.rs, StudentDAO.pst, StudentDAO.st, StudentDAO.cn);

	} // main

} // class
