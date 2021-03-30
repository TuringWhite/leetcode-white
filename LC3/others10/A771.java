package others10;

import java.util.HashSet;
import java.util.Set;

public class A771 {
	class Solution {
		public int numJewelsInStones(String J, String S) {
			Set<Character> set = new HashSet<>();
			char[] arr = J.toCharArray();
			char[] comp = S.toCharArray();
			for (char ch : arr) {
				set.add(ch);
			}
			int count = 0;
			for (char ch : comp) {
				if (set.contains(ch))
					count++;
			}
			return count;
		}
	}
}
