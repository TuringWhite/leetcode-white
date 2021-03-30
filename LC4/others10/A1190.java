package others10;

import java.util.Stack;

public class A1190 {
	class Solution {
		public String reverseParentheses(String s) {
			Stack<Character> stack = new Stack<>();
			StringBuilder sBuilder = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ')') {
					while (stack.peek() != '(') {
						sBuilder.append(stack.pop());
					}
					stack.pop();
					for (int j = 0; j < sBuilder.length(); j++) {
						stack.add(sBuilder.charAt(j));
					}
					sBuilder.delete(0, sBuilder.length());
					System.out.println(sBuilder.toString());
				} else {
					stack.add(s.charAt(i));
				}
			}
			while (!stack.isEmpty()) {
				sBuilder.append(stack.pop());
			}
			return sBuilder.reverse().toString();
		}
	}
}
//写的不好，有例子跑不过
//"ta()usw((((a))))"
//public String reverseParentheses(String s) {
//StringBuilder sBuilder = new StringBuilder(s);
//int left = 0;
//int right = s.length() - 1;
//boolean flag = true;
//while (left < right) {
//	if (flag) {
//		while (left < right && sBuilder.charAt(left) != '(') {
//			left++;
//		}
//		while (left < right && sBuilder.charAt(right) != ')') {
//			right--;
//		}
//		flag = false;
//	} else {
//		while (left < right && sBuilder.charAt(left) != ')') {
//			left++;
//		}
//		while (left < right && sBuilder.charAt(right) != '(') {
//			right--;
//		}
//		flag = true;
//	}
//
//	if (left >= right)
//		break;
//	sBuilder = sBuilder.deleteCharAt(right);
//	sBuilder = sBuilder.deleteCharAt(left);
//	right -= 2;
//	sBuilder = sBuilder.replace(left, right + 1,
//			new StringBuilder(sBuilder.substring(left, right + 1)).reverse().toString());
//}
//return sBuilder.toString();
//}