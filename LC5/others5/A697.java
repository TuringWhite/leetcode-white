package others5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A697 {
	class Solution {
		public int findShortestSubArray(int[] nums) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int num : nums) {
				if (map.containsKey(num)) {
					map.replace(num, map.get(num) + 1);
				} else {
					map.put(num, 1);
				}
			}
			int max = Collections.max(map.values());
			List<Integer> list = new ArrayList<Integer>();
			for (int key : map.keySet()) {
				if (map.get(key) == max)
					list.add(key);
			}
			int left = -1, right = -1;
			int ans = Integer.MAX_VALUE;
			for (int num : list) {
				left = -1;
				right = -1;
				for (int i = 0; i < nums.length; i++) {
					if (left == -1 && nums[i] == num) {
						left = i;
					}
					if (nums[i] == num)
						right = i;
				}
				ans = Math.min(ans, right - left + 1);
			}
			return ans;
		}
	}
}
