package others10;

import java.util.LinkedList;
import java.util.Queue;

public class A346 {
	class MovingAverage {
		Queue<Integer> queue;
		int sum;
		int size;

		/** Initialize your data structure here. */
		public MovingAverage(int size) {
			queue = new LinkedList<Integer>();
			sum = 0;
			this.size = size;
		}

		public double next(int val) {
			if (queue.size() < size) {
				sum += val;
				queue.add(val);
			} else {
				sum -= queue.poll();
				queue.add(val);
				sum+=val;
			}
			return (double)sum / queue.size();
		}
	}

	/**
	 * Your MovingAverage object will be instantiated and called as such:
	 * MovingAverage obj = new MovingAverage(size); double param_1 = obj.next(val);
	 */
}
