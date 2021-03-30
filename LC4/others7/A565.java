package others7;

public class A565 {
	class Solution {
		public int arrayNesting(int[] nums) {
			int max = 0;
			int[] flag = new int[nums.length];
			int cur;
			int count;
			for (int i = 0; i < nums.length; i++) {
				if (flag[i] == 0) {
					cur = i;
					count = 0;
					while (flag[cur] == 0) {
						flag[cur] = 1;
						count++;
						cur = nums[cur];
					}
					max = Math.max(count, max);
				}
			}
			return max;
		}
	}
}
