package others9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A249 {
	class Solution {
		public List<List<String>> groupStrings(String[] strings) {
			Map<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
			for (String str : strings) {
				if (map.containsKey(str.length())) {
					map.get(str.length()).add(str);
				} else {
					map.put(str.length(), new ArrayList<>());
					map.get(str.length()).add(str);
				}
			}
			List<List<String>> res = new ArrayList<List<String>>();
			for (String key : strings) {
				if (map.get(key.length()).contains(key)) {
					List<String> list = new ArrayList<>();
					ArrayList<String> temp = map.get(key.length());
					for (String str : temp) {
						if (likesEquals(key, str)) {
							list.add(str);
						}
					}
					for (String str : list) {
						temp.remove(str);
					}
					res.add(list);
				}
			}
			return res;
		}

		public boolean likesEquals(String a, String b) {
			int n = (a.charAt(0) + 26 - b.charAt(0)) % 26;
			for (int i = 1; i < a.length(); i++) {
				if (n != (a.charAt(i) + 26 - b.charAt(i)) % 26)
					return false;
			}
			return true;
		}
	}
}

class Solution2 {
	private String hash(String str) {
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < str.length(); i++) {
			builder.append((str.charAt(i) - str.charAt(i - 1) + 26) % 26);
		}
		return builder.toString();
	}

	public List<List<String>> groupStrings(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String e : strs) {
			String hashed = hash(e);
			if (!map.containsKey(hashed)) {
				map.put(hashed, new ArrayList<String>());
			}
			List<String> list = map.get(hashed);
			list.add(e);
		}
		List<List<String>> res = new ArrayList<>();
		for (String key : map.keySet()) {
			res.add(map.get(key));
		}
		return res;
	}
}
