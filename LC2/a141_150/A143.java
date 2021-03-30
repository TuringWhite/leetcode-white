package a141_150;

import java.util.ArrayList;
import java.util.List;

public class A143 {
	class Solution {
		public void reorderList(ListNode head) {
			if (head == null)
				return;
			ListNode cur = head;
			List<ListNode> list = new ArrayList<ListNode>();
			while (cur != null) {
				list.add(cur);
				cur = cur.next;
			}
			ListNode dummy = new ListNode();
			ListNode result = dummy;
			int left = 1, right = list.size() - 1;
			while (left < right) {
				dummy.next = list.get(right--);
				dummy = dummy.next;
				dummy.next = list.get(left++);
				dummy = dummy.next;
			}
			if (left == right) {
				dummy.next = list.get(left);
				dummy = dummy.next;
			}
			dummy.next = null;
			head.next = result.next;
		}
	}
}
