package a151_160;

import java.util.HashMap;
import java.util.Map;

public class A160 {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Map<ListNode, String> map = new HashMap<ListNode, String>();
		ListNode aListNode = headA;
		ListNode bListNode = headB;
		while (aListNode != null) {
			map.put(aListNode, "");
			aListNode = aListNode.next;
		}
		while (bListNode != null) {
			if (map.containsKey(bListNode)) {
				return bListNode;
			} else {
				map.put(bListNode, "");
				bListNode = bListNode.next;
			}
		}
		return null;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}