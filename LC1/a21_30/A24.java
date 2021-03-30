package a21_30;

public class A24 {

	public static void main(String[] args) {
		ListNode l5 = new ListNode(5);
		ListNode l4 = new ListNode(4,l5);
		ListNode l3 = new ListNode(3,l4);
		ListNode l2 = new ListNode(2,l3);
		ListNode l1 = new ListNode(1,l2);
		swapPairs(l1);
	}

	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0, head);
		ListNode second = new ListNode(0);
		head = head.next;
		second.next = dummy.next.next;
		dummy.next.next = second.next.next;
		second.next.next = dummy.next;
		while (dummy.next.next != null && dummy.next.next.next != null) {
			second.next = dummy.next.next.next;
			dummy.next.next.next = second.next.next;
			second.next.next = dummy.next.next;
			dummy.next.next = second.next;
			dummy.next = dummy.next.next.next;
//			System.out.println(dummy.next.val);
		}
//		dummy = head;
//		while (head!=null) {
//			System.out.print(head.val + " ");
//			head = head.next;
//		}
//		System.out.println();
		return head;
	}
}
