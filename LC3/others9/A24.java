package others9;

public class A24 {
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */
	class Solution {
		public ListNode swapPairs(ListNode head) {
			ListNode dummy = new ListNode();
			dummy.next = head;
			ListNode cur = dummy;
			while (cur != null && cur.next != null && cur.next.next != null) {
				ListNode temp = cur.next.next;
				cur.next.next = temp.next;
				temp.next = cur.next;
				cur.next = temp;
				cur = cur.next.next;
			}
			return dummy.next;
		}
	}
}
