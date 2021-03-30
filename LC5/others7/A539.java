package others7;

import java.util.Arrays;
import java.util.List;

public class A539 {
	class Solution {
		public int findMinDifference(List<String> timePoints) {
			int[] arr = new int[timePoints.size()];
			int cur = 0;
			for (int i = 0; i < timePoints.size(); i++) {
				String temp = timePoints.get(i);
				int time = 0;
				time = temp.charAt(0) * 10 + temp.charAt(1);
				time = time * 60 + temp.charAt(3) * 10 + temp.charAt(4);
				arr[cur++] = time;
			}
			Arrays.sort(arr);
			int ans = 24 * 60;
			for (int i = 0; i < arr.length - 1; i++) {
				ans = Math.min(ans, arr[i + 1] - arr[i]);
			}
			return Math.min(ans, arr[0] + 1440 - arr[arr.length - 1]);
		}
	}
}
