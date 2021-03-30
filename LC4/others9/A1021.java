package others9;

import java.util.Deque;
import java.util.LinkedList;

public class A1021 {
	class Solution {
		public String removeOuterParentheses(String S) {
			StringBuilder ans = new StringBuilder();
			Deque<Character> deque = new LinkedList<>();
			int num = 0;
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == '(') {
					deque.addLast('(');
					num++;
				} else {
					deque.addLast(')');
					num--;
				}
				if (num == 0) {
					if (!deque.isEmpty()) {
						deque.removeFirst();
						deque.removeLast();
						while (!deque.isEmpty())
							ans.append(deque.removeFirst());
					}
				}
			}
			return ans.toString();
		}
	}
}
