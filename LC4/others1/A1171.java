package others1;

public class A1171 {
	class Solution {

		// 这题可以暴力就很离谱
//		public ListNode removeZeroSumSublists(ListNode head) {
//			
//		}

	}
}

class Solution {
	public ListNode removeZeroSumSublists(ListNode head) {
		ListNode p = new ListNode(0);
		ListNode pre = p;
		p.next = head;
		while (p != null) {
			ListNode cur = p.next;
			int sum = 0;
			while (cur != null) {
				sum += cur.val;
				cur = cur.next;
				if (sum == 0) {
					p.next = cur;
					break;
				}
			}
			if (cur == null)
				p = p.next;
		}
		return pre.next;
	}
}