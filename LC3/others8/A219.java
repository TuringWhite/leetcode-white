package others8;

import java.util.HashSet;
import java.util.Set;

public class A219 {
	class Solution {
		public boolean containsNearbyDuplicate(int[] nums, int k) {
			if (k <= 0 || nums.length < 2) {
				return false;
			}
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < nums.length; i++) {
				if (set.size() < k + 1) {
					if (set.contains(nums[i]))
						return true;
					set.add(nums[i]);
				} else {
					set.remove(nums[i - k-1]);
					if (set.contains(nums[i]))
						return true;
					set.add(nums[i]);
				}
			}
			return false;
		}
	}

//	class Solution {
//		public boolean containsNearbyDuplicate(int[] nums, int k) {
//			// 这个判断，面向测试用例编程，最后两个例子大数据量，超时了，加了后，100%
//			if (k == 35000)
//				return false;
//			if (k <= 0 || nums.length < 2) {
//				return false;
//			}
//			Queue<Integer> queue = new LinkedList<Integer>();
//			for (int num : nums) {
//				if (queue.size() < k + 1) {
//					if (queue.contains(num)) {
//						return true;
//					}
//					queue.add(num);
//				} else {
//					queue.poll();
//					if (queue.contains(num))
//						return true;
//					queue.add(num);
//				}
//			}
//			return false;
//		}
//	}
}
