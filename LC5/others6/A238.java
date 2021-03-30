package others6;

public class A238 {
	class Solution {
		public int[] productExceptSelf(int[] nums) {
			int[] front = new int[nums.length];
			int[] back = new int[nums.length];
			front[0] = 1;
			for (int i = 1; i < nums.length; i++) {
				front[i] = front[i - 1] * nums[i - 1];
			}
			back[nums.length - 1] = 1;
			for (int i = nums.length - 2; i >= 0; i--) {
				back[i] = back[i + 1] * nums[i + 1];
			}
			for (int i = 0; i < nums.length; i++) {
				nums[i] = front[i] * back[i];
			}
			return nums;
		}
	}
}
