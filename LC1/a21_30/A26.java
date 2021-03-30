package a21_30;

public class A26 {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 2 };
		System.out.println(removeDuplicates(nums));
		int[] nums2 = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums2));
		int[] nums3 = new int[] { 1, 1, 1 };
		System.out.println(removeDuplicates(nums3));

	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int a, length = nums.length;
		int max = nums[length - 1];
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				break;
			}
			if (nums[i - 1] == nums[i]) {
				if (nums[i] == max)
					break;
				for (int j = i; j < nums.length; j++) {
					a = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = a;
				}
				i--;
			}
		}
		int num = 1;
//		for (int i = 0; i < length; i++) {
//			System.out.print(nums[i]);
//		}
//		System.out.println("");
		for (int i = 0; i < length - 1; i++, num++) {
			if (nums[i] >= nums[i + 1]) {
				break;
			}
		}
		return num;
	}
}
