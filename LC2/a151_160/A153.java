package a151_160;

public class A153 {

	class Solution {
		public int findMin(int[] nums) {
			int left = 0, right = nums.length - 1;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				if (nums[mid] >= nums[right])
					left = mid + 1;
				else {
					right = mid;
				}
			}

			return nums[right];
		}
	}

//	class Solution {
//		public int findMin(int[] nums) {
//			int left = 0, right = nums.length - 1;
//			if (nums[left] < nums[right]) {
//				return nums[0];
//			}
//			while (left < right) {
//				int mid = left + (right - left) / 2;
//				if (nums[mid] > nums[right]) {
//					left = mid + 1;
//				} else {
//					right = mid;
//				}
//			}
//			return nums[left];
//		}
//
//	}

//	public static int findMin(int[] nums) {
//		for (int i = 0; i < nums.length - 1; i++) {
//			if (nums[i] > nums[i + 1])
//				return nums[i + 1];
//		}
//		return nums[0];
//	}
}
