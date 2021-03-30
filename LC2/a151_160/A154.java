package a151_160;

public class A154 {
	class Solution {
		public int findMin(int[] nums) {
			int left = 0, right = nums.length - 1;
			if (nums[left] < nums[right])
				return nums[0];
			while (left < right) {
				int mid = left + (right - left) / 2;

				if (nums[mid] > nums[right])
					left = mid + 1;
				else if (nums[mid] < nums[right]) {
					right = mid;
				} else if (nums[mid] == nums[right]) {
					right--;
				}
			}

			return nums[left];
		}
	}
}
