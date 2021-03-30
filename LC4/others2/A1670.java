package others2;

import java.util.ArrayList;
import java.util.List;

public class A1670 {
	class FrontMiddleBackQueue {
		List<Integer> list;

		public FrontMiddleBackQueue() {
			list = new ArrayList<>();
		}

		public void pushFront(int val) {
			list.add(0, val);
		}

		public void pushMiddle(int val) {
			list.add(list.size() / 2, val);
			for (int num : list) {
				System.out.println(num);
			}
		}

		public void pushBack(int val) {
			list.add(list.size(), val);
		}

		public int popFront() {
			return list.isEmpty() ? -1 : list.remove(0);
		}

		public int popMiddle() {
			return list.isEmpty() ? -1 : list.remove(list.size() / 2 + list.size() % 2 - 1);
		}

		public int popBack() {
			return list.isEmpty() ? -1 : list.remove(list.size() - 1);
		}
	}
}
