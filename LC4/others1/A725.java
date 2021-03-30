package others1;

public class A725 {
	class Solution {
		public ListNode[] splitListToParts(ListNode root, int k) {
			ListNode[] arr = new ListNode[k];
			int i = 0;
			int quotient, remainder;
			ListNode cur = root;
			ListNode pre, tail = null;
			int length = 0;
			while (cur != null) {
				length++;
				cur = cur.next;
			}
			if (length <= k) {
				cur = root;
				while (cur != null) {
					pre = cur;
					cur = cur.next;
					pre.next = null;
					arr[i++] = pre;
				}
				while (i < k) {
					arr[i++] = null;
				}
			} else {
				quotient = length / k;
				remainder = length % k;
				cur = root;
				int childlength;
				while (cur != null) {
					pre = cur;
					childlength = 0;
					while (childlength < quotient) {
						tail = cur;
						cur = cur.next;
						childlength++;
					}
					if (remainder > 0) {
						tail = cur;
						cur = cur.next;
						remainder--;
					}
					tail.next = null;
					printchild(pre);
					arr[i++] = pre;
				}
			}

			return arr;
		}

		public void printchild(ListNode cur) {
			System.out.println("这是一段");
			while (cur != null) {
				System.out.print(cur.val);
				cur = cur.next;
			}
			System.out.println();
		}
	}
}
