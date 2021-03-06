package others10;

public class A641 {

//MyCircularDeque(k)：构造函数,双端队列的大小为k。
//insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true。
//insertLast()：将一个元素添加到双端队列尾部。如果操作成功返回 true。
//deleteFront()：从双端队列头部删除一个元素。 如果操作成功返回 true。
//deleteLast()：从双端队列尾部删除一个元素。如果操作成功返回 true。
//getFront()：从双端队列头部获得一个元素。如果双端队列为空，返回 -1。
//getRear()：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。
//isEmpty()：检查双端队列是否为空。
//isFull()：检查双端队列是否满了。

	class MyCircularDeque {
		int[] deque;
		int front, last, count, size;

		/** Initialize your data structure here. Set the size of the deque to be k. */
		public MyCircularDeque(int k) {
			deque = new int[k];
			front = -1;
			last = 0;
			count = 0;
			size = k;
		}

		/**
		 * Adds an item at the front of Deque. Return true if the operation is
		 * successful.
		 */
		public boolean insertFront(int value) {
			if (count < size) {
				front = (front + 1) % size;
				deque[front] = value;
				count++;
				return true;
			}
			return false;
		}

		/**
		 * Adds an item at the rear of Deque. Return true if the operation is
		 * successful.
		 */
		public boolean insertLast(int value) {
			if (count < size) {
				last = (last + size - 1) % size;
				deque[last] = value;
				count++;
				return true;
			}
			return false;
		}

		/**
		 * Deletes an item from the front of Deque. Return true if the operation is
		 * successful.
		 */
		public boolean deleteFront() {
			if (count > 0) {
				count--;
				front = (front + size - 1) % size;
				return true;
			}
			return false;
		}

		/**
		 * Deletes an item from the rear of Deque. Return true if the operation is
		 * successful.
		 */
		public boolean deleteLast() {
			if (count > 0) {
				count--;
				last = (last + 1) % size;
				return true;
			}
			return false;
		}

		/** Get the front item from the deque. */
		public int getFront() {
			if (count > 0)
				return deque[front];
			return -1;
		}

		/** Get the last item from the deque. */
		public int getRear() {
			if (count > 0)
				return deque[last];
			return -1;
		}

		/** Checks whether the circular deque is empty or not. */
		public boolean isEmpty() {
			if (count == 0)
				return true;
			return false;
		}

		/** Checks whether the circular deque is full or not. */
		public boolean isFull() {
			if (count == size)
				return true;
			return false;
		}
	}

	/**
	 * Your MyCircularDeque object will be instantiated and called as such:
	 * MyCircularDeque obj = new MyCircularDeque(k); boolean param_1 =
	 * obj.insertFront(value); boolean param_2 = obj.insertLast(value); boolean
	 * param_3 = obj.deleteFront(); boolean param_4 = obj.deleteLast(); int param_5
	 * = obj.getFront(); int param_6 = obj.getRear(); boolean param_7 =
	 * obj.isEmpty(); boolean param_8 = obj.isFull();
	 */
}
