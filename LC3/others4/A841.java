package others4;

import java.util.List;
import java.util.Stack;

public class A841 {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		int[] helper = new int[rooms.size()];
		helper[0] = 1;
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> child = rooms.get(0);
		int pop;
		for (Integer integer : child) {
			stack.add(integer);
		}
		while (!stack.isEmpty()) {
			pop = stack.pop();
			if (helper[pop] == 0) {
				helper[pop] = 1;
				child = rooms.get(pop);
				for (Integer integer : child) {
					if (helper[integer] == 0)
						stack.add(integer);
				}
			}
		}
		for (int i = 0; i < helper.length; i++) {
			if (helper[i] == 0)
				return false;
		}
		return true;
	}
}
