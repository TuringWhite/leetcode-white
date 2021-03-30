package a121_130;

import java.util.HashSet;
import java.util.Set;

public class A128 {
	class Solution {
		public int longestConsecutive(int[] nums) {
			Set<Integer> set = new HashSet<>();
			for (int num : nums)
				set.add(num);
			int max = 0;
			int count;
			for (int i = 0; i < nums.length; i++) {
				if (set.contains(nums[i])) {
					count = 1;
					int cur = nums[i] + 1;
					while (set.contains(cur)) {
						set.remove(cur);
						count++;
						cur++;
					}
					cur = nums[i] - 1;
					while (set.contains(cur)) {
						set.remove(cur);
						count++;
						cur--;
					}
					max = Math.max(max, count);
				}
			}
			return max;
		}
	}
}
