package others6;

import java.util.ArrayList;
import java.util.List;

public class A228 {
	class Solution {
		public List<String> summaryRanges(int[] nums) {
			List<String> list = new ArrayList<String>();
			if (nums.length == 0)
				return list;
			else if (nums.length == 1) {
				list.add(nums[0] + "");
				return list;
			}
			int left = 0, right = 0, pre;
			while (right < nums.length - 1) {
				pre = nums[right++];
				if (pre != nums[right] - 1) {
					if (left == right - 1)
						list.add(nums[left] + "");
					else {
						list.add(nums[left] + "->" + pre);
					}
					left = right;
				}
			}
			if (left == right)
				list.add(nums[right] + "");
			else {
				list.add(nums[left] + "->" + nums[right]);
			}

			return list;
		}
	}
}
