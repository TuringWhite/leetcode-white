package others8;

public class A287 {

	class Solution {
		public int findDuplicate(int[] nums) {
			int slow = 0, fast = 0;
			do {
				slow = nums[slow];
				fast = nums[nums[fast]];
			} while (slow != fast);
			slow = 0;
			// slow直接指向了链表起始节点，fast依然在环里
			while (slow != fast) {
				slow = nums[slow];
				fast = nums[fast];
			}
			return slow;
		}
	}

}
