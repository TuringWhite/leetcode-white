package a71_80;

public class A74 {

	// 这个方法是把二位数组拉直成一维数组，然后二分
	class Solution {
		public boolean searchMatrix(int[][] matrix, int target) {
			if (matrix.length == 0 || matrix[0].length == 0)
				return false;
			int row = matrix.length, col = matrix[0].length;
			int total = row * col;
			int left = 0, right = total - 1;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				int i = mid / col, j = mid % col;
				if (matrix[i][j] == target)
					return true;
				if (matrix[i][j] > target) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			return false;
		}
	}

	// 剑指offer的方法，从右上角开始向左下角遍历
//	class Solution {
//		public boolean searchMatrix(int[][] matrix, int target) {
//			if (matrix.length == 0 || matrix[0].length == 0)
//				return false;
//			int row = matrix.length, col = matrix[0].length;
//			int i = 0, j = col - 1;
//			while (i != row - 1 && j != 0) {
//				if (matrix[i][j] == target)
//					return true;
//				if (matrix[i][j] < target) {
//					i++;
//				} else {
//					j--;
//				}
//			}
//			if (i == row - 1) {
//				while (j != 0) {
//					if (matrix[i][j] == target)
//						return true;
//					j--;
//				}
//			} else if (j == 0) {
//				while (i != row - 1) {
//					if (matrix[i][j] == target)
//						return true;
//					i++;
//				}
//			}
//			if (matrix[row - 1][0] == target) {
//				return true;
//			}
//			return false;
//		}
//	}
}
