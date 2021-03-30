package others9;

import java.util.HashMap;
import java.util.Map;

public class A509 {
	class Solution {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		public int fib(int N) {
			if (N < 2)
				return N;
			map.put(0, 0);
			map.put(1, 1);

			for (int i = 2; i <= N; i++) {
				map.put(i, map.get(i - 1) + map.get(i - 2));
			}
			return map.get(N);
		}
	}
}
