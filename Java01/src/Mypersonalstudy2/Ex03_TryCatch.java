package Mypersonalstudy2;

public class Ex03_TryCatch {

	public static void main(String[] args) {
		try {
			startInstall(); //프로그램 설치에 필요한 준비를 한다.
			copyFiles();	//파일들을 복사한다
		}catch(SpaceException e){
			System.out.println("에러 메시지 :"+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보후 다시 설치하시기 바랍니다.");
		}catch(MemoryException me){
			System.out.println("에러 메시지 :"+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요");
		}
		finally {
			deleteTempFiles();
		}
	}// main

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if (!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	}

	static void copyFiles() {
	}

	static void deleteTempFiles() {
	}

	static boolean enoughSpace() {
		return false;
	}

	static boolean enoughMemory() {
		return true;
	}
}// class

class SpaceException extends Exception {
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg){
		super(msg);
	}
}	