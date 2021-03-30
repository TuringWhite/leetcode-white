package others7;

public class A238 {
	class Solution {
		public int[] productExceptSelf(int[] nums) {
			int length = nums.length;
			int[] front = new int[length];
			int[] back = new int[length];
			front[0] = 1;
			for (int i = 1; i < length; i++) {
				front[i] = front[i - 1] * nums[i - 1];
			}
			back[length - 1] = 1;
			for (int i = length - 2; i >= 0; i--) {
				back[i] = back[i + 1] * nums[i + 1];
			}
			for (int i = 0; i < length; i++) {
				nums[i] = front[i] * back[i];
			}
			return nums;
		}
	}
}
