package others4;

import java.util.HashMap;
import java.util.Map;

public class A791 {
	class Solution {
		public String customSortString(String S, String T) {
			if (S.length() < 2)
				return T;
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i < T.length(); i++) {
				if (map.containsKey(T.charAt(i))) {
					map.replace(T.charAt(i), map.get(T.charAt(i)) + 1);
				} else {
					map.put(T.charAt(i), 1);
				}
			}
			StringBuffer sBuffer = new StringBuffer();
			int value = 0;
			char add;
			for (int i = 0; i < S.length(); i++) {
				add = S.charAt(i);
				if (map.containsKey(add)) {
					value = map.get(add);
					while (value-- > 0) {
						sBuffer.append(add);
					}
					map.remove(add);
				}
			}
			for (char key : map.keySet()) {
				value = map.get(key);
				while (value-- > 0) {
					sBuffer.append(key);
				}
			}
			return sBuffer.toString();
		}
	}
}
