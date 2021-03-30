package others6;

public class A289 {
	class Solution {
		public void gameOfLife(int[][] board) {
			if (board.length == 0 || board[0].length == 0)
				return;
			int[][] xy = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
			int x, y;
			int row = board.length, col = board[0].length;
			int[][] ans = new int[row][col];
			int num;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					num = 0;
					for (int cur = 0; cur < 8; cur++) {
						x = i + xy[cur][0];
						y = j + xy[cur][1];
						if (x >= 0 && x < row && y >= 0 && y < col) {
							num += board[x][y];
						}
					}
					if (board[i][j] == 1) {
						if (num == 2 || num == 3) {
							ans[i][j] = 1;
						}
					} else {
						if (num == 3)
							ans[i][j] = 1;
					}
				}
			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					board[i][j] = ans[i][j];
				}
			}
		}
	}
}
