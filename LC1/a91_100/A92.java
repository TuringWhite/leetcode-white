package a91_100;

public class A92 {
	class Solution {
		public ListNode reverseBetween(ListNode head, int m, int n) {
			if (n == m)
				return head;
			ListNode pre, temp, left, right;
			ListNode dummy = new ListNode();
			dummy.next = head;
			left = dummy;
			pre = left;
			n = n - m;
			while (m > 0) {
				pre = left;
				left = left.next;
				m--;
			}
			right = left;
			while (n > 0) {
				right = right.next;
				n--;
			}
			while (left != right) {
				temp = left.next;
				left.next = right.next;
				right.next = left;
				left = temp;
			}
			pre.next = right;
			return dummy.next;
		}
	}
}
