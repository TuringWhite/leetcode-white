package others8;

import java.util.ArrayList;
import java.util.List;

public class A729 {
	class MyCalendar {
		List<Integer[]> list;

		public MyCalendar() {
			list = new ArrayList<Integer[]>();
		}

		public boolean book(int start, int end) {
			for (Integer[] arr : list) {
				if ((end <= arr[1] && end > arr[0]) || (start >= arr[0] && start < arr[1])
						|| (start <= arr[0] && end >= arr[1])) {
					return false;
				}
			}
			Integer[] temp = new Integer[2];
			temp[0] = new Integer(start);
			temp[1] = new Integer(end);
			list.add(temp);
			return true;
		}
	}

	/**
	 * Your MyCalendar object will be instantiated and called as such: MyCalendar
	 * obj = new MyCalendar(); boolean param_1 = obj.book(start,end);
	 */
}
