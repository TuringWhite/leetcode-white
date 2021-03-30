package a71_80;

public class A75 {
	class Solution {
		public void sortColors(int[] nums) {
			int left = 0 - 1, right = nums.length;
			int cur = 0;
			while (cur < right) {
				if (nums[cur] == 0) {
					if (cur == left + 1) {
						left++;
						cur++;
					} else {
						swap(nums, left + 1, cur);
						left++;
					}

				} else if (nums[cur] == 1) {
					cur++;
				} else {
					swap(nums, cur, right - 1);
					right--;
				}
			}
		}

		public void swap(int[] arr, int left, int right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
	}
}
