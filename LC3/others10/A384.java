package others10;

import java.util.Arrays;

public class A384 {
	class Solution {
		int[] nums;
		int[] root;

		public Solution(int[] nums) {
			this.nums = nums;
			this.root = Arrays.copyOf(nums, nums.length);
		}

		/** Resets the array to its original configuration and return it. */
		public int[] reset() {
			return root;
		}

		/** Returns a random shuffling of the array. */
		public int[] shuffle() {
			int i = (int) (Math.random() * nums.length), j = (int) (Math.random() * nums.length);
			if (i != j) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
			return nums;
		}
	}
}
