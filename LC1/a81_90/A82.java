package a81_90;

import java.util.ArrayList;
import java.util.List;

public class A82 {
	public static void main(String[] args) {

	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		List<Integer> need = new ArrayList<Integer>();
		List<Integer> had = new ArrayList<Integer>();
		ListNode dummy = new ListNode(0);
		ListNode last = new ListNode(0);
		dummy.next = head;
		last.next = head;
		while (dummy.next != null) {
			if (!had.contains(dummy.next.val)) {
				had.add(dummy.next.val);
			} else {
				need.add(dummy.next.val);
			}
			dummy.next = dummy.next.next;
		}
		dummy.next = head;
		while (dummy.next.next != null) {
			if (need.contains(dummy.next.val)) {
				last.next.next = dummy.next.next;
//				last.next = dummy.next;
				dummy.next = dummy.next.next;
			} else {
				last.next = dummy.next;
				dummy.next = dummy.next.next;
			}
		}
		if (need.contains(dummy.next.val)) {
			last.next.next = null;
		}
		if (need.contains(head.val)) {
			head = head.next;
		}
		return head;
	}
}
