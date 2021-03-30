package others1;

public class A019 {
	class Solution {

		// 一个理解错题意的单调队列
//		public int[] nextLargerNodes(ListNode head) {
//			Queue<Integer> queue = new LinkedList<Integer>();
//			int length = 0;
//			Queue<Integer> help = new LinkedList<Integer>();
//			while (head != null) {
//				length++;
//				queue.add(head.val);
//				if (help.isEmpty()) {
//					help.offer(head.val);
//				} else if (head.val < help.peek()) {
//					help.offer(head.val);
//				} else if (head.val > help.peek()) {
//					while (!help.isEmpty() && head.val > help.peek()) {
//						help.poll();
//					}
//					help.offer(head.val);
//				}
//				head = head.next;
//			}
//			int[] result = new int[length];
//			for (int i = 0; i < result.length; i++) {
//				int cur = queue.poll();
//				if (help.isEmpty()) {
//					result[i] = 0;
//				} else if (cur < help.peek()) {
//					result[i] = help.peek();
//				} else {
//					help.poll();
//					if (!help.isEmpty() && help.peek() > cur) {
//						result[i] = help.peek();
//					}
//				}
//			}
//			return result;
//		}
	}
}
