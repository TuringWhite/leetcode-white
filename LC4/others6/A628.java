package others6;

import java.util.Arrays;

public class A628 {
	class Solution {
		public int maximumProduct(int[] nums) {
			Arrays.sort(nums);
			int length = nums.length;
			int a = nums[length - 1] * nums[length - 2] * nums[length - 3];
			int b = nums[0] * nums[1] * nums[length - 1];
			return Math.max(a, b);
		}
	}
}
