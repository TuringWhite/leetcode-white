package others6;

public class A303 {
	class NumArray {
		int[] numArr;

		public NumArray(int[] nums) {
			numArr = nums;
			for (int i = 1; i < numArr.length; i++) {
				numArr[i] += nums[i - 1];
			}
		}

		public int sumRange(int i, int j) {
			if (i == 0)
				return numArr[j];
			return numArr[j] - numArr[i-1];
		}
	}

	/**
	 * Your NumArray object will be instantiated and called as such: NumArray obj =
	 * new NumArray(nums); int param_1 = obj.sumRange(i,j);
	 */
}
