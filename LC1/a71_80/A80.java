package a71_80;

public class A80 {
	class Solution {
		public int removeDuplicates(int[] nums) {
			int count = 0;
			int remove = 0;
			if (nums.length <= 2)
				return nums.length;
			for (int i = 0, pre = nums[i]; i < nums.length - remove; i++) {
				if (pre == nums[i]) {
					if (count == 2) {
						remove++;
						for (int m = i; m < nums.length - remove; m++) {
							nums[m] = nums[m + 1];
						}
						i--;
					} else {
						count++;
					}
				} else {
					pre = nums[i];
					count = 1;
				}

			}
			return nums.length - remove;
		}
	}
}
