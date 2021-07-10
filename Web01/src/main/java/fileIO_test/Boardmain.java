package fileIO_test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Boardmain {

		static BoardDAO dao = new BoardDAO();
	
	public static void main(String[] args) throws IOException {

		List<BoardVO> list = dao.selectList();
		
		for(BoardVO vo : list) {
			System.out.println(vo);
		}
		
		ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("D:MTest\\MyTest\\boardObj.txt "));
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:MTest\\MyTest\\boardObj.txt "));
		
		try {
			for(BoardVO vo: list) {
				out.writeObject(vo);
			}
			System.out.println("== ReadObject Stream ==");
			
			while (true){
				BoardVO vo = (BoardVO)in.readObject();
				if(vo != null) System.out.println(vo);
				else break;
			}
			
			
		}catch (EOFException e) {
			System.out.println("readObject 종료  => "+e.toString());
			System.out.println("자료 출력 완료 ");
		}
		catch (Exception e) {
			System.out.println("main Exception =>"+e.toString());
		} finally {
			if (in!=null) in.close();
			if (out!=null) out.close();
		}
		
		System.out.println("** Member Test 종료 **");
		
		
		
	} // main
} // class
