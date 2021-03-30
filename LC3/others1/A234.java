package others1;

import java.util.Stack;

import org.testng.annotations.Test;

public class A234 {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		System.out.println(isPalindrome(l1));
	}
	
	@Test
	public void test1() {
		ListNode l2 = new ListNode(-129);
		ListNode l1 = new ListNode(-129,l2);
		System.out.println(isPalindrome(l1));
	}
	
	public static boolean isPalindrome(ListNode head) {
		Stack<Integer> stack =new  Stack<>();
		Stack<Integer> later =new  Stack<>();
		if(head == null) {
			return true;
		}
		int length =0;
		while (head!=null) {
			stack.add(head.val);
			head = head.next;
			length++;
		}
//		System.out.println(length);
		for(int i = 0;i<length/2;i++) {
			later.add(stack.pop());
		}
//		System.out.println(stack.size());
//		System.out.println(later.size());
		if(length%2 == 1)
			stack.pop();
//		System.out.println(stack.size());
//		System.out.println(later.size());
		while (!stack.isEmpty()) {
			if((int)stack.pop()!=(int)later.pop()) {
				return false;
			}
		}
		return true;
    }
}
