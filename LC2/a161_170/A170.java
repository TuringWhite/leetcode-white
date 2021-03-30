package a161_170;

import java.util.HashMap;
import java.util.Map;

public class A170 {
	class TwoSum {
		Map<Integer, Integer> map;

		/** Initialize your data structure here. */
		public TwoSum() {
			map = new HashMap<Integer, Integer>();
		}

		/** Add the number to an internal data structure.. */
		public void add(int number) {
			map.put(number, map.getOrDefault(number, 0) + 1);
		}

		/** Find if there exists any pair of numbers which sum is equal to the value. */
		public boolean find(int value) {
			if (value % 2 == 0 && map.containsKey(value / 2)) {
				if (map.get(value / 2) >= 2) {
					return true;
				}
			}
			for (int num : map.keySet()) {
				if (map.containsKey(value - num) && value - num != num)
					return true;
			}
			return false;
		}
	}
}
