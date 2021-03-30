package a81_90;

public class A81 {
	class Solution {
		public boolean search(int[] nums, int target) {
			int left = 0, right = nums.length - 1;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				if (nums[mid] == target) {
					return true;
				}

			}
			return false;
		}
	}
}
