package others5;

public class A598 {
	class Solution {
		public int maxCount(int m, int n, int[][] ops) {
			int x = m;
			int y = n;
			for (int[] arr : ops) {
				if (arr[0] < x)
					x = arr[0];
				if (arr[1] < y)
					y = arr[1];
			}
			return x * y;
		}
	}
}

class Solution1 {
	public int countBattleships(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				// 判断是否是战舰头，要防止越界
				if (board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')) {
					count++;
				}
			}
		}
		return count;
	}
}
