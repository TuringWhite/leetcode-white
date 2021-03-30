package others4;

import java.util.HashMap;
import java.util.Map;

public class A1347 {
	class Solution {
		public int minSteps(String s, String t) {
			Map<Character, Integer> help = new HashMap<>();
			for (int i = 0; i < s.length(); i++) {
				if (help.containsKey(s.charAt(i))) {
					help.replace(s.charAt(i), help.get(s.charAt(i)) + 1);
				} else {
					help.put(s.charAt(i), 1);
				}
			}
			for (int i = 0; i < t.length(); i++) {
				if (help.containsKey(t.charAt(i))) {
					help.replace(t.charAt(i), help.get(t.charAt(i)) - 1);
				} else {
					help.put(t.charAt(i), -1);
				}
			}
			int result = 0;
			for (Character ch : help.keySet()) {
				if (help.get(ch) > 0)
					result = result + help.get(ch);
			}
			return result;
		}
	}
}
