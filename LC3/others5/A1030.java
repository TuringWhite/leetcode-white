package others5;

public class A1030 {
	class Solution {
		public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
			int[][] arr = new int[R][C];
			int max = 0;
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					arr[i][j] = Math.abs(i - r0) + Math.abs(j - c0);
					max = max > arr[i][j] ? max : arr[i][j];
				}
			}
			int[][] result = new int[R * C][2];
			int count = 0;
			for (int num = 0; num <= max; num++) {
				for (int i = 0; i < R; i++) {
					for (int j = 0; j < C; j++) {
						if (arr[i][j] == num) {
							result[count++] = new int[] { i, j };
						}
					}
				}
			}
			return result;
		}
	}
}
