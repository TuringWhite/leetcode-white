package others10;

import java.util.Arrays;

public class A322 {
	class Solution {
		public int coinChange(int[] coins, int amount) {
			if (amount < 0)
				return 0;
			return help(coins, amount, new int[amount]);
		}

		public int help(int[] coins, int rem, int[] count) {
			if (rem < 0)
				return -1;
			if (rem == 0)
				return 0;
			if (count[rem - 1] != 0)
				return count[rem - 1];
			int min = Integer.MAX_VALUE;
			for (int coin : coins) {
				int res = help(coins, rem - coin, count);
				if (res >= 0 && res < min)
					min = res + 1;
			}
			count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
			return count[rem - 1];
		}
	}

}

class Solution4 {
	public int coinChange(int[] coins, int amount) {
		int max = amount + 1;
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, max);
		dp[0] = 0;
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}
}
