package a31_40;

import java.util.HashSet;
import java.util.Set;

public class A36 {
	public static boolean isValidSudoku(char[][] board) {
		// 遍历每一列
		for (int x = 1; x <= 9; x++) {
			if (!isValidSudokuChild(board, x, x, 1, 9)) {
				return false;
			}
		}
		// 遍历每一行
		for (int y = 1; y <= 9; y++) {
			if (!isValidSudokuChild(board, 1, 9, y, y)) {
				return false;
			}
		}
		// 遍历每一个小的九宫
		for (int x = 1; x <= 9; x = x + 3) {
			for (int y = 1; y <= 9; y = y + 3) {
				if (!isValidSudokuChild(board, x, x + 2, y, y + 2)) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isValidSudokuChild(char[][] board, int x1, int x2, int y1, int y2) {
		Set<Character> set = new HashSet<>();
		for (int y = y1 - 1; y < y2; y++) {
			for (int x = x1 - 1; x < x2; x++) {
				if (board[y][x] != '.') {
					if (set.contains(board[y][x])) {
						return false;
					} else {
						set.add(board[y][x]);
					}
				}
			}
		}
		return true;
	}
}
