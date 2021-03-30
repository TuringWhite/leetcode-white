package a171_180;

public class A621 {
	class Solution {

		// 一个没写完的模拟算法，优先放数量最大的任务，用set来记录队列里有什么【减少遍历时间，当然也可以每次遍历一遍整个的链表】，用链表记录时间，如果等待一个时间，什么也不做，就可以放一个'0'
//		public int leastInterval(char[] tasks, int n) {
//			Queue<Character> queue = new LinkedList<>();
//			Set<Character> set = new HashSet<>();
//			int time = 0;
//			Map<Character, Integer> map = new HashMap<Character, Integer>();
//			for (char task : tasks) {
//				if (map.containsKey(task)) {
//					map.replace(task, map.get(task) + 1);
//				} else {
//					map.put(task, 1);
//				}
//			}
//			Set<Character> keys = map.keySet();
//			while (!keys.isEmpty()) {
//
//			}
//		}
	}
}
