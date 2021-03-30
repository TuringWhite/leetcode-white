package a141_150;

import java.util.HashMap;
import java.util.Map;

public class A142 {
	/**
	 * Definition for singly-linked list.
	 */
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

    public ListNode detectCycle(ListNode head) {
    	ListNode listNode= head;
        Map<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        while(listNode != null) {
        	if(map.containsKey(listNode)) {
        		return listNode;
        	}else {
				map.put(listNode,1);
				listNode = listNode.next;
			}
        }
        return null;
    }
}
