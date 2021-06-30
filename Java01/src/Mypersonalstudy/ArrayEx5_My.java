package Mypersonalstudy;

public class ArrayEx5_My {

	public static void main(String[] args) {
		int sum = 0; // 총점을저장하기 위한 변수
		float aver = 0f; // 평균을 저장하기 위한 변수

		int[] score = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} // for

		aver = sum / (float) score.length; // 계산결과를 float로 얻기위한 형변환

		System.out.println("총점 :" + sum);
		System.out.println("평균" + aver);
	}// main

}// class
