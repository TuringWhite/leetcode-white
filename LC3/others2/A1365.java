package others2;

public class A1365 {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[i] = 0;
			for (int j = 0; j < nums.length; j++) {
				if (j != i && nums[j] < nums[i]) {
					result[i]++;
				}
			}
		}
		return result;
	}
}
