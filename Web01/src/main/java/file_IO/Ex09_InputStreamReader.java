package file_IO;
import java.io.*;

class Ex09_InputStreamReader {
	public static void main(String[] args) {
		String line = "";

		try {
			// ** InputStreamReader : 바이트 스트림과 문자 스트림을 연결
			// => InputStreamReader 생성자의 인자로 InputStream (Byte스트림) 을 전달
			// => BufferedReader (문자 스트림) 생성자의 인자로 InputStreamReader 전달
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader    br  = new BufferedReader(isr);

			System.out.println("사용중인 OS의 인코딩 :" + isr.getEncoding());

			do {
				System.out.print("문장을 입력하세요. 마치시려면 q를 입력하세요.>");
				line = br.readLine();
				System.out.println("입력하신 문장 : "+line);
			} while(!line.equalsIgnoreCase("q"));

//			br.close();   // System.in과 같은 표준입출력은 닫지 않아도 된다.
			System.out.println("프로그램을 종료합니다.");
		} catch(IOException e) { e.printStackTrace();}
	} // main
}
