package others5;

public class A661 {
	class Solution {
		public int[][] imageSmoother(int[][] M) {
			int[][] forwards = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 0 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
					{ 1, 1 } };
			int row = M.length, col = M[0].length;
			int[][] ans = new int[row][col];
			int count;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					count = 0;
					for (int z = 0; z < 9; z++) {
						int x = i + forwards[z][0];
						int y = j + forwards[z][1];
						if (x >= 0 && x < row && y >= 0 && y < col) {
							count++;
							ans[i][j] += M[x][y];
						}
					}
					ans[i][j] /= count;
				}
			}
			return ans;
		}
	}
}
