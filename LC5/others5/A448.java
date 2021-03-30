package others5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A448 {
	class Solution {
		public List<Integer> findDisappearedNumbers(int[] nums) {
			Set<Integer> set = new HashSet<>();
			List<Integer> list = new ArrayList<Integer>();
			for (int num : nums)
				if (!set.contains(num))
					set.add(num);
			for (int i = 1; i <= nums.length; i++)
				if (!set.contains(i))
					list.add(i);
			return list;
		}
	}
}
