package others6;

public class A421 {
	public static void main(String[] args) {
		System.out.println(5 ^ 25);
	}

	// 超时了qwq
	// 题目要求了O(N)，暴力必超时，口吐芬芳
	class Solution {
		public int findMaximumXOR(int[] nums) {
			int result = 0;
			for (int i = 0; i < nums.length - 1; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					result = result > (nums[i] ^ nums[j]) ? result : (nums[i] ^ nums[j]);
				}
			}
			return result;
		}
	}
}
