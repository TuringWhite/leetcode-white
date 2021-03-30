package others1;

public class A1669 {
	class Solution {
		public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
			ListNode dummy = new ListNode();
			dummy.next = list1;
			ListNode cur = dummy;
			b = b - a;
			while (a > 0) {
				cur = cur.next;
				a--;
			}
			ListNode pre = cur;
			while (b > 0) {
				cur = cur.next;
				b--;
			}
			cur = cur.next;
			pre.next = list2;
			while (pre.next != null) {
				pre = pre.next;
			}
			pre.next = cur.next;
			return dummy.next;
		}
	}
}
