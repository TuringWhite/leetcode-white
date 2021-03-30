package others5;

public class A999 {
	class Solution {
		public int numRookCaptures(char[][] board) {
			int x = 0, y = 0;
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					if (board[i][j] == 'R') {
						x = i;
						y = j;
						break;
					}

				}
			}
			int count = 0;
			for (int i = 1; y - i >= 0; i++) {
				if (board[x][y - i] == 'B')
					break;
				else if (board[x][y - i] == 'p') {
					count++;
					break;
				}
			}
			for (int i = 1; y + i < board.length; i++) {
				if (board[x][y + i] == 'B')
					break;
				else if (board[x][y + i] == 'p') {
					count++;
					break;
				}
			}
			for (int i = 1; x - i >= 0; i++) {
				if (board[x - i][y] == 'B')
					break;
				else if (board[x - i][y] == 'p') {
					count++;
					break;
				}
			}
			for (int i = 1; x + i < board.length; i++) {
				if (board[x + i][y] == 'B')
					break;
				else if (board[x + i][y] == 'p') {
					count++;
					break;
				}
			}
			return count;
		}
	}
}
