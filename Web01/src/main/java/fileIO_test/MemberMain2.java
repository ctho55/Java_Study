package fileIO_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// ** 과제
// => DB 에서  member Table 의 모든 Record, 모든 컬럼을 
//    메모장에서 볼 수 있는 텍스트 문서로 저장 한다.

// => 조건1) 화일경로는 프로젝트 위치에 member.txt 로 저장 하기
// => 조건2) 각 컬럼은 , 로 구분
// => 조건3) 레코드 별로 줄바꿈  

// ** 해결
// 1) DB 에서 memberList 가져오기
// 2) 스트림 생성 & write
// 3) 메모장 에서 확인

public class MemberMain2 {

	static MemberDAO dao = new MemberDAO();

	public static void main(String[] args) throws IOException {
		// 1) DB 에서 memberList 가져오기
		
		List<MemberVO> list = dao.selectList();
		
		
		// 2.2) 문자 스트림으로 처리 & write 
		// => 문자 스트림으로 처리 
		// 필터 문자 스트림 BufferedWriter , BufferedReader 으로 처리 
		// =>순서 write , read console 출력 확인 
		
		BufferedWriter out = new BufferedWriter(new FileWriter("memberbuf.txt"));
		BufferedReader in = new BufferedReader(new FileReader("memberbuf.txt"));
		
		try {
			
			//** write
			for (MemberVO vo: list ) {
				 out.write(vo.toString());
				 out.newLine();
			}// for 
			
			out.flush();
			
			//** read
			while (true) {
				String str =in.readLine();
				if ( str != null) {
					System.out.println("member : "+str);
				}else {
					break; 
				}
			}//while_read 
			
			
			
		} catch (Exception e) {

		}finally {
			if (in != null)  in.close();
			if (out != null)  out.close();
		}
		
		System.out.println("** Member Test2: BufferedWriter,BufferedReader 종료 **");
	} // main
} // class
