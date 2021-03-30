package a121_130;

public class A122 {
	// 下面是贪心，比较简单，回头在用动态规划再刷一遍
	public int maxProfit(int[] prices) {
		if (prices.length == 1)
			return 0;
		int sum = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i - 1] < prices[i])
				sum = sum + (prices[i] - prices[i - 1]);
		}
		return sum;
	}
}
