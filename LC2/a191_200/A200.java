package a191_200;

import java.util.LinkedList;
import java.util.Queue;

public class A200 {
	public int numIslands(char[][] grid) {
		if (grid.length == 0 || grid[0].length == 0)
			return 0;
		int count = 0;
		Queue<Integer[]> queue = new LinkedList<Integer[]>();
		int ci;
		int cj;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					count++;
					System.out.println(count);
					grid[i][j] = '0';
					queue.add(new Integer[] { i, j });
					while (!queue.isEmpty()) {
						Integer[] temp = queue.poll();
						ci = temp[0];
						cj = temp[1];
						if (ci > 0 && grid[ci - 1][cj] == '1') {
							grid[ci - 1][cj] = '0';
							queue.add(new Integer[] { ci - 1, cj });
						}
						if (ci < grid.length - 1 && grid[ci + 1][cj] == '1') {
							grid[ci + 1][cj] = '0';
							queue.add(new Integer[] { ci + 1, cj });
						}
						if (cj > 0 && grid[ci][cj - 1] == '1') {
							grid[ci][cj - 1] = '0';
							queue.add(new Integer[] { ci, cj - 1 });
						}
						if (cj < grid[0].length - 1 && grid[ci][cj + 1] == '1') {
							grid[ci][cj + 1] = '0';
							queue.add(new Integer[] { ci, cj + 1 });
						}
					}
				}
			}
		}
		return count;
	}
}
