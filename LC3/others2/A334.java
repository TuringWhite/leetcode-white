package others2;

public class A334 {

	// [5,1,5,5,2,5,4]
	// [1,1,-2,6]
	public boolean increasingTriplet(int[] nums) {
		if (nums.length < 2)
			return false;
		int small = Integer.MAX_VALUE;
		int mid = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= small) {
				small = nums[i];
			} else if (nums[i] <= mid) {
				mid = nums[i];
			} else if (nums[i] > mid) {
				return true;
			}
		}
		return false;
	}
}
