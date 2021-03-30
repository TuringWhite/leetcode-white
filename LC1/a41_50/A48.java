package a41_50;

public class A48 {
	class Solution {
		public void rotate(int[][] matrix) {
			for (int i = 0; i < matrix.length / 2 + matrix.length % 2; i++) {
				for (int j = 0; j < matrix.length / 2; j++) {
					swap(matrix, i, j);
				}
			}
		}

		public void swap(int[][] matrix, int i, int j) {
			int length = matrix.length - 1;
			int temp = matrix[i][j];
			matrix[i][j] = matrix[length - j][i];
			matrix[length - j][i] = matrix[length - i][length - j];
			matrix[length - i][length - j] = matrix[j][length - i];
			matrix[j][length - i] = temp;

		}
	}

//	public static void main(String[] args) {
//		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		rotate(matrix);
//		printArr(matrix);
//		int[][] matrix2 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//		rotate(matrix2);
//		printArr(matrix2);
//	}
//
	public static void rotate(int[][] matrix) {
		int length = matrix.length;
		for (int i = 0; i < length / 2 + length % 2; i++) {
			for (int j = 0; j < length / 2; j++) {
				swap(matrix, i, j);
			}
		}
	}

	public static void swap(int[][] matrix, int i, int j) {
		int length = matrix.length;
		int temp = matrix[j][length - i - 1];
		int temp2;
		matrix[j][matrix.length - i - 1] = matrix[i][j];
		temp2 = matrix[length - i - 1][length - j - 1];
		matrix[length - i - 1][length - j - 1] = temp;
		temp = matrix[length - j - 1][i];
		matrix[length - j - 1][i] = temp2;
		matrix[i][j] = temp;
	}
//
//	public static void printArr(int[][] matrix) {
//		int length = matrix.length;
//		for (int i = 0; i < length; i++) {
//			for (int j = 0; j < length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//	}

}
