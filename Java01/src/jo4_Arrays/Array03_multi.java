package j04_array;

// 다차원 배열 : ppt J05_25page
// 1차원 배열이 2개 모이먄 2차원 배열
// 1차원 배열이 3개 모이면 3차원 배열 ... 2차원 이상은 거의 안쓰임

public class Array03_multi {

	public static void main(String[] args) {
		// 1. 명시적 선언
		int[][] mul;
		mul = new int[2][3];
		// 초기화 => {{10,20,30,40},{50,60,70}}
		mul[0][0] = 10;
		mul[0][1] = 20;
		mul[0][2] = 30;
		mul[1][0] = 50;
		mul[1][1] = 60;
		mul[1][2] = 70;
		// 활용
		mul[0][0] += mul[1][0] + mul[1][1];
		// 출력
		System.out.println("명시적 선언");
		for (int i = 0; i < mul.length; i++) {
			for (int j = 0; j < mul[i].length; j++) {
				System.out.printf("mul[%d, %d]=%d",i,j,mul[i][j]);
			} // for j
		} //for i
		System.out.println("");

		// 2. 묵시적 선언 
		// 100,200,300
		// 111,222,333
		// 150,250,350
		System.out.println("묵시적 선언");
		int[][] mul2 = {{100,200,300},{111,222,333},{150,250,350}};
		for(int i =0; i < mul2.length; i++) {
			for(int j = 0 ; j< mul2[i].length; j++) {
				System.out.printf("mul2[%d, %d]=%d \n",i,j,mul2[i][j]);
			}
		}
	}// main

}// class
