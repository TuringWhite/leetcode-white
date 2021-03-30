package others5;

public class A453 {
	class Solution {
		public int minMoves(int[] nums) {
			int min = Integer.MAX_VALUE;
			for (int num : nums) {
				min = Math.min(min, num);

			}
			int ans = 0;
			for (int num : nums) {
				ans += Math.abs(min - num);
			}
			return ans;
		}
	}

}
