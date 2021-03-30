package others7;

public class A495 {
	class Solution {
		public int findPoisonedDuration(int[] timeSeries, int duration) {
			if (timeSeries.length == 0)
				return 0;
			int sum = 0;

			for (int i = 1; i < timeSeries.length; i++) {
				if (timeSeries[i - 1] + duration <= timeSeries[i])
					sum += duration;
				else {
					sum += timeSeries[i] - timeSeries[i - 1];
				}
			}
			sum += duration;
			return sum;
		}
	}
}
