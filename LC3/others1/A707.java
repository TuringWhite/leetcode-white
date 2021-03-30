package others1;

import org.testng.annotations.Test;

public class A707 {
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtHead(1);
		linkedList.addAtTail(3);
		linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
		linkedList.printLinkedList();
		System.out.println(linkedList.get(1));          //返回2
		linkedList.deleteAtIndex(1);  //现在链表是1-> 3
		linkedList.printLinkedList();
		System.out.println(linkedList.get(1));          //返回3

	}
	
	@Test
	public void test3() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtHead(7);
		linkedList.deleteAtIndex(0);
	}
	

	@Test
	public void test1() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtHead(7);

		linkedList.addAtHead(2);
		linkedList.addAtHead(1);
		linkedList.printLinkedList();
		linkedList.addAtIndex(3, 0);
		linkedList.printLinkedList();
		linkedList.deleteAtIndex(2);
		linkedList.addAtHead(6);
		linkedList.addAtTail(4);
		System.out.println(linkedList.get(4));
		linkedList.addAtHead(5);
		linkedList.addAtIndex(5, 0);
		linkedList.addAtHead(6);
		linkedList.printLinkedList();
	}

	@Test
	public void test2() {
		//2  3
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtHead(1);

		linkedList.addAtTail(3);
		linkedList.addAtIndex(1, 2);
		linkedList.printLinkedList();
		System.out.println(linkedList.get(1));
		linkedList.deleteAtIndex(1);
		System.out.println(linkedList.get(1));
	}
}
