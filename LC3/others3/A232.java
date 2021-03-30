package others3;

import java.util.Stack;

public class A232 {
	class MyQueue {

		Stack<Integer> in;
		Stack<Integer> out;

		/** Initialize your data structure here. */
		public MyQueue() {
			in = new Stack<>();
			out = new Stack<>();
		}

		/** Push element x to the back of queue. */
		public void push(int x) {
			in.push(x);
		}

		/** Removes the element from in front of queue and returns that element. */
		public int pop() {
			if (out.isEmpty()) {
				if (in.isEmpty()) {
					return -1;
				} else {
					while (!in.isEmpty()) {
						out.add(in.pop());
					}
					return out.pop();
				}
			} else {
				return out.pop();
			}
		}

		/** Get the front element. */
		public int peek() {
			if (out.isEmpty()) {
				if (in.isEmpty()) {
					return -1;
				} else {
					while (!in.isEmpty()) {
						out.add(in.pop());
					}
					return out.peek();
				}
			} else {
				return out.peek();
			}
		}

		/** Returns whether the queue is empty. */
		public boolean empty() {
			if (in.isEmpty() && out.isEmpty())
				return true;
			else {
				return false;
			}
		}
	}
}
