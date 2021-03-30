package others6;

public class A520 {
	class Solution {
		public boolean detectCapitalUse(String word) {
			boolean flag = true;
			if(word.length()<=1)
				return true;
			if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
				if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
					flag = false;
				}
				for (int i = 2; i < word.length(); i++) {
					if (flag == true) {
						if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
							return false;
						}
					} else {
						if (!(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
							return false;
						}
					}
				}
			} else {
				for (int i = 1; i < word.length(); i++) {
					if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
						return false;
					}
				}
			}
			return true;
		}
	}
}
