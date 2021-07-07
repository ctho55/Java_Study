package file_IO;
import java.io.*;

// ** Byte Stream 적용 1
// => image 복사하기

public class Ex07_01BinaryCopy {
	public static void main(String[] args) throws IOException {
		
		File src = new File("D:\\MTest\\image\\aaa.gif"); // 원본 파일 경로명
		File dest = new File("yellow.gif"); // 현재 프로젝트로 복사 
		
		FileInputStream fi = new FileInputStream(src); // 파일 입력 바이트 스트림 생성
		FileOutputStream fo = new FileOutputStream(dest); // 파일 출력 바이트 스트림 생성

		int c;
		try {
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
		} finally {
			fi.close();
			fo.close();
		} // finally
	} //main
} // class