package others3;

public class A680 {
	class Solution {
		boolean result = false;

		public boolean validPalindrome(String s) {
			help(s, 0, s.length() - 1, true);
			return result;
		}

		public void help(String s, int left, int right, boolean flag) {
			while (left < right) {
				if (s.charAt(left) == s.charAt(right)) {
					left++;
					right--;
				} else if (flag == true) {
					help(s, left + 1, right, false);
					help(s, left, right - 1, false);
					return;
				} else {
					return;
				}

			}
			if (left >= right)
				result = true;
		}
	}
}
