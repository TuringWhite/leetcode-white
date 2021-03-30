package others10;

import java.util.Arrays;

public class A268 {
	class Solution {
		public int missingNumber(int[] nums) {
			Arrays.sort(nums);
			for (int i = 0; i < nums.length; i++) {
				if (i != nums[i])
					return i;
			}
			return nums.length;
		}
	}
}
