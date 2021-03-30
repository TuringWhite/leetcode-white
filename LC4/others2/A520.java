package others2;

public class A520 {
	class Solution {
		public boolean detectCapitalUse(String word) {
			if (word.charAt(0) - 'A' < 26) {
				return word.substring(1).equals(word.substring(1).toLowerCase())
						|| word.substring(1).equals(word.substring(1).toUpperCase());
			} else {
				return word.substring(1).equals(word.substring(1).toLowerCase());
			}
		}
	}
}
