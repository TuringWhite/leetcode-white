package a31_40;

public class A34 {
	class Solution {
		public int[] searchRange(int[] nums, int target) {
			int left = 0, right = nums.length-1;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				if (nums[mid] < target) {
					left = left + 1;
				} else if (nums[mid] > target) {
					right = right - 1;
				} else {
					while (nums[left] != target) {
						left++;
					}
					while (nums[right] != target) {
						right--;
					}
					return new int[] { left, right };
				}
			}

			if (left > right)
				return new int[] { -1, -1 };
			return nums;

		}
	}
}
