package others10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A286 {
	private static final int EMPTY = Integer.MAX_VALUE;
	private static final int GATE = 0;
	private static final List<int[]> DIRECTIONS = Arrays.asList(new int[] { 1, 0 }, new int[] { -1, 0 },
			new int[] { 0, 1 }, new int[] { 0, -1 });

	public void wallsAndGates(int[][] rooms) {
		int m = rooms.length;
		if (m == 0)
			return;
		int n = rooms[0].length;
		Queue<int[]> q = new LinkedList<>();
		for (int row = 0; row < m; row++) {
			for (int col = 0; col < n; col++) {
				if (rooms[row][col] == GATE) {
					q.add(new int[] { row, col });
				}
			}
		}
		while (!q.isEmpty()) {
			int[] point = q.poll();
			int row = point[0];
			int col = point[1];
			for (int[] direction : DIRECTIONS) {
				int r = row + direction[0];
				int c = col + direction[1];
				if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != EMPTY) {
					continue;
				}
				rooms[r][c] = rooms[row][col] + 1;
				q.add(new int[] { r, c });
			}
		}
	}

}

class Solution3 {
	int wall = Integer.MAX_VALUE;

	public void wallsAndGates(int[][] rooms) {
		if (rooms.length == 0 || rooms[0].length == 0)
			return;
		int m = rooms.length, n = rooms[0].length;
		Queue<Integer[]> queue = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (rooms[i][j] == 0) {
					Integer[] temp = new Integer[2];
					temp[0] = i;
					temp[1] = j;
					queue.add(temp);
				}
			}
		}
		int[][] dir = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
		System.out.println(queue.size());
		while (!queue.isEmpty()) {
			Integer[] temp = queue.poll();
			int i = temp[0];
			int j = temp[1];
			for (int[] k : dir) {
				int r = i + k[0];
				int c = j + k[1];
				if (r < 0 || r >= m || c < 0 || c >= n || rooms[r][c] != wall) {
					continue;
				}
				rooms[r][c] = rooms[i][j] + 1;
				temp = new Integer[2];
				temp[0] = r;
				temp[1] = c;
				queue.add(temp);
			}
		}
	}
}