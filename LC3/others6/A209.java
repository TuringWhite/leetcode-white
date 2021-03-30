package others6;

public class A209 {
	class Solution {
		public int minSubArrayLen(int s, int[] nums) {
			int left = 0, right = -1, sum = 0;
			int count = nums.length + 1;
			while (right < nums.length - 1) {
				sum += nums[++right];
				while (sum >= s) {
					count = count < (right - left + 1) ? count : (right - left + 1);
					sum -= nums[left++];
				}
				if (sum == s)
					count = count < (right - left + 1) ? count : (right - left + 1);
			}
			return count == nums.length + 1 ? 0 : count;
		}
	}
}
