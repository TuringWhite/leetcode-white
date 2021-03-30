package others8;

import java.util.Arrays;

public class A611 {
	class Solution {
		public int triangleNumber(int[] nums) {
			int count = 0;
			int length = nums.length;
			Arrays.sort(nums);
			for (int i = 0; i < length - 2; i++) {
				for (int j = i + 1; j < length - 1; j++) {
					int a = nums[i], b = nums[j];
					int left = j + 1, right = length - 1;
					while (left <= right && !(a + b > nums[left])) {
						left++;
					}
					while (left <= right && !(a + b > nums[right])) {
						right--;
					}
					if (left <= right)
						count += right - left + 1;
				}
			}
			return count;
		}
	}
}

class Solution {
	public int triangleNumber(int[] nums) {
		int count = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int k = i + 2;
			for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
				while (k < nums.length && nums[i] + nums[j] > nums[k])
					k++;
				count += k - j - 1;
			}
		}
		return count;
	}
}
