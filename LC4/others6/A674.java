package others6;

public class A674 {
	class Solution {
		public int findLengthOfLCIS(int[] nums) {
			int left = 0, max = 0, length = nums.length;
			for (int i = 1; i < length; i++) {
				if (nums[i] <= nums[i - 1]) {
					max = Math.max(max, i - left);
					left = i;
				}
			}
			max = Math.max(max, length - left);
			return max;
		}
	}
}
