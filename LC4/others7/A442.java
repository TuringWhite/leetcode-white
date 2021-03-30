package others7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A442 {
	class Solution {
		public List<Integer> findDuplicates(int[] nums) {
			Set<Integer> set = new HashSet<>();
			List<Integer> ans = new ArrayList<Integer>();
			for (int num : nums) {
				if (set.contains(num)) {
					ans.add(num);
				} else {
					set.add(num);
				}
			}
			return ans;
		}
	}
}
