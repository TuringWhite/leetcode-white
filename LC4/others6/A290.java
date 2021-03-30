package others6;

import java.util.HashMap;
import java.util.Map;

public class A290 {
	class Solution {
		public boolean wordPattern(String pattern, String s) {
			Map<Character, String> map = new HashMap<Character, String>();
			s = s.trim();
			String[] arr = s.split(" ");
			if (pattern.length() != arr.length)
				return false;
			for (int i = 0; i < pattern.length(); i++) {
				if (map.containsKey(pattern.charAt(i))) {
					if (!map.get(pattern.charAt(i)).equals(arr[i]))
						return false;
				} else {
					if (map.values().contains(arr[i]))
						return false;
					map.put(pattern.charAt(i), arr[i]);
				}
			}
			return true;
		}
	}
}
