package others7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A506 {
	class Solution {
		public String[] findRelativeRanks(int[] nums) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < nums.length; i++) {
				map.put(nums[i], i);
			}
			Arrays.sort(nums);
			int level = 1;
			String[] ans = new String[nums.length];
			for (int i = nums.length - 1; i >= 0; i--) {
				if (level >= 4) {
					ans[map.get(nums[i])] = level + "";
				} else if (level == 1) {
					ans[map.get(nums[i])] = "Gold Medal";
				} else if (level == 2) {
					ans[map.get(nums[i])] = "Silver Medal";
				} else if (level == 3) {
					ans[map.get(nums[i])] = "Bronze Medal";
				}
				level++;
			}
			return ans;
		}
	}
}
