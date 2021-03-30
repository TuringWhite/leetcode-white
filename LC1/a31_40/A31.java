package a31_40;

public class A31 {
	class Solution {
		public void nextPermutation(int[] nums) {
			int i, j;
			for (i = nums.length - 2; i >= 0; i--) {
				if (nums[i] < nums[i + 1])
					break;
			}
			if (i < 0) {
				reverse(nums, 0, nums.length - 1);
				return;
			}

			for (j = nums.length - 1; j >= 0; j--) {
				if (nums[j] > nums[i])
					break;
			}
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			reverse(nums, i + 1, nums.length - 1);
		}

		public void reverse(int[] nums, int i, int j) {
			while (i < j) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
			}
		}
	}
}
