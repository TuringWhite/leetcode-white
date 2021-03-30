package others8;

import java.util.ArrayList;
import java.util.List;

public class A1222 {
	class Solution {
		public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
			List<List<Integer>> list = new ArrayList<>();
			int[][] dir = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };// 二维方向数组
			int row = 8, col = 8;// 棋盘的行数列数
			int x, y;// 遍历的时候，xy坐标

			for (int i = 0; i < 8; i++) {
				x = king[0] + dir[i][0];
				y = king[1] + dir[i][1];
				while (x >= 0 && x < row && y >= 0 && y < col) {
					boolean flag = false;// 标记当前坐标是否有皇后
					for (int[] queen : queens) {// 挨个遍历queens数组。
						if (x == queen[0] && y == queen[1]) {
							// 如果找到了皇后，加入到list里面，标记为true
							List<Integer> temp = new ArrayList<>();
							temp.add(x);
							temp.add(y);
							list.add(temp);
							flag = true;
							break;
						}
					}
					// 找到了就直接break，后面的左边就算有皇后也会被之前找到的挡住，“无效”
					if (flag)
						break;
					x += dir[i][0];
					y += dir[i][1];
				}
			}
			return list;
		}
	}
}
