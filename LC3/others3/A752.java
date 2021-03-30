package others3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class A752 {
	public static void main(String[] args) {
		String[] deadends = { "0201", "0101", "0102", "1212", "2002" };
		openLock(deadends, "0202");

	}

	// 有bug，题干给的用例有跑不通的。
	public static int openLock(String[] deadends, String target) {
		if (target.equals("0000"))
			return 0;
		int count = 0;
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < deadends.length; i++) {
			set.add(deadends[i]);
		}

		Set<String> seen = new HashSet<String>();

		Queue<String> queue = new LinkedList<String>();
		queue.offer("0000");
		queue.offer(null);
		if (set.contains("0000"))
			return -1;

		while (!queue.isEmpty()) {
			String temp = queue.poll();
//			System.out.println(temp);
			if (temp == null) {
				count++;
				if (queue.peek() != null)
					queue.offer(null);
			} else if (temp.equals(target)) {
				return count;
			} else {
				for (int i = 0; i < 4; i++) {
					int dig = (temp.charAt(i) - '0' + 1) % 10;
					String put1 = temp.substring(0, i) + dig + temp.substring(i + 1);
//					System.out.println("put1        " + put1);
					if (!seen.contains(put1) && !set.contains(put1)) {
						seen.add(put1);
						queue.offer(put1);
					}
					dig = (dig + 8) % 10;
					put1 = temp.substring(0, i) + dig + temp.substring(i + 1);
					if (!seen.contains(put1) && !set.contains(put1)) {
						seen.add(put1);
						queue.offer(put1);

					}
				}
			}
		}
		return -1;
	}
}
