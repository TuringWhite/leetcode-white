package others1;

public class A1290 {
	class Solution {
		public int getDecimalValue(ListNode head) {
			int num = 0;
			while (head != null) {
				num = (num << 1) + head.val;
				head = head.next;
			}
			return num;
		}
	}
}
