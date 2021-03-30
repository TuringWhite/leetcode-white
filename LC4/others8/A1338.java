package others8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A1338 {
	class Solution {
		public int minSetSize(int[] arr) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int num : arr) {
				if (map.containsKey(num))
					map.put(num, map.get(num) + 1);
				else {
					map.put(num, 1);
				}
			}
			int num = 0;
			int border = arr.length / 2;
			int ans = 0;
			List<Integer> list = new ArrayList<Integer>(map.values());
			list.sort(null);
			int cur = list.size() - 1;
			while (num < border) {
				num += list.get(cur--);
				ans++;
			}
			return ans;
		}
	}
}
