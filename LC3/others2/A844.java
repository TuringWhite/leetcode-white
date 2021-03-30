package others2;

import java.util.Stack;

public class A844 {
	public static boolean backspaceCompare(String S, String T) {
		char[] arr = S.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '#') {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.add(arr[i]);
			}
		}
		char[] arr2 = T.toCharArray();
		Stack<Character> stack2 = new Stack<>();
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == '#') {
				if (!stack2.isEmpty()) {
					stack2.pop();
				} else {
					continue;
				}
			} else {
				stack2.add(arr2[i]);
			}
		}
		while (!stack.isEmpty() && !stack2.isEmpty()) {
			if (stack.pop() != stack2.pop())
				return false;
		}
		if (stack.isEmpty() && stack2.isEmpty()) {

			return true;
		} else {
			return false;
		}
	}

}
