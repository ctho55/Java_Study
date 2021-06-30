package Mypersonalstudy;

public class ArrayEx6_My {

	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		} // for
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}// main

}// class
