package others9;

public class A1003 {
	class Solution {
		public boolean isValid(String s) {
			char[] stack = new char[s.length()];
			int cur = 0;
			for (int i = 0; i < s.length(); i++) {
				if (cur >= 2 && s.charAt(i) == 'c') {
					if (stack[cur - 1] == 'b' && stack[cur - 2] == 'a') {
						cur -= 2;
					}
				} else {
					stack[cur++] = s.charAt(i);
				}
			}
			return cur == 0;
		}
	}
}
