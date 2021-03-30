package a1_10;

public class A2 {

	public static void main(String[] args) {
		ListNode l3 = new ListNode(3);
		ListNode l2 = new ListNode(4, l3);
		ListNode l1 = new ListNode(2, l2);
		ListNode l6 = new ListNode(4);
		ListNode l5 = new ListNode(6, l6);
		ListNode l4 = new ListNode(5, l5);
		addTwoNumbers(l1, l4);

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode dummy1 = new ListNode(0);
		dummy1.next = l1;
		ListNode dummy2 = new ListNode(0);
		dummy2.next = l2;
		int carry = 0;
		while (dummy1.next.next != null && dummy2.next.next != null) {
			dummy1.next.val = dummy1.next.val + dummy2.next.val + carry;
			carry = dummy1.next.val / 10;
			dummy1.next.val = dummy1.next.val % 10;
			dummy1.next = dummy1.next.next;
			dummy2.next = dummy2.next.next;
		}
		if(dummy1.next.next==null&&dummy2.next.next==null) {
			dummy1.next.val = dummy1.next.val + dummy2.next.val + carry;
			carry = dummy1.next.val / 10;
			dummy1.next.val = dummy1.next.val % 10;
			if (carry == 1) {
				ListNode last= new ListNode(carry);
				dummy1.next.next=last;
			}
		}else if (dummy1.next.next == null) {
			dummy1.next.val = dummy1.next.val + dummy2.next.val + carry;
			carry = dummy1.next.val / 10;
			dummy1.next.val = dummy1.next.val % 10;
			dummy1.next.next = dummy2.next.next;
			dummy1.next = dummy1.next.next;
			while (dummy1.next.next != null) {
				dummy1.next.val = dummy1.next.val + carry;
				carry = dummy1.next.val / 10;
				dummy1.next.val = dummy1.next.val % 10;
				dummy1.next = dummy1.next.next;
				if(carry==0)
					return l1;
			}
			if (carry == 1) {
				dummy1.next.val = dummy1.next.val + carry;
				carry = dummy1.next.val / 10;
				dummy1.next.val = dummy1.next.val % 10;
			}
			if (carry == 1) {
				ListNode last= new ListNode(carry);
				dummy1.next.next=last;
			}
		}else if(dummy2.next.next ==null){
			dummy1.next.val = dummy1.next.val + dummy2.next.val + carry;
			carry = dummy1.next.val / 10;
			dummy1.next.val = dummy1.next.val % 10;
			dummy1.next = dummy1.next.next;
			while (dummy1.next.next != null) {
				dummy1.next.val = dummy1.next.val + carry;
				carry = dummy1.next.val / 10;
				dummy1.next.val = dummy1.next.val % 10;
				dummy1.next = dummy1.next.next;
				if(carry==0)
					return l1;
			}
			if (carry == 1) {
				dummy1.next.val = dummy1.next.val + carry;
				carry = dummy1.next.val / 10;
				dummy1.next.val = dummy1.next.val % 10;
			}
			if (carry == 1) {
				ListNode last= new ListNode(carry);
				dummy1.next.next=last;
			}
		}
		return l1;
	}

//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		StringBuffer s1 = new StringBuffer();
//		StringBuffer s2 = new StringBuffer();
//		while (l1 != null) {
//			s1.append(l1.val);
//			l1 = l1.next;
//		}
//		while (l2 != null) {
//			s2.append(l2.val);
//			l2 = l2.next;
//		}
////    	int num1 = Integer.parseInt(s1.reverse().toString()) ;
////    	int num2 = Integer.parseInt(s2.reverse().toString()) ;
//		int sum = Integer.parseInt(s1.reverse().toString()) + Integer.parseInt(s2.reverse().toString());
//		ListNode dummy = new ListNode(0);
//		ListNode firstNode = new ListNode(sum % 10);
//		sum = sum / 10;
//		dummy.next = firstNode;
//		while (sum != 0) {
//			ListNode listNode = new ListNode(sum % 10);
//			dummy.next.next = listNode;
//			dummy.next = dummy.next.next;
//			sum = sum / 10;
//		}
////		ListNode listNode = firstNode;
////		while (listNode != null) {
////			System.out.print(listNode.val + "  ");
////			listNode = listNode.next;
////		}
////		System.out.println();
//		return firstNode;
//	}
}
