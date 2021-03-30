package others4;

import java.util.ArrayList;
import java.util.List;

public class A890 {
	class Solution {
		public List<String> findAndReplacePattern(String[] words, String pattern) {
			List<String> result = new ArrayList<String>();
			for (String word : words) {
				if (help(word, pattern) && help(pattern, word))
					result.add(word);
			}
			return result;
		}

		public boolean help(String s, String t) {
			if (s.length() != t.length())
				return false;
			char[] arr1 = s.toCharArray();
			char[] arr2 = t.toCharArray();
			boolean[] flag2 = new boolean[t.length()];
			for (int i = 0; i < arr1.length; i++) {
				if (flag2[i] == false) {
					char temp = arr2[i];
					char replacement = arr1[i];
					for (int j = i; j < arr2.length; j++) {
						if (flag2[j] == false && arr2[j] == temp) {
							arr2[j] = replacement;
							flag2[j] = true;
						}
					}
				}
			}
			return String.copyValueOf(arr1).equals(String.copyValueOf(arr2));
		}

	}
}
