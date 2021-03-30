package others5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A697 {
	class Solution {
		public int findShortestSubArray(int[] nums) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int num : nums)
				if (map.containsKey(num))
					map.replace(num, map.get(num) + 1);
				else
					map.put(num, 1);
			int max = 0;
			for (int num : map.keySet())
				max = Math.max(max, map.get(num));
			List<Integer> keys = new ArrayList<Integer>();
			for (int key : map.keySet())
				if (map.get(key) == max)
					keys.add(key);
			int left = 0, right = nums.length - 1, min = nums.length;
			for (int num : keys) {
				left = 0;
				right = nums.length - 1;
				while (nums[left] != num)
					left++;
				while (nums[right] != num)
					right--;
				min = Math.min(min, right - left + 1);
			}
			return min;
		}
	}
}
