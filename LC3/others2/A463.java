package others2;

public class A463 {
	public int islandPerimeter(int[][] grid) {
		if (grid.length == 0) {
			return 0;
		}
		int result = 0;
		int[][] helper = new int[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					helper[i][j] = 1;
					result += 4;
					int count = 0;
					if (i > 0 && helper[i - 1][j] == 1)
						count++;
					if (i < grid.length - 1 && helper[i + 1][j] == 1)
						count++;
					if (j > 0 && helper[i][j - 1] == 1)
						count++;
					if (j < grid[0].length - 1 && helper[i][j + 1] == 1)
						count++;
					result -= 2 * count;
				}
			}
		}
		return result;
	}
}
