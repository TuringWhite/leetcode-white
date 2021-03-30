package others5;

import java.util.ArrayList;
import java.util.List;

public class A566 {
	class Solution {
		public int[][] matrixReshape(int[][] nums, int r, int c) {
			if (nums.length * nums[0].length != r * c)
				return nums;
			List<Integer> list = new ArrayList<Integer>();
			int row = nums.length, col = nums[0].length;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					list.add(nums[i][j]);
				}
			}
			int cur = 0;
			int[][] result = new int[r][c];
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					result[i][j] = list.get(cur++);
				}
			}
			return result;
		}
	}

}
