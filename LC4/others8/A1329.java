package others8;

import java.util.ArrayList;
import java.util.List;

public class A1329 {
	class Solution {
		public int[][] diagonalSort(int[][] mat) {
			if (mat.length == 1 || mat[0].length == 1)
				return mat;
			int row = mat.length;
			int col = mat[0].length;
			List<Integer> list = new ArrayList<Integer>();
			for (int i = row - 1; i >= 0; i--) {
				for (int j = 0; j + i < row && j < col; j++) {
					list.add(mat[i + j][j]);
				}
				list.sort(null);
				for (int j = 0; j + i < row && j < col; j++) {
					mat[i + j][j] = list.remove(0);
				}
			}
			for (int i = 1; i < col; i++) {
				for (int j = 0; j < row && j + i < col; j++) {
					list.add(mat[j][i + j]);
				}
				list.sort(null);
				for (int j = 0; j < row && j + i < col; j++) {
					mat[j][i + j] = list.remove(0);
				}
			}
			return mat;
		}
	}
}
