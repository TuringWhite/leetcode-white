package a81_90;

//Definition for singly-linked list.
public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	ListNode(int x, ListNode listNode) {
		val = x;
		this.next = listNode;
	}
}
