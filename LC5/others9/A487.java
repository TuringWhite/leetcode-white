package others9;

public class A487 {
	class Solution {
		public int findMaxConsecutiveOnes(int[] nums) {
			int zero = 0;
			int left = 0, right = 0;
			while (right < nums.length) {
				if (nums[right] == 0)
					zero++;
				if (zero >= 2) {
					if (nums[left] == 0)
						zero--;
					left++;
				}
				right++;
			}
			System.out.println(nums.length + "   " + left);
			return nums.length - left;
		}
	}
}
