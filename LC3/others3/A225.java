package others3;

import java.util.LinkedList;
import java.util.Queue;

public class A225 {
	class MyStack {
		Queue<Integer> one;
		Queue<Integer> another;

		/** Initialize your data structure here. */
		public MyStack() {
			one = new LinkedList<Integer>();
			another = new LinkedList<Integer>();
		}

		/** Push element x onto stack. */
		public void push(int x) {
			if (another.isEmpty()) {
				one.add(x);
			} else {
				one.add(x);
			}
		}

		/** Removes the element on top of the stack and returns that element. */
		public int pop() {
			if (one.isEmpty()) {
				while (another.size() > 1) {
					one.add(another.poll());
				}
				return another.poll();
			} else {
				while (one.size() > 1) {
					another.add(one.poll());
				}
				return one.poll();
			}
		}

		/** Get the top element. */
		public int top() {
			if (one.isEmpty()) {
				while (another.size() > 1) {
					one.add(another.poll());
				}
				one.add(another.peek());
				return another.poll();
			} else {
				while (one.size() > 1) {
					another.add(one.poll());
				}
				another.add(one.peek());
				return one.poll();
			}
		}

		/** Returns whether the stack is empty. */
		public boolean empty() {
			if (one.isEmpty() && another.isEmpty())
				return true;
			else {
				return false;
			}
		}
	}
}
