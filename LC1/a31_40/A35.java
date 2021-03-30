package a31_40;

public class A35 {

	// ！！！！！！！！！！！！！！！！！！
	// 注意，这个方法可以跑通，但是我也不理解为啥！！！！！！！！！
	// 有时间再读读，阅读题解
	class Solution {
		public int searchInsert(int[] nums, int target) {
			int left = 0, right = nums.length;
			while (left < right) {
				int mid = left + (right - left) / 2;
				if (nums[mid] == target) {
					return mid;
				}
				if (nums[mid] > target) {
					right = mid;
				} else {
					left = mid + 1;
				}
			}
			return left;
		}
	}

//	二分，一个能过的模板，但是比较lj
//	class Solution {
//		public int searchInsert(int[] nums, int target) {
//			if (nums.length == 0) {
//				return 0;
//			}
//			int left = 0, right = nums.length - 1;
//			while (left <= right) {
//				int mid = left + (right - left) / 2;
//				if (nums[mid] == target)
//					return mid;
//				if (nums[mid] < target) {
//					left = mid + 1;
//				} else {
//					right = mid - 1;
//				}
//			}
//			//直接return left就可以，left一定是最大的
//			return Math.max(left, right);
//		}
//	}

//	public static void main(String[] args) {
//		int[] nums = new int[] { 1, 3, 5, 6 };
//		System.out.println(searchInsert(nums, 5));
//		System.out.println(searchInsert(nums, 2));
//		System.out.println(searchInsert(nums, 7));
//		System.out.println(searchInsert(nums, 0));
//		int[] nums2 = new int[] { 1 };
//		System.out.println(searchInsert(nums2, 0));
//		System.out.println(searchInsert(nums2, 1));
//		System.out.println(searchInsert(nums2, 2));
//		int[] num3 = new int[] {};
//		System.out.println(searchInsert(num3, 0));
//	}
//
//	public static int searchInsert(int[] nums, int target) {
//		for (int i = 0; i < nums.length; i++) {
//			if (target <= nums[i])
//				return i;
//		}
//		return nums.length;
//	}
}
