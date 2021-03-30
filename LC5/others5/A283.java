package others5;

public class A283 {
	class Solution {
		public void moveZeroes(int[] nums) {
			int left = 0, right = 0;
			while (right < nums.length) {
				while (left < nums.length && nums[left] != 0)
					left++;
				while (right < nums.length && nums[right] == 0)
					right++;
				if (left >= nums.length || right >= nums.length)
					break;
				if (left > right) {
					right++;
					continue;
				}
				nums[left] = nums[right];
				nums[right] = 0;

			}
		}
	}
}
