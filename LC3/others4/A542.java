package others4;

import java.util.LinkedList;
import java.util.Queue;

public class A542 {
	public int[][] updateMatrix(int[][] matrix) {

		if (matrix.length == 0 || matrix[0].length == 0)
			return new int[][] {};
		int[][] result = new int[matrix.length][matrix[0].length];
		Queue<Integer[]> queue = new LinkedList<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {
					result[i][j] = 0;
				} else {
					int depth = 0;
					queue.add(new Integer[] { i, j });
					queue.add(null);

					while (!queue.isEmpty()) {
						if (queue.peek() == null) {
							// 一定有零，不用考虑最后广搜完所有坐标的情况，好耶！
							depth++;
							queue.poll();
							queue.add(null);

						} else {
							Integer[] temp = queue.poll();
							int tempi = temp[0];
							int tempj = temp[1];
							if (matrix[tempi][tempj] == 0) {
								result[i][j] = depth;
								queue.clear();

							} else {
								// 如果往回走了，一定在这条路一定得不到最短路径，所以没做特殊处理
								if (tempi > 0)
									queue.add(new Integer[] { tempi - 1, tempj });
								if (tempj > 0)
									queue.add(new Integer[] { tempi, tempj - 1 });
								if (tempi < matrix.length - 1)
									queue.add(new Integer[] { tempi + 1, tempj });
								if (tempj < matrix[0].length - 1)
									queue.add(new Integer[] { tempi, tempj + 1 });
							}
						}
					}
				}
			}
		}
		return result;
	}
}
