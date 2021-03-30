package others8;

public class A240 {
	class Solution {
		public boolean searchMatrix(int[][] matrix, int target) {
			if (matrix.length == 0 || matrix[0].length == 0)
				return false;
			int row = 0, col = matrix[0].length - 1;
			for (; col >= 0 && row < matrix.length; --col) {
				if (matrix[row][col] == target)
					return true;
				if (matrix[row][col] < target)
					for (; row < matrix.length; ++row) {
						if (matrix[row][col] == target)
							return true;
						if (matrix[row][col] > target) {
							--row;
							break;
						}
					}
			}
			return false;
		}
	}
}
