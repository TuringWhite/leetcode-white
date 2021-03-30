package others8;

import java.util.HashSet;
import java.util.Set;

public class A220 {
	class Solution {
		public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
			if (k <= 0 || nums.length < 2) {
				return false;
			}
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < nums.length; i++) {
				if (set.size() < k + 1) {
					for (int a : set)
						if ((long) Math.abs((long) a - (long) nums[i]) <= t)
							return true;
					set.add(nums[i]);
				} else {
					set.remove(nums[i - k - 1]);
					for (int a : set)
						if ((long) Math.abs((long) a - (long) nums[i]) <= t)
							return true;
					set.add(nums[i]);
				}
			}
			return false;
		}
	}
}
