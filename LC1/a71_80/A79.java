package a71_80;

public class A79 {
	class Solution {
		boolean[][] flags;
		char[][] board;
		String word;
		boolean res;
		int[][] directions = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

		public boolean exist(char[][] board, String word) {
			flags = new boolean[board.length][board[0].length];
			this.board = board;
			this.word = word;
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					dfs(i, j, 0);
					if (res == true)
						return true;
				}
			}
			return false;
		}

		public void dfs(int i, int j, int cur) {

			if (res == true)
				return;
			if (cur == word.length()) {
				res = true;
				return;
			}
			if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || flags[i][j] == true) {
				return;
			}
			if (word.charAt(cur) == board[i][j]) {
				flags[i][j] = true;
				for (int[] dir : directions) {
					dfs(i + dir[0], j + dir[1], cur + 1);
				}
				flags[i][j] = false;
			}

		}
	}
}
