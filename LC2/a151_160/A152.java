package a151_160;

public class A152 {
	class Solution {
		public int maxProduct(int[] nums) {
			int length = nums.length;
			int[] max = new int[length];
			int[] min = new int[length];
			for (int i = 0; i < length; i++) {
				max[i] = nums[i];
				min[i] = nums[i];
			}
			for (int i = 1; i < length; i++) {
				max[i] = Math.max(nums[i], Math.max(max[i - 1] * nums[i], min[i - 1] * nums[i]));
				min[i] = Math.min(nums[i], Math.min(max[i - 1] * nums[i], min[i - 1] * nums[i]));
			}
			int res = max[0];
			for (int i = 1; i < length; i++) {
				res = Math.max(res, max[i]);
			}
			return res;
		}
	}
}

class Solution2 {
	public int maxProduct(int[] nums) {
		int length = nums.length;
		int[] maxF = new int[length];
		int[] minF = new int[length];
		System.arraycopy(nums, 0, maxF, 0, length);
		System.arraycopy(nums, 0, minF, 0, length);
		for (int i = 1; i < length; ++i) {
			maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]));
			minF[i] = Math.min(minF[i - 1] * nums[i], Math.min(nums[i], maxF[i - 1] * nums[i]));
		}
		int ans = maxF[0];
		for (int i = 1; i < length; ++i) {
			ans = Math.max(ans, maxF[i]);
		}
		return ans;
	}
}
