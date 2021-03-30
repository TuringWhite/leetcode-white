package others10;

public class A724 {
	class Solution {
		public int pivotIndex(int[] nums) {
			if (nums == null || nums.length == 0)
				return -1;
			int left = 0, right = 0;
			for (int num : nums)
				right += num;
			right -= nums[0];
			if (left == right)
				return 0;
			for (int i = 1; i < nums.length; i++) {
				right -= nums[i];
				left += nums[i - 1];
				if (right == left)
					return i;
			}
			return -1;
		}
	}
}
