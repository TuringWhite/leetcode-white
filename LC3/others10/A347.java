package others10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class A347 {
	class Solution {
		public int[] topKFrequent(int[] nums, int k) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int num : nums) {
				if (map.containsKey(num)) {
					map.put(num, map.get(num) + 1);
				} else {
					map.put(num, 1);
				}
			}
			int[][] arr = new int[map.size()][2];
			int cur = 0;
			for (int i : map.keySet()) {
				arr[cur][0] = i;
				arr[cur][1] = map.get(i);
				cur++;
			}
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[1] == o2[1])
						return o2[1] - o1[1];
					return o2[1] - o1[1];
				}
			});

			int[] result = new int[k];
			for (cur = 0; cur < k; cur++) {
				result[cur] = arr[cur][0];
			}
			return result;
		}
	}
}
