package others9;

public class A1381 {
	class CustomStack {
		int[] arr;
		int top;

		public CustomStack(int maxSize) {
			arr = new int[maxSize];
			top = 0;
		}

		public void push(int x) {
			if (top < arr.length)
				arr[top++] = x;
		}

		public int pop() {
			if (top <= 0) {
				return -1;
			} else {
				return arr[--top];
			}
		}

		public void increment(int k, int val) {
			for (int i = 0; i < k && i < top; i++) {
				arr[i] += val;
			}
		}
	}
}
