package others4;

import java.util.Arrays;

public class A1046 {
	class Solution {
		public int lastStoneWeight(int[] stones) {
			Arrays.sort(stones);
			if (stones.length == 1)
				return stones[1];
			if (stones.length == 2) {
				return Math.abs(stones[1] - stones[0]);
			}

			int ans = stones[0];
			for (int i = 1; i < stones.length - 2; i++) {
				ans = Math.abs(stones[i] - ans);
			}
			if (ans + stones[stones.length - 2] > stones[stones.length - 1]) {
				return ans + stones[stones.length - 2] - stones[stones.length - 1];
			}
			return ans - stones[stones.length - 2] - stones[stones.length - 1];
		}
	}
}
