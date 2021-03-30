package others1;

public class A203 {
	public static ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0);

		ListNode former = new ListNode(0);
		while (head != null && head.val == val) {
			former.next = head;
			head = head.next;
		}
		dummy.next = head;
		while (dummy.next != null) {
			if (dummy.next.val == val) {
				former.next.next = former.next.next.next;
				dummy.next = dummy.next.next;
			} else {
				former.next = dummy.next;
				dummy.next = dummy.next.next;
			}
		}
		return head;
	}
}
