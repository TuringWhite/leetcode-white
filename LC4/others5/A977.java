package others5;

import java.util.Arrays;

public class A977 {
	class Solution {
		public int[] sortedSquares(int[] nums) {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = nums[i] * nums[i];
			}
			Arrays.sort(nums);
			return nums;
		}
	}
}
