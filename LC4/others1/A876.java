package others1;

public class A876 {
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; } }
	 */
	class Solution {
		public ListNode middleNode(ListNode head) {
			ListNode dummy = new ListNode();
			dummy.next = head;
			ListNode quick = dummy;
			ListNode slow = dummy;
			while (quick != null && quick.next != null) {
				quick = quick.next.next;
				slow = slow.next;
			}
			if (quick != null) {
				return slow.next;
			} else {
				return slow;
			}
		}
	}
}
