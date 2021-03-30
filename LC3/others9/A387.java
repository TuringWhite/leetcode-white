package others9;

import java.util.HashMap;
import java.util.Map;

public class A387 {
	class Solution {
		public int firstUniqChar(String s) {
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			char[] arr = s.toCharArray();
			for (char ch : arr) {
				if (map.containsKey(ch)) {
					map.replace(ch, 0);
				} else {
					map.put(ch, 1);
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if (map.get(arr[i]) == 1) {
					return i;
				}
			}
			return -1;
		}
	}
}
