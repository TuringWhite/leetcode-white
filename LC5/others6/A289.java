package others6;

public class A289 {
	class Solution {
		public void gameOfLife(int[][] board) {
			int[][] dir = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
			int[][] ans = new int[board.length][board[0].length];
			int sum;
			int x, y;
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					sum = 0;
					for (int[] arr : dir) {
						x = i + arr[0];
						y = j + arr[1];
						if (x >= 0 && x < board.length && y >= 0 && y < board[0].length) {
							if (board[x][y] == 1)
								sum++;
						}
					}
					if (board[i][j] == 0 && sum == 3) {
						ans[i][j] = 1;
					} else if (board[i][j] == 1 && (sum == 2 || sum == 3)) {
						ans[i][j] = 1;
					}
				}
			}
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					board[i][j] = ans[i][j];
				}
			}
		}
	}
}
