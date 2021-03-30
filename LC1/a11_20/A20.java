package a11_20;

import java.util.Stack;

public class A20 {
	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("(){}[]"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));
		System.out.println(isValid("("));
		System.out.println(isValid(")"));
	}

	public static boolean isValid(String s) {
		char[] chs = s.toCharArray();
		char ch;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < chs.length; i++) {
			ch = chs[i];
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					stack.push(ch);
					break;
				} else if (ch == ')' && stack.peek() == '(') {
					stack.pop();
				} else if (ch == '}' && stack.peek() == '{') {
					stack.pop();
				} else if (ch == ']' && stack.peek() == '[') {
					stack.pop();
				} else
					return false;
			}
		}

		if (stack.isEmpty()) {
			return true;
		} else
			return false;
	}
}
