package others3;

import java.util.Stack;

public class A394 {
	public String decodeString(String s) {
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ']') {
				String tempStr = "";
				while (!stack.peek().equals("[")) {
					tempStr = stack.pop() + tempStr;
				}
				stack.pop();
				String tempint = "";
				while (!stack.isEmpty() && stack.peek().charAt(0) <= '9' && stack.peek().charAt(0) >= '0') {
					tempint = stack.pop() + tempint;
				}
				String inString = "";
				for (int j = 0; j < Integer.parseInt(tempint); j++) {
					inString += tempStr;
				}
				stack.add(inString);
			} else {
				stack.add(s.charAt(i) + "");
			}
		}
		StringBuffer sBuffer = new StringBuffer();
		while (!stack.isEmpty()) {
			sBuffer.insert(0, stack.pop());
		}
		return sBuffer.toString();
	}
}
