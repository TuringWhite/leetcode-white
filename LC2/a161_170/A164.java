package a161_170;

import java.util.Arrays;

public class A164 {
	class Solution {
		public int maximumGap(int[] nums) {
			if (nums.length < 2)
				return 0;
			Arrays.sort(nums);
			int max = 0;
			for (int i = 0; i < nums.length - 1; i++) {
				max = max > nums[i + 1] - nums[i] ? max : nums[i + 1] - nums[i];
			}
			return max;
		}
	}
}
