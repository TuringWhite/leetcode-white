package others3;

public class A494 {
	public int count = 0;

	public int findTargetSumWays(int[] nums, int S) {
		dfs(nums, 0, 0, S);
		return count;
	}

	public void dfs(int[] nums, int i, int sum, int S) {
		if (i == nums.length) {
			if (sum == S)
				count++;
		} else {
			dfs(nums, i + 1, sum + nums[i], S);
			dfs(nums, i + 1, sum - nums[i], S);
		}
	}
	// bfs，会超时
//	public int findTargetSumWays(int[] nums, int S) {
//		Queue<Integer> queue = new LinkedList<Integer>();
//		queue.add(nums[0]);
//		queue.add(0 - nums[0]);
//		queue.add(null);
//		int i = 1;
//		while (!queue.isEmpty() && i < nums.length) {
//
//			if (null == queue.peek()) {
//				queue.poll();
//				i++;
//				queue.add(null);
//			} else {
//				int sum = queue.poll();
//				queue.add(sum + nums[i]);
//				queue.add(sum - nums[i]);
//			}
//
//		}
//		int count = 0;
//		while (!queue.isEmpty()) {
//			if (queue.size() == 1)
//				queue.poll();
//			else if (queue.poll() == S)
//				count++;
//		}
//		queue.clear();
//		return count;
//	}
}
