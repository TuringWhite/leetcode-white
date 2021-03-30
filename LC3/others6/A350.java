package others6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A350 {

	// 双指针

	class Solution {
		public int[] intersect(int[] nums1, int[] nums2) {
			Arrays.sort(nums1);
			Arrays.sort(nums2);
			int cur1 = 0, cur2 = 0;
			List<Integer> list = new ArrayList<Integer>();
			while (cur1 < nums1.length && cur2 < nums2.length) {
				if (nums1[cur1] == nums2[cur2]) {
					list.add(nums1[cur1]);
					cur1++;
					cur2++;
				} else if (nums1[cur1] < nums2[cur2]) {
					cur1++;
				} else {
					cur2++;
				}
			}
			int[] result = new int[list.size()];
			for (int i = 0; i < result.length; i++) {
				result[i] = list.get(i);
			}
			return result;
		}
	}
}
