package j14_Exception;

// ** try ~ catch ~ finally
// => finally 블럭은 무조건 시행 

public class Ex03_finally {

	public static void main(String[] args) {

		int[] price = {100, 200, 300} ;
		// for ( int i=0; i<price.length; i++) { -> 정상코드
		for ( int i=0; i<=price.length; i++) { // ArrayIndexOutOfBoundsException
			try {
				//if (i==1) continue;  
				// 이하는 안하고 i+1 진행 -> 그래도 finally는 함
				if (i==1) break;
				// 반복문 탈출 -> 그래도 finally는 함
				System.out.printf("** price[%d] = %d \n",i,price[i]);
			} catch (Exception e) {
				System.out.println("** Exception =>"+e.toString());
				// 오류 발생시 Program 종료
				//break; // 반복문 탈출 (그래도 finally는 하고 탈출)
				return;  // 무조건 메서드 종료 (그래도 finally는 하고 종료)
			} finally {
				System.out.println("~~ finally 는 무조건 시행 !!! ~~ ");
			} // finally
			System.out.println("~~ for_endLine , i => "+i);
		} // for
		System.out.println("~~ Program 정상 종료 GoodBye ~~ ");
	} //main

} //class
