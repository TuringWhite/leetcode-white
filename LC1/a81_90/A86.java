package a81_90;

public class A86 {
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; } }
	 */
	class Solution {
		public ListNode partition(ListNode head, int x) {
			ListNode dummy = new ListNode(0);
			ListNode another = new ListNode(0);
			dummy.next = head;
			ListNode cur = dummy;
			ListNode acur = another;
			while (cur.next != null) {
				if (cur.next.val >= x) {
					acur.next = cur.next;
					acur = acur.next;
					cur.next = cur.next.next;
				} else {
					cur = cur.next;
				}
			}
			cur.next = another.next;
			acur.next = null;
			return dummy.next;
		}
	}

	// class Solution {
//
//		// 链表重构
//		public ListNode partition(ListNode head, int x) {
//			ListNode dummy = new ListNode(0);
//			dummy.next = head;
//			ListNode cur, second, another;
//			cur = dummy;
//			another = new ListNode(0);
//			second = another;
//			while (cur.next != null) {
//				if (cur.next.val >= x) {
//					second.next = cur.next;
//					second = second.next;
//					cur.next = cur.next.next;
//				}else {
//					cur = cur.next;
//				}
//			
//			}
//			cur.next = another.next;
//			second.next = null;
//			return dummy.next;
//		}
//	}
}
