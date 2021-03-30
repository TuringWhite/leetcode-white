package a131_140;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	public void printLinkedList() {
		ListNode listNode = this;
		while (listNode != null) {
			System.out.print(listNode.val + "  ");
			listNode = listNode.next;
		}
		System.out.println();
	}

	public static void printLinkedList(ListNode head) {
		ListNode listNode = head;
		while (listNode != null) {
			System.out.print(listNode.val + "  ");
			listNode = listNode.next;
		}
		System.out.println();
	}
}

class MyLinkedList {
	int size;
	ListNode head; // sentinel node as pseudo-head

	public MyLinkedList() {
		size = 0;
		head = new ListNode(0);
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		// if index is invalid
		if (index < 0 || index >= size)
			return -1;

		ListNode curr = head;
		// index steps needed
		// to move from sentinel node to wanted index
		for (int i = 0; i < index + 1; ++i)
			curr = curr.next;
		return curr.val;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		addAtIndex(0, val);
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		addAtIndex(size, val);
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		// If index is greater than the length,
		// the node will not be inserted.
		if (index > size)
			return;

		// [so weird] If index is negative,
		// the node will be inserted at the head of the list.
		if (index < 0)
			index = 0;

		++size;
		// find predecessor of the node to be added
		ListNode pred = head;
		for (int i = 0; i < index; ++i)
			pred = pred.next;

		// node to be added
		ListNode toAdd = new ListNode(val);
		// insertion itself
		toAdd.next = pred.next;
		pred.next = toAdd;
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		// if the index is invalid, do nothing
		if (index < 0 || index >= size)
			return;

		size--;
		// find predecessor of the node to be deleted
		ListNode pred = head;
		for (int i = 0; i < index; ++i)
			pred = pred.next;

		// delete pred.next
		pred.next = pred.next.next;
	}

	public void printLinkedList() {
		ListNode listNode = head;
		while (listNode != null) {
			System.out.print(listNode.val + "  ");
			listNode = listNode.next;
		}
		System.out.println();
	}

	public static void printLinkedList(ListNode head) {
		ListNode listNode = head;
		while (listNode != null) {
			System.out.print(listNode.val + "  ");
			listNode = listNode.next;
		}
		System.out.println();
	}
}

/*
 * 第一遍我自己写的，还有问题
 * 
 */
//
//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode(int x) {
//		val = x;
//	}
//}
//
//class MyLinkedList {
//	int size;
//	ListNode head; // sentinel node as pseudo-head
//
//	/** Initialize your data structure here. */
//	public MyLinkedList() {
//		size = 0;
//	}
//
//	/**
//	 * Get the value of the index-th node in the linked list. If the index is
//	 * invalid, return -1.
//	 */
//	public int get(int index) {
//		ListNode listNode = head;
//		for (int i = 0; i < index; i++) {
//			if (listNode == null) {
//				return -1;
//			}
//			listNode = head.next;
//		}
//		return listNode.val;
//	}
//
//	/**
//	 * Add a node of value val before the first element of the linked list. After
//	 * the insertion, the new node will be the first node of the linked list.
//	 */
//	public void addAtHead(int val) {
//		ListNode listNode = new ListNode(val);
//		listNode.next = head;
//		head = listNode;
//	}
//
//	/** Append a node of value val to the last element of the linked list. */
//	public void addAtTail(int val) {
//		ListNode listNode = new ListNode(val);
//		ListNode temp = head;
//		while (temp.next != null) {
//			temp = temp.next;
//		}
//		temp.next = listNode;
//	}
//
//	/**
//	 * Add a node of value val before the index-th node in the linked list. If index
//	 * equals to the length of linked list, the node will be appended to the end of
//	 * linked list. If index is greater than the length, the node will not be
//	 * inserted.
//	 */
//	public void addAtIndex(int index, int val) {
//		ListNode listNode = new ListNode(val);
//		ListNode temp = head;
//		for (int i = 0; i < index - 1; i++) {
//			temp = temp.next;
//		}
//		listNode.next = temp.next;
//		temp.next = listNode;
//	}
//
//	/** Delete the index-th node in the linked list, if the index is valid. */
//	public void deleteAtIndex(int index) {
//		ListNode temp = head;
//		for (int i = 0; i < index - 1; i++) {
//			temp = temp.next;
//		}
//		if (temp.next == null) {
//			head = null;
//		} else {
//			temp.next = temp.next.next;
//		}
//
//	}
//
//	/*
//	 * 打印链表
//	 */
//	public void printLinkedList() {
//		ListNode listNode = head;
//		while (listNode != null) {
//			System.out.print(listNode.val + "  ");
//			listNode = listNode.next;
//		}
//		System.out.println();
//	}
//}
