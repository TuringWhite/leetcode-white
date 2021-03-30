package others10;

public class A1128 {
	class Solution {
		public int numEquivDominoPairs(int[][] dominoes) {
			int[] help = new int[100];
			int res = 0;
			for (int[] dominoe : dominoes) {
				if (dominoe[0] > dominoe[1]) {
					int temp = dominoe[0];
					dominoe[0] = dominoe[1];
					dominoe[1] = temp;
				}
				int num = dominoe[0] * 10 + dominoe[1];
				res += help[num];
				help[num]++;
			}
			return res;
		}
	}
}

class Solution1 {

	public int numEquivDominoPairs(int[][] dominoes) {
		int[] freq = new int[100];

		int count = 0;
		for (int[] dominoe : dominoes) {
			if (dominoe[0] > dominoe[1]) {
				int temp = dominoe[0];
				dominoe[0] = dominoe[1];
				dominoe[1] = temp;
			}

			int num = dominoe[0] * 10 + dominoe[1];
			count += freq[num];
			freq[num]++;
		}
		return count;
	}
}
