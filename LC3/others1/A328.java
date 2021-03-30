package others1;

import org.testng.annotations.Test;

public class A328 {

	public static void main(String[] args) {
		ListNode l5 = new ListNode(5);
		ListNode l4 = new ListNode(4, l5);
		ListNode l3 = new ListNode(3, l4);
		ListNode l2 = new ListNode(2, l3);
		ListNode l1 = new ListNode(1, l2);
		printLinkedList(oddEvenList(l1));
	}

	@Test
	public void test1() {
		ListNode l7 = new ListNode(7);
		ListNode l6 = new ListNode(4, l7);
		ListNode l5 = new ListNode(6, l6);
		ListNode l4 = new ListNode(5, l5);
		ListNode l3 = new ListNode(3, l4);
		ListNode l2 = new ListNode(1, l3);
		ListNode l1 = new ListNode(2, l2);
		printLinkedList(oddEvenList(l1));
	}

	@Test
	public void test2() {
		ListNode l8 = new ListNode(8);
		ListNode l7 = new ListNode(7, l8);
		ListNode l6 = new ListNode(6, l7);
		ListNode l5 = new ListNode(5, l6);
		ListNode l4 = new ListNode(4, l5);
		ListNode l3 = new ListNode(3, l4);
		ListNode l2 = new ListNode(2, l3);
		ListNode l1 = new ListNode(1, l2);
		printLinkedList(oddEvenList(l1));
	}
	
	@Test
	public void test3() {
		ListNode l1  = null;
		printLinkedList(oddEvenList(l1));
	}

	public static void printLinkedList(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		while (dummy.next != null) {
			System.out.print(dummy.next.val + " ");
			dummy.next = dummy.next.next;
		}
		System.out.println();
	}

	public static ListNode oddEvenList(ListNode head) {
		ListNode oddhead = new ListNode(0);
		ListNode oddtail = new ListNode(0);
		ListNode evenhead = new ListNode(0);
		ListNode eventail = new ListNode(0);
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		int oddoreven = 1;
		if(dummy.next ==null) {
			return head;
		}
		if (dummy.next != null) {
			oddhead.next = dummy.next;
			dummy.next = dummy.next.next;
			oddtail.next = oddhead.next;
		}
		if (dummy.next != null) {
			evenhead.next = dummy.next;
			dummy.next = dummy.next.next;
			eventail.next = evenhead.next;
		}

		while (dummy.next != null) {
			if (oddoreven == 1) {
				oddtail.next.next = dummy.next;
				dummy.next = dummy.next.next;
				oddtail.next = oddtail.next.next;
				oddoreven = 0;
			} else if (oddoreven == 0) {
				eventail.next.next = dummy.next;
				dummy.next = dummy.next.next;
				eventail.next = eventail.next.next;
				oddoreven = 1;
			}
		}
//		这里改一下，最后多出来一个节点，特殊处理一下a 
		if (oddoreven == 1) {
			oddtail.next.next = dummy.next;
//			oddtail.next = oddtail.next.next;
			oddoreven = 0;
		} else if (oddoreven == 0) {
			eventail.next.next = dummy.next;
			eventail.next = eventail.next.next;
			oddoreven = 1;
		}
//		printLinkedList(oddhead);
//		System.out.println(oddtail.next.val);
//		printLinkedList(evenhead);
		oddtail.next.next = evenhead.next;
		return oddhead.next;
	}

}
