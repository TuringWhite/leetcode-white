package others10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class A288 {
	class ValidWordAbbr {
		Map<String, HashSet<String>> map;

		public ValidWordAbbr(String[] dictionary) {
			map = new HashMap<String, HashSet<String>>();
			for (String str : dictionary) {
				String temp;
				if (str.length() == 2) {
					temp = str;
				} else {
					temp = "" + (char) str.charAt(0) + (str.length() - 2) + (char) str.charAt(str.length() - 1);
				}
				if (map.containsKey(temp)) {
					if (!map.get(temp).contains(str))
						map.get(temp).add(str);
				} else {
					map.put(temp, new HashSet<>());
					map.get(temp).add(str);
				}
				System.out.println(map.get(temp).size());
			}
		}

		public boolean isUnique(String word) {
			String temp = "" + (char) word.charAt(0) + (word.length() - 2) + (char) word.charAt(word.length() - 1);
			if (map.containsKey(temp)) {
				if (map.get(temp).contains(word) && map.get(temp).size() == 1) {
					return true;
				} else {
					return false;
				}
			}
			return true;
		}
	}
}
