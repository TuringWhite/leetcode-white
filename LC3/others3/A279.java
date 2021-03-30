package others3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class A279 {
	class Solution {
		public int numSquares(int n) {
			if (n <= 1)
				return 1;
			List<Integer> list = new ArrayList<Integer>();
			int i = 1;
			while (i * i <= n) {
				list.add(i * i);
				i++;
			}
			int storey = 0;
			int count = 1;
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(n);
			while (count > 0) {
				storey++;
				int m = 0;
				for (; count > 0; count--) {
					int temp = queue.poll();
					for (int j : list) {
						if (temp > j) {
							queue.add(temp - j);
							m++;
						} else if (temp == j) {
							return storey;
						}
					}
				}
				count = m;
			}
			return -1;
		}
	}
}
