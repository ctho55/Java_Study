package j14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// ** 실습
// => 두개의 정수를 입력 받아 4칙연산 결과 출력하기
// => 입력 정수는 1 ~ 99 까지 허용
//    1) 범위를 벗어난 값를 입력하면 정상 값 입력 할때까지 반복
//    2) 반복분 이용해서 종료하고 싶을때까지 Test 하기.

// ** Scanner 사용시 주의 사항
// => nextInt() , nextLine() 사용시 주의
//    nextInt()는 개행문자 (\n) 가 뒤에 붙고, 숫자만 받아 처리한다. 
//    그래서 nextInt() 만 계속되면 문제가 없는데, 
//    뒤이어서 nextLine() 이 오면 앞 nextInt() 의 
//    남겨진 \n 을 한줄로 인식 받아 버린다.

public class Ex02_Calclator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean jcode=true;
		while (jcode) {

			try {
				System.out.println("* 첫번째 정수 입력 하세요 => ");
				
				int i=  Integer.parseInt(sc.nextLine()); // NumberFormatException 가능
				//int i = sc.nextInt();  // InputMismatchException 가능
				if (i<1 || i>99) {
					System.out.println("~~ 숫자가 범위를 벗어납니다 1~99 사이의 정수를 입력하세요 ~~");
					continue;
				}
				
				System.out.println("* 두번째 정수 입력 하세요 => ");
				int j=  Integer.parseInt(sc.nextLine());
				if (j<1 || j>99) {
					System.out.println("~~ 숫자가 범위를 벗어납니다 1~99 사이의 정수를 입력하세요 ~~");
					continue;
				}
				
				System.out.println("** Add => "+(i+j));  
				System.out.println("** Min => "+(i-j));
				System.out.println("** Mul => "+i*j);  
				System.out.println("** Div => "+i/j);
				
			} catch (InputMismatchException e) {
				// Scanner를 쓸 때 변수 타입과 다른 타입을 입력했을 때 나는 예외
				System.out.println("** InputMismatchException => "+e.toString());
				System.out.println("~~ 정확하게 정수를 입력 하세요 ~~");
			} catch (NumberFormatException e) {
				// Integer.parseInt(s) 에서 s가 숫자값 이 아닌 경우  
				System.out.println("** NumberFormatException => "+e.toString());
				System.out.println("~~ 정확하게 정수를 입력 하세요 ~~");
			} catch (ArithmeticException e) {	
				System.out.println("** ArithmeticException => "+e.toString());
				System.out.println("~~ 0 으로는 나눌 수 없습니다 ~~");
			} catch (Exception e) {
				System.out.println("** Exception toString => "+e.toString());
			}	
			System.out.println("* 종료 하려면 'N' 을 입력 하세요 => ");
			if (sc.nextLine().equals("N"))
				jcode=false;
		} // while 
		
		sc.close();	
		System.out.println("** Program Stop **");

	} //main

} //class
/*
 * 이 때 nextInt()를 사용했기 때문에 '\n'를 읽지 않아서
버퍼에는 처음에 입력한 잘못된 input만 들어있을 것이다.
문제는 프로그램이 '\n'을 만나지 않으면 첫 번째 input만을 받아들인다는 사실이다.
그래서 입력 버퍼에는 계속 그 첫번째로 입력한 잘못된 input이 들어갈 것이고,
또다시 exception이 throw되어 catch block이 실행되는 무한 루프에 빠져버리는 것이다.
*/