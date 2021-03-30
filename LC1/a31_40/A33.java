package a31_40;

public class A33 {
	class Solution {
		public int search(int[] nums, int target) {
			int left = 0, right = nums.length - 1;
			while (left < right) {
				int mid = left + (right - left) / 2;
				if (target == nums[mid])
					return mid;
				if (target == nums[left])
					return left;
				if (target == nums[right]) {
					return right;
				}
				if (target > nums[mid]) {
					if (nums[0] < nums[mid]) {
						left = mid + 1;
						right--;
					} else {
						right--;
						left++;
					}

				} else if (target < nums[mid]) {
					if (nums[0] < nums[mid]) {
						right--;
						left++;
					} else {
						right = mid - 1;
						left++;
					}
				}
			}
			if (left < nums.length && nums[left] == target)
				return left;
			else {
				return -1;
			}
		}
	}

//	咱的，但是代码实现有问题，和官方题解思路一样呀
//	class Solution {
//		public int search(int[] nums, int target) {
//			int left = 0, right = nums.length - 1;
//			int mid = left + (right - left) / 2;
//			while (left <= right) {
//				if (nums[mid] == target) {
//					return mid;
//				}
//				if (nums[mid] > nums[left]) {
//					if (nums[mid] < target) {
//						left = mid + 1;
//					} else {
//						if (nums[right] == target)
//							return right;
//						else if (nums[right] > target) {
//							left = mid + 1;
//						} else {
//							right = mid - 1;
//						}
//					}
//				} else {
//					if (nums[mid] > target) {
//						right = mid - 1;
//					} else {
//						if (nums[left] == target)
//							return left;
//						else if (nums[left] < target) {
//							right = mid - 1;
//						} else {
//							left = mid + 1;
//						}
//					}
//				}
//				mid = left + (right - left) / 2;
//			}
//			return -1;
//		}
//	}
}
