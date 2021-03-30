package others7;

public class A695 {
	class Solution {
		int row, col;

		public int maxAreaOfIsland(int[][] grid) {
			if (grid.length == 0 || grid[0].length == 0)
				return 0;
			int ans = 0;

			row = grid.length;
			col = grid[0].length;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (grid[i][j] == 1) {
						int temp = dfs(grid, i, j);
						ans = Math.max(ans, temp);
					}
				}
			}
			return ans;
		}

		public int dfs(int[][] grid, int i, int j) {
			if (i < 0 || i >= row || j < 0 || j >= col)
				return 0;
			if (grid[i][j] == 0)
				return 0;
			else {
				grid[i][j] = 0;
				return 1 + dfs(grid, i - 1, j) + dfs(grid, i + 1, j) + dfs(grid, i, j - 1) + dfs(grid, i, j + 1);
			}
		}
	}
}
