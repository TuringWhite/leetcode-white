package a141_150;

import java.util.LinkedHashMap;
import java.util.Map;

public class A146 {
	class LRUCache {
		int cap;
		Map<Integer, Integer> map;

		public LRUCache(int capacity) {
			this.cap = capacity;
			map = new LinkedHashMap<Integer, Integer>();
		}

		public int get(int key) {
			if (map.containsKey(key)) {
				int value = map.get(key);
				map.remove(key);
				map.put(key, value);
				return value;
			}
			return -1;
		}

		public void put(int key, int value) {
			if (map.containsKey(key)) {
				map.remove(key);
				map.put(key, value);
			}
			map.put(key, value);
			if (map.size() > cap) {
				map.remove(map.entrySet().iterator().next().getKey());
			}
		}
	}

	/**
	 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
	 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
	 */
}
