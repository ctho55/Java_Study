package Mypersonalstudy;

public class ArrayEx10_bubble {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < arr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로 변경
				} // if 자리바꾸는 조건
			}
			if (!changed)
				break;

			for (int k = 0; k < arr.length; k++) {
				System.out.printf("%d", arr[k]);
			}
			System.out.println();
		} // end for i
	}// main
}// class