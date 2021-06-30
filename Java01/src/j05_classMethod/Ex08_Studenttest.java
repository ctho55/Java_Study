package j05_classMethod;

public class Ex08_Studenttest {

	public static void main(String[] args) {
		// Student Test
		// 인스턴스 생성 후 사용
		Ex08_Student st = new Ex08_Student();
		// 필드접근
		// st.stnum = 100 // 접근불가
		int sum = 0;
		st.setStnum(1111);
		st.setName("홍길동");
		st.setPhone("010-xxxx-xxxx");
		st.setScore(99);
		sum += st.getScore();
		System.out.println("학생1"+st);
		
		Ex08_Student st2 = new Ex08_Student();

		st2.setStnum(2222);
		st2.setName("고길동");
		st2.setPhone("010-xxxx-xxx2");
		st2.setScore(100);
		sum += st2.getScore();
		System.out.println("학생2"+st2);
		
		Ex08_Student st3 = new Ex08_Student();

		st3.setStnum(2222);
		st3.setName("박길동");
		st3.setPhone("010-xxxx-xxx3");
		st3.setScore(70);
		sum += st3.getScore();
		System.out.println("학생3"+st3);
		
		System.out.println("sum ="+sum);

	}// main

}// class
