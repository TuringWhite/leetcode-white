package others10;

public class A1249 {
	class Solution {
		public String minRemoveToMakeValid(String s) {
			char[] stack = new char[s.length()];
			int cur = 0;
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				switch (s.charAt(i)) {
				case '(':
					count++;
					stack[cur++] = '(';
					break;

				case ')':
					if (count > 0) {
						count--;
						stack[cur++] = ')';
					}
					break;
				default:
					stack[cur++] = s.charAt(i);
					break;
				}
			}
			StringBuilder anStringBuilder = new StringBuilder();
			for (int i = 0; i < cur; i++) {
				anStringBuilder.append(stack[i]);
			}
			s = anStringBuilder.toString();

			stack = new char[s.length()];
			cur = 0;
			count = 0;
			for (int i = s.length() - 1; i >= 0; i--) {
				switch (s.charAt(i)) {
				case '(':
					if (count > 0) {
						count--;
						stack[cur++] = '(';
					}
					break;

				case ')':
					count++;
					stack[cur++] = ')';

					break;
				default:
					stack[cur++] = s.charAt(i);
					break;
				}
			}
			anStringBuilder = new StringBuilder();
			for (int i = 0; i < cur; i++) {
				anStringBuilder.append(stack[i]);
			}
			return anStringBuilder.reverse().toString();
		}
	}
}
