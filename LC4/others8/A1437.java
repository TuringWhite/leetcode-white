package others8;

public class A1437 {
	class Solution {
		public boolean kLengthApart(int[] nums, int k) {
			int left, right;
			for (left = 0; left < nums.length && nums[left] != 1; left++)
				;
			right = left + 1;
			while (right < nums.length) {
				while (right < nums.length && nums[right] != 1) {
					right++;
				}
				if (right >= nums.length)
					break;
				if (right - left - 1 < k)
					return false;
				left = right;
				right++;
			}
			return true;
		}
	}
}
