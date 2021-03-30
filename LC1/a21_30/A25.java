package a21_30;

import java.util.ArrayList;
import java.util.List;

public class A25 {

//反转没写好的一个方法，过不了qwq	
	class Solution {
		public ListNode reverseKGroup(ListNode head, int k) {
			List<ListNode> list = new ArrayList<ListNode>();
			ListNode dummy = new ListNode();
			dummy.next = head;
			ListNode cur = dummy;
			while (cur.next != null) {
				for (int i = 0; i < k; i++) {
					if (cur.next != null)
						list.add(cur);
					else {
						break;
					}
					cur = cur.next;
				}
				help(list);
				list.clear();
			}
			return head;
		}

		public void help(List<ListNode> list) {
			int left = 0, right = list.size();
			while (left < right) {
				ListNode l = list.get(left);
				ListNode r = list.get(right);
				ListNode temp = r.next;
				r = l.next;
				l.next.next = temp;
			}
		}
	}
}
