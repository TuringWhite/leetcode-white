package a141_150;

import java.util.ArrayList;

import java.util.List;

public class A148 {
	class Solution {
		public ListNode sortList(ListNode head) {
			List<Integer> list = new ArrayList<Integer>();
			ListNode cur = head;
			while (cur != null) {
				list.add(cur.val);
				cur = cur.next;
			}
			list.sort(null);
			int i = 0;
			cur = head;
			while (cur != null) {
				cur.val = list.get(i++);
				cur = cur.next;
			}
			return head;
		}
	}
}
