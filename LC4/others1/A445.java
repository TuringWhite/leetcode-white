package others1;

import java.math.BigInteger;

public class A445 {
	class Solution {

//		对于逆序处理应该首先想到栈，这个思路才是比较正确的，省去了逆序操作，节省了不少时间

		// 大数类，加修改原链表
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			StringBuffer num1 = new StringBuffer(), num2 = new StringBuffer();
			ListNode cur = l1;
			while (cur != null) {
				num1.append(cur.val);
				cur = cur.next;
			}
			cur = l2;
			while (cur != null) {
				num2.append(cur.val);
				cur = cur.next;
			}
			BigInteger bigInteger1 = new BigInteger(num1.toString());
			BigInteger bigInteger2 = new BigInteger(num2.toString());
			bigInteger1 = bigInteger1.add(bigInteger2);
			System.out.println(bigInteger1.toString());
			char[] arr = bigInteger1.toString().toCharArray();
			if (num1.length() > num2.length()) {
				cur = l1;
			} else {
				cur = l2;
			}
			if (arr.length > Math.max(num1.length(), num2.length())) {
				ListNode hair = new ListNode(0);
				hair.next = cur;
				cur = hair;
			}
			ListNode result = cur;
			for (char ch : arr) {
				cur.val = ch - '0';
				cur = cur.next;
			}
			return result;
		}
	}
}
