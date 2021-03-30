package others10;

public class A1544 {
	class Solution {
		public String makeGood(String s) {
			char[] stack = new char[s.length()];
			int cur = 0;
			int length = Math.abs('A' - 'a');
			for (char ch : s.toCharArray()) {
				if (cur >= 1 && Math.abs(stack[cur - 1] - ch) == length) {
					--cur;
				} else {
					stack[cur++] = ch;
				}
			}
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < cur; i++) {
				sBuilder.append(stack[i]);
			}
			return sBuilder.toString();
		}
	}
}
