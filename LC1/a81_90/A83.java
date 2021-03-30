package a81_90;

import java.util.ArrayList;
import java.util.List;

public class A83 {
	public static ListNode deleteDuplicates(ListNode head) {
		List<Integer> list = new ArrayList<Integer>();
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		if (dummy.next != null) {
			list.add(dummy.next.val);
		} else {
			return head;
		}
		while (dummy.next.next != null) {
			if (list.contains(dummy.next.next.val)) {
				dummy.next.next = dummy.next.next.next;
			} else {
				list.add(dummy.next.next.val);
				dummy.next = dummy.next.next;
			}
		}
		return head;
	}
}
