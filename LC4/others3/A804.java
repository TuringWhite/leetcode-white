package others3;

import java.util.HashSet;
import java.util.Set;

public class A804 {
	class Solution {
		public int uniqueMorseRepresentations(String[] words) {
			String[] dir = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
					"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
			Set<String> set = new HashSet<>();
			StringBuffer sBuffer = new StringBuffer();
			String temp;
			for (String string : words) {
				for (int i = 0; i < string.length(); i++) {
					sBuffer.append(dir[string.charAt(i) - 'a']);
				}
				temp = sBuffer.toString();
				if (!set.contains(temp))
					set.add(temp);
				sBuffer.delete(0, sBuffer.length());
			}
			return set.size();
		}
	}
}
