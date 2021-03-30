package others6;

public class A661 {
	class Solution {
		// 矩阵不一定是M*M，行数和列数不一定相等，回头在写一份新的吧。我这个是方阵qwq
		public int[][] imageSmoother(int[][] M) {
			int length = M.length;

			int[][] copy = new int[length][length];
			if (length == 1)
				return M;
			copy[0][0] = (M[0][0] + M[0][1] + M[1][0] + M[1][1]) / 4;
			copy[0][length - 1] = (M[0][length - 1] + M[0][length - 2] + M[1][length - 1] + M[1][length - 2]) / 4;
			copy[length - 1][0] = (M[length - 1][0] + M[length - 2][0] + M[length - 1][1] + M[length - 2][1]) / 4;
			copy[length - 1][length - 1] = (M[length - 1][length - 1] + M[length - 1][length - 2]
					+ M[length - 2][length - 1] + M[length - 2][length - 2]) / 4;
			if (length == 2)
				return copy;
			for (int i = 1; i < length - 1; i++) {
				copy[0][i] = (M[0][i] + M[0][i + 1] + M[0][i - 1] + M[1][i] + M[1][i - 1] + M[1][i + 1]) / 6;
				copy[length - 1][i] = (M[length - 1][i] + M[length - 1][i + 1] + M[length - 1][i - 1] + M[length - 2][i]
						+ M[length - 2][i - 1] + M[length - 2][i + 1]) / 6;
				copy[i][0] = (M[i][0] + M[i - 1][0] + M[i + 1][0] + M[i][1] + M[i + 1][1] + M[i - 1][1]) / 6;
				copy[i][length - 1] = (M[i][length - 1] + M[i - 1][length - 1] + M[i + 1][length - 1] + M[i][length - 2]
						+ M[i + 1][length - 2] + M[i - 1][length - 2]) / 6;
			}
			for (int i = 1; i < length - 1; i++)
				for (int j = 1; j < length - 1; j++)
					copy[i][j] = (M[i][j] + M[i - 1][j] + M[i + 1][j] + M[i][j - 1] + M[i - 1][j - 1] + M[i + 1][j - 1]
							+ M[i][j + 1] + M[i - 1][j + 1] + M[i + 1][j + 1]) / 9;

			return copy;
		}
	}
}
