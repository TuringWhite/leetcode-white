package a51_60;

public class A59 {
//	class Solution {
//		public int[][] generateMatrix(int n) {
//			int num = 1;
//			int top = 0, left = 0, bottom = n - 1, right = n - 1;
//			int[][] result = new int[n][n];
//			n = n * n;
//			while (num <= n) {
//				for (int i = left; i <= right; i++) {
//					result[top][i] = num++;
//				}
//				for (int i = top + 1; i <= bottom; i++) {
//					result[i][right] = num++;
//				}
//				if (num <= n) {
//					for (int i = right - 1; i > left; i--) {
//						result[bottom][i] = num++;
//					}
//					for (int i = bottom; i > top; i--) {
//						result[i][left] = num++;
//					}
//				}
//				left++;
//				top++;
//				right--;
//				bottom--;
//			}
//			return result;
//		}
//	}

	class Solution {
		public int[][] generateMatrix(int n) {
			int[][] ans = new int[n][n];
			int result = n * n;
			int num = 1;
			int top = 0, bottom = n - 1;
			int left = 0, right = n - 1;
			while (num <= result) {
				for (int i = left; i < right; i++) {
					ans[top][i] = num++;
				}
				for (int i = top; i <= bottom; i++) {
					ans[i][right] = num++;
				}
				if (num > result)
					break;
				for (int i = right - 1; i > left; i--) {
					ans[bottom][i] = num++;
				}
				for (int i = bottom; i > top; i--) {
					ans[i][left] = num++;
				}
				left++;
				right--;
				top++;
				bottom--;
			}
			return ans;
		}
	}
}
