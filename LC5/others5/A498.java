package others5;

public class A498 {
	class Solution {
		public int[] findDiagonalOrder(int[][] matrix) {
			if (matrix.length == 0 || matrix[0].length == 0)
				return new int[0];
			int row = matrix.length, col = matrix[0].length;
			int[] ans = new int[row * col];
			int cur = 0;
			int xA = 0, yA = 0;
			int xB = 0, yB = 0;
			boolean flag = false;
			while (cur < ans.length) {
				System.out.println(cur);
				if (flag) {
					flag = false;
					for (int i = 0; xA + i <= xB; i++) {
						ans[cur++] = matrix[xA + i][yA - i];
					}
				} else {
					flag = true;
					for (int i = 0; xB - i >= xA; i++) {
						ans[cur++] = matrix[xB - i][yB + i];
					}
				}
				if (yA < col - 1) {
					yA++;
				} else {
					xA++;
				}
				if (xB < row - 1) {
					xB++;
				} else {
					yB++;
				}
			}
			return ans;
		}
	}
}
