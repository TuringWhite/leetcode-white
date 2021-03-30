package a11_20;

import java.util.Arrays;

public class A16 {
	class Solution {
		public int threeSumClosest(int[] nums, int target) {
			Arrays.sort(nums);
			int result = Integer.MAX_VALUE / 2;
			int l, r;
			for (int i = 0; i < nums.length - 2; ++i) {
				if (i > 0 && nums[i] == nums[i - 1])
					continue;
				l = i + 1;
				r = nums.length - 1;
				while (l < r) {
					int temp = nums[i] + nums[l] + nums[r];
					result = Math.abs(result - target) < Math.abs(temp - target) ? result : temp;
					if (temp < target)
						l++;
					else
						r--;
				}
			}
			return result;
		}
	}
}
