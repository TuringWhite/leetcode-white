package others5;

public class A665 {

	class Solution {
		public boolean checkPossibility(int[] nums) {
			int count = 0;
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] >= nums[i - 1]) {
					continue;
				}
				count++;
				if (count >= 2)
					return false;
				if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
					nums[i] = nums[i - 1];
				} else {
					nums[i - 1] = nums[i];
				}
			}
			return true;
		}
	}
}
