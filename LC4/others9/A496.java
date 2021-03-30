package others9;

import java.util.Arrays;

public class A496 {
	class Solution {
		public int[] nextGreaterElement(int[] nums1, int[] nums2) {
			int[] ans = new int[nums1.length];
			Arrays.fill(ans, -1);
			for (int i = 0; i < nums1.length; i++) {
				int temp = nums1[i];
				int cur;
				for (cur = 0; cur < nums2.length; cur++) {
					if (temp == nums2[cur])
						break;
				}
				for (int j = cur + 1; j < nums2.length; j++) {
					if (nums2[j] > temp) {
						ans[i] = nums2[j];
						break;
					}
				}
			}
			return ans;
		}
	}
}
