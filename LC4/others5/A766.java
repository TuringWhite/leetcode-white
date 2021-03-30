package others5;

public class A766 {
	class Solution {
		public boolean isToeplitzMatrix(int[][] matrix) {

			int num;
			int row = matrix.length, col = matrix[0].length;
			if (row == 1 || col == 1)
				return true;
			for (int i = row - 1; i >= 0; i--) {
				num = matrix[i][0];
				for (int j = 0; i + j < row && j < col; j++) {
					if (num != matrix[i + j][j])
						return false;
				}
			}
			for (int j = 1; j < col; j++) {
				num = matrix[0][j];
				for (int i = 0; i < row && i + j < col; i++) {
					if (num != matrix[i][i + j])
						return false;
				}
			}
			return true;
		}
	}
}
