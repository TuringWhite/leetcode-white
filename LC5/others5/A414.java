package others5;

public class A414 {
	class Solution {
		public int thirdMax(int[] nums) {
			int maxf = Integer.MIN_VALUE;
			int maxs = Integer.MIN_VALUE;
			int ans = Integer.MIN_VALUE;
			int flag = 0;
			boolean f = true;
			for (int num : nums) {
				if (num == Integer.MIN_VALUE && f) {
					flag++;
					f = false;
				}
				if (num > maxf) {
					ans = maxs;
					maxs = maxf;
					maxf = num;
					flag++;
				} else if (num < maxf && num > maxs) {
					ans = maxs;
					maxs = num;
					flag++;
				} else if (num < maxs && num > ans) {
					ans = num;
					flag++;
				}
			}
			return flag >= 3 ? ans : maxf;
		}
	}
}

//题解有个哥们的
class Solution {
	public int thirdMax(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 2) {
			return nums[0] > nums[1] ? nums[0] : nums[1];
		}

		long firstMax = Long.MIN_VALUE;
		long secondMax = Long.MIN_VALUE;
		long thirdMax = Long.MIN_VALUE;
		for (int n : nums) {
			if (n > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = n;
			} else if (firstMax == n) {
				continue;
			} else if (n > secondMax) {
				thirdMax = secondMax;
				secondMax = n;
			} else if (n == secondMax) {
				continue;
			} else if (n > thirdMax) {
				thirdMax = n;
			}
		}
		return thirdMax == Long.MIN_VALUE ? (int) firstMax : (int) thirdMax;
	}
}
