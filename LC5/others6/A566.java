package others6;

public class A566 {
	class Solution {
		public int[][] matrixReshape(int[][] nums, int r, int c) {
			if (nums.length == 0 || nums[0].length == 0)
				return nums;
			if (r * c != nums.length * nums[0].length) {
				return nums;
			}
			int[][] ans = new int[r][c];
			int cur = 0;
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums[0].length; j++) {
					System.out.println(cur);
					ans[cur / c][cur % c] = nums[i][j];
					cur++;
				}
			}
			return ans;
		}
	}
}
