package a121_130;

public class A121 {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(maxProfit(new int[]{7,6,4,3,2,1}));
		System.out.println(maxProfit(new int[] {1,2}));
	}

	public static int maxProfit(int[] prices) {

		int profit = 0;
		for (int i = prices.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				profit = profit > (prices[i] - prices[j]) ? profit : (prices[i] - prices[j]);
			}
			while (i>0&&prices[i] >= prices[i - 1]) {
				i--;
			}
		}

		return profit;
	}
}
