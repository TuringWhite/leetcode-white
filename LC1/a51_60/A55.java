package a51_60;

public class A55 {
	class Solution {
		public boolean canJump(int[] nums) {
			int cur = 0;
			int pre = -1;
			while (cur != pre) {
				pre = cur;
				System.out.println(pre);
				if (pre >= nums.length - 1 || nums[pre] + pre >= nums.length - 1)
					return true;

				for (int i = 1; i <= nums[pre]; i++) {
					if (nums[pre + i] + pre + i > nums[cur] + cur)
						cur = pre + i;
				}
			}
			return false;
		}
	}
}

class Solution {
	public boolean canJump(int[] nums) {
		int n = nums.length;
		int rightmost = 0;
		for (int i = 0; i < n; ++i) {
			if (i <= rightmost) {
				rightmost = Math.max(rightmost, i + nums[i]);
				if (rightmost >= n - 1) {
					return true;
				}
			}
		}
		return false;
	}
}
