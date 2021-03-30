package others10;

public class A1209 {
	class Solution {
		public String removeDuplicates(String s, int k) {
			char[] stack = new char[s.length()];
			int top = 0;
			int j;
			for (int i = 0; i < s.length(); i++) {
				if (top >= k - 1 && stack[top - 1] == s.charAt(i)) {
					for (j = 2; j < k; j++) {
						if (stack[top - j] != s.charAt(i)) {
							break;
						}
					}
					if (j == k) {
						top = top - (k - 1);
						System.out.println(top);
					} else {
						stack[top++] = s.charAt(i);
					}
				} else {
					stack[top++] = s.charAt(i);
				}
			}
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < top; i++) {
				sBuilder.append(stack[i]);
			}
			return sBuilder.toString();
		}
	}
}