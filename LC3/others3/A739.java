package others3;

import java.util.Stack;

public class A739 {
	public static void main(String[] args) {
		int[] result = { 1000, 1000 };
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		// 两行代码分别执行
		//1
//		result[stack.peek()] = stack.pop();
		//2
		result[stack.pop()] = stack.peek();
		System.out.println(result[0] + "      " + result[1]);
	}

	public int[] dailyTemperatures(int[] T) {
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[T.length];
		for (int i = 0; i < T.length; i++) {
//			System.out.println(stack.size());
			if (stack.isEmpty() || T[stack.peek()] >= T[i]) {
				stack.add(i);
			} else {
				while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
					result[stack.peek()] = i - stack.pop();
				}
				stack.add(i);
			}
		}
		while (!stack.isEmpty()) {
			result[stack.pop()] = 0;
		}
		return result;
	}

	// 很神奇的单调栈，我当初是没想到的，看了题解才知道qwq

	// 暴力
//	public int[] dailyTemperatures(int[] T) {
//		int[] result = new int[T.length];
//		int j;
//		for (int i = 0; i < T.length; i++) {
//			for (j = i + 1; j < T.length; j++) {
//				if (T[j] > T[i]) {
//					break;
//				}
//			}
//			result[i] = j == T.length ? 0 : j - i;
//		}
//		return result;
//	}
}
