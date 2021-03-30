package a61_70;

public class A64 {
	// 超时了
	class Solution {
		int min = Integer.MAX_VALUE;
		int row, col;

		public int minPathSum(int[][] grid) {
			row = grid.length;
			col = grid[0].length;
			dfs(grid, grid[0][0], 0, 0);

			return min;
		}

		public void dfs(int[][] grid, int sum, int i, int j) {
			if (i == row - 1 && j == col - 1) {
				min = Math.min(min, sum);
				return;
			}
			if (i < row - 1) {
				dfs(grid, sum + grid[i + 1][j], i + 1, j);
			}
			if (j < col - 1) {
				dfs(grid, sum + grid[i][j + 1], i, j + 1);
			}
		}
	}
}
