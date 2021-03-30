package others5;

public class A220 {
	class Solution {
		public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
			if (k == 0)
				return false;
			else {
				for (int i = 0; i < nums.length - 1; i++) {
					int count = 1;
					for (int j = i + 1; j < nums.length && count <= k; j++) {
						if (Long.valueOf(Math.abs(Long.valueOf(nums[j]) - Long.valueOf(nums[i]))) <= t)
							return true;
						count++;
					}
				}
			}
			return false;
		}
	}
}
