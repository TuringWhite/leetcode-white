package others4;

import java.util.Stack;

public class A856 {
	class Solution {
		public int scoreOfParentheses(String S) {
			Stack<Character> stack = new Stack<>();
			char[] c = S.toCharArray();
			int sum = 0;
			boolean f = true;
			for (int i = 0; i < c.length; i++) {
				if (c[i] == '(') {
					stack.add(c[i]);
					f = true;
				} else {
					if (f) {
						sum += Math.pow(2, stack.size() - 1);
						stack.pop();
						f = false;
					} else {
						stack.pop();
					}
				}
			}
			return sum;
		}
	}
	
	
	//官方题解的栈，tql
//	public int scoreOfParentheses(String S) {
//	    Stack<Integer> stack = new Stack();
//	    stack.push(0); // The score of the current frame
//
//	    for (char c: S.toCharArray()) {
//	        if (c == '(')
//	            stack.push(0);
//	        else {
//	            int v = stack.pop();
//	            int w = stack.pop();
//	            stack.push(w + Math.max(2 * v, 1));
//	        }
//	    }
//
//	    return stack.pop();
//	}

}
