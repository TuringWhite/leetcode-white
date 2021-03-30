package a21_30;

public class A27 {
	public static void main(String[] args) {
		int[] nums = new int[] { 3, 2, 2, 3 };
		System.out.println(removeElement(nums, 3));
		int[] nums2 = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(removeElement(nums2, 2));
	}

	public static int removeElement(int[] nums, int val) {

		int num = 0, count = 0;
		if (nums.length == 0)
			return 0;
		for (int i = 0; i < nums.length; i++) {
			if (count == nums.length - i) {
				break;
			}

			if (nums[i] == val) {
				for (int j = i; j < nums.length - 1; j++) {
					num = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = num;
				}
				count++;
				i--;
				continue;
			}
			count = 0;
		}
//		System.out.println(count);

//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		num = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				break;
			}
			num++;
		}
		return num;
	}
}
