package others3;

public class A622 {
//	class MyCircularQueue {
//		int[] queue;
//		int head;
//		int tail;
//		int count;
//
//		/** Initialize your data structure here. Set the size of the queue to be k. */
//		public MyCircularQueue(int k) {
//			this.queue = new int[k];
//			head = 0;
//			tail = 0;
//			count = 0;
//		}
//
//		/**
//		 * Insert an element into the circular queue. Return true if the operation is
//		 * successful.
//		 */
//		public boolean enQueue(int value) {
//			if (count == queue.length) {
//				return false;
//			}
//			if (count == 0) {
//				queue[tail] = value;
//				count++;
//				return true;
//			} else {
//				tail = (tail + 1) % queue.length;
//				queue[tail] = value;
//				count++;
//				return true;
//			}
//		}
//
//		/**
//		 * Delete an element from the circular queue. Return true if the operation is
//		 * successful.
//		 */
//		public boolean deQueue() {
//			if (count > 0) {
//				head = (head + 1) % queue.length;
//				count--;
//				return true;
//			} else {
//				return false;
//			}
//
//		}
//
//		/** Get the front item from the queue. */
//		public int Front() {
//			System.out.println(head + "        " + tail + "         " + count);
//			if (count == 0)
//				return -1;
//			else
//				return queue[head];
//		}
//
//		/** Get the last item from the queue. */
//		public int Rear() {
//			if (count == 0)
//				return -1;
//			else
//				return queue[tail];
//		}
//
//		/** Checks whether the circular queue is empty or not. */
//		public boolean isEmpty() {
//			if (count == 0)
//				return true;
//			else
//				return false;
//		}
//
//		/** Checks whether the circular queue is full or not. */
//		public boolean isFull() {
//			if (count == queue.length)
//				return true;
//			else
//				return false;
//		}
//	}
}
