package others9;

public class A206 {

	class Solution {
		public ListNode reverseList(ListNode head) {
			ListNode dummy = new ListNode();
			ListNode cur = head;
			ListNode next;
			while (cur != null) {
				next = cur.next;
				cur.next = dummy.next;
				dummy.next = cur;
				cur = next;
			}
			return dummy.next;
		}
	}
}
