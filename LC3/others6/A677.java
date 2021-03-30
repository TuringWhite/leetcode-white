package others6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A677 {
	class MapSum {

		Map<String, Integer> map;

		/** Initialize your data structure here. */
		public MapSum() {
			map = new HashMap<String, Integer>();
		}

		public void insert(String key, int val) {
			if (!map.containsKey(key)) {
				map.put(key, val);
			} else {
				map.replace(key, val);
			}
		}

		public int sum(String prefix) {
			Set<String> set = map.keySet();
			int sum = 0, length = prefix.length();
			for (String string : set) {
				if (string.length() >= length && string.substring(0, length).equals(prefix)) {
					sum += map.get(string);
				}
			}
			return sum;
		}
	}
}
