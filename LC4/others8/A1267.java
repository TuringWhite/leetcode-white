package others8;

public class A1267 {
	class Solution {

		int[][] dir = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
		int row, col;

		public int countServers(int[][] grid) {
			int count = 0;
			row = grid.length;
			col = grid[0].length;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (grid[i][j] == 1) {
						int temp = dfs(grid, i, j);
						if (temp >= 2) {
							count += temp;
						}
					}
				}
			}
			return count;
		}

		public int dfs(int[][] grid, int i, int j) {
			if (grid[i][j] == 0) {
				return 0;
			} else {
				grid[i][j] = 0;
				int temp = 0;
				for (int z = 0; z < dir.length; z++) {
					int x = i + dir[z][0];
					int y = j + dir[z][1];
					while (!(x < 0 || x >= row || y < 0 || y >= col)) {
						temp += dfs(grid, x, y);
						x += dir[z][0];
						y += dir[z][1];
					}
				}
				return 1 + temp;
			}
		}
	}
}
