package a151_160;

import java.util.Stack;

public class A155 {
	class MinStack {
		private Stack<Integer> stack;
		private Stack<Integer> minStack;

		/** initialize your data structure here. */
		public MinStack() {
			this.stack = new Stack<>();
			this.minStack = new Stack<>();
		}

		public void push(int x) {
			stack.push(x);
			if (minStack.isEmpty() || minStack.peek() > x) {
				minStack.push(x);
			} else {
				minStack.push(minStack.peek());
			}

		}

		public void pop() {
			stack.pop();
			minStack.pop();
		}

		public int top() {
			return stack.peek();
		}

		public int getMin() {
			return minStack.peek();
		}
	}
}
