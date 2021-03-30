package others7;

public class A704 {
	class Solution {

		// 基本上模板了
		public int search(int[] nums, int target) {
			int l = 0, r = nums.length - 1;
			int mid = l + (r - l) / 2;
			while (l < r) {
				// 里面这个是check();

				if (nums[mid] == target)
					return mid;
				if (nums[mid] < target) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
				mid = l + (r - l) / 2;
			}
			return -1;
		}
	}
}
