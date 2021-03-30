package a51_60;

public class A53 {

	class Solution {
		public int maxSubArray(int[] nums) {
			int[] dp = new int[nums.length];
			dp[0] = nums[0];
			int max = dp[0];
			for (int i = 1; i < nums.length; i++) {
				dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
				max = Math.max(dp[i], max);
			}
			return max;
		}
	}
}

class Solution3 {
	public int maxSubArray(int[] nums) {
		if (nums.length == 0)
			return 0;
		/*
		 * dp[i]定义：存储i索引之前的最大和 初始值：每个dp[i]最小都是当前nums[i]
		 */
		int[] dp = new int[nums.length];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = nums[i];
		}
		// res用于找到nums中连续子数组最大和
		int res = dp[0];

		for (int i = 1; i < nums.length; i++) {
			// 状态方程，看到没，状态方程就是for循环内部需要的操作
			dp[i] = Math.max(dp[i], dp[i - 1] + dp[i]);
			res = Math.max(res, dp[i]);
		}
		return res;
	}
}
