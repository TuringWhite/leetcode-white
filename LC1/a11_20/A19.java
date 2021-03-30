package a11_20;

public class A19 {
	
	//官方解
	public ListNode removeNthFromEnd(ListNode head, int n) {
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode first = dummy;
	    ListNode second = dummy;
	    // Advances first pointer so that the gap between first and second is n nodes apart
	    for (int i = 1; i <= n + 1; i++) {
	        first = first.next;
	    }
	    // Move first to the end, maintaining the gap
	    while (first != null) {
	        first = first.next;
	        second = second.next;
	    }
	    second.next = second.next.next;
	    return dummy.next;
	}
	
	
	
	
//	/* 我的代码这个用例跑不通，有问题XD
//	 * [1,2]
//	 * 2
//	 * 1
//	 */
//	public static ListNode removeNthFromEnd(ListNode head, int n) {
//		ListNode first = head;
//		ListNode second = head;
//		for (int i = 0; i < n; i++) {
//			first = first.next;
//		}
//		while (first != null && first.next != null) {
//			first = first.next;
//			second = second.next;
//		}
//
//		if (second.next != null) {
//			second.next = second.next.next;
//		} else if (second.next == null && head == second) {
//			head = null;
//		}
//		return head;
//	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
