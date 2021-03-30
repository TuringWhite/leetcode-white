package others4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A1525 {
	class Solution {
		public int numSplits(String s) {
			Set<Character> left = new HashSet<>();
			Map<Character, Integer> right = new HashMap<>();
			char key;
			for (int i = 0; i < s.length(); i++) {
				key = s.charAt(i);
				if (right.containsKey(key)) {
					right.replace(key, right.get(key) + 1);
				} else {
					right.put(key, 1);
				}
			}
			int result = 0;
			for (int i = 0; i < s.length(); i++) {
				key = s.charAt(i);
				if (!left.contains(key))
					left.add(key);
				right.replace(key, right.get(key) - 1);
				if (right.get(key) == 0)
					right.remove(key);
				if (left.size() == right.keySet().size())
					result++;
			}
			return result;
		}
	}
}
