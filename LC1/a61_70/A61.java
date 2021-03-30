package a61_70;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class A61 {

	public static void main(String[] args) {
		ListNode l5 = new ListNode(5);
		ListNode l4 = new ListNode(4, l5);
		ListNode l3 = new ListNode(3, l4);
		ListNode l2 = new ListNode(2, l3);
		ListNode l1 = new ListNode(1, l2);
		rotateRight(l1, 2);
	}

	@Test
	public void test1() {
		ListNode l1 = new ListNode(1);
		rotateRight(l1, 2);
	}

	@Test
	public void test2() {
		ListNode l1 = null;
		rotateRight(l1, 1);
	}

	public static ListNode rotateRight(ListNode head, int k) {
		ListNode dummy = new ListNode(0, head);
		List<Integer> integers = new ArrayList<Integer>();
		while (dummy.next != null) {
			integers.add(dummy.next.val);
			dummy.next = dummy.next.next;
		}
		int length = integers.size();
		if (length == 0||k ==0) {
			return head;
		}
		k = k % length;
		dummy.next = head;
		for (int i = length - k; i < length; i++) {
			dummy.next.val = integers.get(i);
			dummy.next = dummy.next.next;
		}
		for (int i = 0; i < length - k; i++) {
			dummy.next.val = integers.get(i);
			dummy.next = dummy.next.next;
		}
//		System.out.println(length);
//		head.printLinkedList();
		return head;
	}
}
