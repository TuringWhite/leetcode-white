package others10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A599 {
	class Solution {
		public String[] findRestaurant(String[] list1, String[] list2) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < list1.length; i++) {
				map.put(list1[i], i);
			}
			Map<String, Integer> help = new HashMap<>();
			int min = 10000;
			for (int i = 0; i < list2.length; i++) {
				if (map.containsKey(list2[i])) {
					help.put(list2[i], i + map.get(list2[i]));
					min = min < i + map.get(list2[i]) ? min : i + map.get(list2[i]);
				}
			}
			List<String> list = new ArrayList<>();
			for (String key : help.keySet()) {
				if (help.get(key) == min) {
					list.add(key);
				}
			}
			String[] result = new String[list.size()];
			for (int i = 0; i < result.length; i++) {
				result[i] = list.get(i);
			}
			return result;
		}
	}
}
