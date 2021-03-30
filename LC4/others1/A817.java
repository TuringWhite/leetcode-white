package others1;

import java.util.HashSet;
import java.util.Set;

public class A817 {
	class Solution {
		public int numComponents(ListNode head, int[] G) {
			int result = 0;
			Set<Integer> set = new HashSet<>();
			for (int num : G) {
				set.add(num);
			}
			while (head != null) {
				if (set.contains(head.val)) {
					result++;
					while (head != null && set.contains(head.val)) {
						set.remove(head.val);
						head = head.next;
					}
				} else {
					head = head.next;
				}
			}
			return result;
		}
	}
}
