package a131_140;

public class A138 {

	// Definition for a Node.
	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	public Node copyRandomList(Node head) {
		Node dummy = new Node(0);
		dummy.next = head;
		Node another = new Node(0);
		Node dummy2 = new Node(0);
		if (head == null) {
			return another = null;
		}
		if (dummy.next != null) {
			another.val = dummy.next.val;
			dummy2.next = another;
			dummy.next = dummy.next.next;
		}
		while (dummy.next != null) {
			Node node = new Node(dummy.next.val);
			dummy2.next.next = node;
			dummy2.next = dummy.next.next;
			dummy.next = dummy.next.next;
		}
		
		return another;
	}
}
