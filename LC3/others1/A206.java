package others1;

import others1.ListNode;

public class A206 {
	public ListNode reverseList(ListNode head) {
		ListNode dummy = new ListNode(0);
		ListNode first = head;
		dummy.next = head;
		while (head!=null && head.next != null) {
			dummy.next = head.next;
			head.next = head.next.next;
			dummy.next.next = first;
			first = dummy.next;
		}
		return dummy.next;
	}
}
