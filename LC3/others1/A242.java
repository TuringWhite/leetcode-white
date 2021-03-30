package others1;

import java.util.HashMap;
import java.util.Map;

public class A242 {

	class Solution {
		public boolean isAnagram(String s, String t) {
			if (s.length() != t.length())
				return false;
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			char[] arr = s.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if (!map.containsKey(arr[i])) {
					map.put(arr[i], 1);
				} else {
					map.replace(arr[i], map.get(arr[i]) + 1);
				}
			}
			char[] out = t.toCharArray();
			for (int i = 0; i < out.length; i++) {
				if (!map.containsKey(out[i])) {
					return false;
				} else {
					map.replace(out[i], map.get(out[i]) - 1);
					if (map.get(out[i]) < 0) {
						return false;
					}
				}
			}
			
			return true;
		}
	}
}
