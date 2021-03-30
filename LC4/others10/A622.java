package others10;

public class A622 {
	class MyCircularQueue {
		int[] queue;
		int front, rear, size, count;

		public MyCircularQueue(int k) {
			queue = new int[k];
			front = 0;
			rear = -1;
			size = k;
			count = 0;
		}

		public boolean enQueue(int value) {
			if (count < size) {
				rear = (rear + 1) % size;
				queue[rear] = value;
				count++;
				return true;
			}
			return false;
		}

		public boolean deQueue() {
			if (count > 0) {
				front = (front + 1) % size;
				count--;
				return true;
			}
			return false;
		}

		public int Front() {
			if (count <= 0)
				return -1;
			return queue[front];
		}

		public int Rear() {
			if (count <= 0)
				return -1;
			return queue[rear];
		}

		public boolean isEmpty() {
			return count == 0;
		}

		public boolean isFull() {
			return count == size;
		}
	}

	/**
	 * Your MyCircularQueue object will be instantiated and called as such:
	 * MyCircularQueue obj = new MyCircularQueue(k); boolean param_1 =
	 * obj.enQueue(value); boolean param_2 = obj.deQueue(); int param_3 =
	 * obj.Front(); int param_4 = obj.Rear(); boolean param_5 = obj.isEmpty();
	 * boolean param_6 = obj.isFull();
	 */
}
