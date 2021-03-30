package others5;

public class A495 {
	class Solution {
		public int findPoisonedDuration(int[] timeSeries, int duration) {
			if (timeSeries.length == 0)
				return 0;
			int sum = duration;

			for (int i = 1; i < timeSeries.length; i++) {
				if (timeSeries[i] - timeSeries[i - 1] < duration) {
					sum += timeSeries[i] - timeSeries[i - 1];
				} else {
					sum += duration;
				}
			}
			return sum;
		}
	}
}
