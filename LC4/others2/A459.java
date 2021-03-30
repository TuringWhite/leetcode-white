package others2;

public class A459 {
	class Solution {
		public boolean repeatedSubstringPattern(String s) {
			if (s.equals(s.substring(0, s.length() / 2)))
				return true;
			int length = 1;
			int i = 0;
			while (length <= s.length() / 2) {
				// 如果s由重复子串构成，s.length = n * sub.length。
				if (s.length() % length == 0) {
					String sub = s.substring(0, length);
					for (i = length; i < s.length(); i = i + length) {
						if (i + length > s.length() || !sub.equals(s.substring(i, i + length)))
							break;
					}
					if (i >= s.length())
						return true;
				}
				length++;
			}
			return false;
		}
	}
}

class Solution {
	public boolean repeatedSubstringPattern(String s) {
		int n = s.length();
		for (int i = 1; i * 2 <= n; ++i) {
			if (n % i == 0) {
				boolean match = true;
				for (int j = i; j < n; ++j) {
					if (s.charAt(j) != s.charAt(j - i)) {
						match = false;
						break;
					}
				}
				if (match) {
					return true;
				}
			}
		}
		return false;
	}
}
