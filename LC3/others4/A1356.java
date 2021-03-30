package others4;

import java.util.Arrays;

public class A1356 {
	public int[] sortByBits(int[] arr) {
		Arrays.sort(arr);
		int[] helper = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			helper[i] = Integer.bitCount(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(helper[i]);
		}
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (helper[j] > helper[j + 1]) {
					swap(arr, j, j + 1);
					swap(helper, j, j + 1);
				}
			}
		return arr;
	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
