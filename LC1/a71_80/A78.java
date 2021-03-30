package a71_80;

import java.util.ArrayList;
import java.util.List;

public class A78 {
	class Solution {
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		public List<List<Integer>> subsets(int[] nums) {
			List<Integer> temp = new ArrayList<>();
			help(nums, temp);
			return list;
		}

		public void help(int[] nums, List<Integer> temp) {
			temp.sort(null);
			if (list.contains(temp))
				return;
			list.add(temp);
			for (int i = 0; i < nums.length; i++) {
				if (!temp.contains(nums[i])) {
					List<Integer> next = new ArrayList<>();
					next.addAll(temp);
					next.add(nums[i]);
					help(nums, next);
				}
			}
		}
	}

}
