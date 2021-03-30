package a161_170;

public class A162 {
	class Solution {
		public int findPeakElement(int[] nums) {
			int left = 0, right = nums.length - 1;
			int mid = left + (right - left) / 2;
			while (left < right) {
				if (nums[mid] <= nums[mid + 1]) {
					left = mid + 1;
				} else {
					right = mid;
				}
				mid = left + (right - left) / 2;
			}
			return left;
		}
	}
}
