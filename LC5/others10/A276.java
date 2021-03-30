package others10;

public class A276 {
	class Solution {
		public int numWays(int n, int k) {
			int[] dp = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				if (i == 1)
					dp[i] = k;
				else if (i == 2) {
					dp[i] = k * k;
				} else {
					dp[i] = (dp[i - 1] + dp[i - 2]) * (k - 1);
				}
			}
			return dp[n];
		}

	}
}

class Solution2 {
	public int numWays(int n, int k) {
		int[] f = new int[n + 1]; // 方案数表，f[3] 表示给 3 个栅栏上色的方案数
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				f[i] = k;
			} else if (i == 2) {
				f[i] = k * k;
			} else {
				// 第 n 个栅栏如果和上一个不同颜色，则有 f[i-1] * (k-1) 个方案数
				// 第 n 个栅栏如果和上一个同颜色，那么上一个和前一个就不能同颜色，则有 f[i-2] * (k-1)
				// 第 n 个栅栏上色方案数合计：f[i-1] * (k-1) + f[i-2] * (k-1)
				f[i] = f[i - 1] * (k - 1) + f[i - 2] * (k - 1);
			}
		}
		return f[n];
	}
}
