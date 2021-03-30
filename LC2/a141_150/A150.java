package a141_150;

import java.util.Stack;

public class A150 {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		char c;
		int a, b;
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
				a = stack.pop();
				b = stack.pop();
				c = tokens[i].charAt(0);

				switch (c) {
				case '+':
					b += a;
					break;
				case '-':
					b -= a;
					break;
				case '*':
					b *= a;
					break;
				case '/':
					b /= a;
					break;
				// 不会出现其他情况
				default:
					return -1;
				}
				stack.add(b);
			} else {
				stack.add(Integer.valueOf(tokens[i]));
			}
		}
		return stack.isEmpty() ? 0 : stack.pop();
	}
}
//if (c <= '9' && c >= '0') {
//	stack.add(c - '0');
//} else 