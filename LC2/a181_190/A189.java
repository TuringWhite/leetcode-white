package a181_190;

public class A189 {

	// 烂尾了，最后两组用例解决不了，数学想不到怎么解决

	public static void main(String[] args) {
		rotate1(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
		rotate1(new int[] { 1, 2, 3, 4, 5, 6 }, 4);// 还有一个1——54，k是45的
		rotate1(new int[] { -1, -100, 3, 99 }, 2);
		rotate1(new int[] { 1 }, 1);
//		rotate1(new int[] {}, 1);
		rotate1(new int[] { 1 }, 0);
		rotate1(new int[] { 1 }, 2);
	}

	// 官方正解
	public static void rotate1(int[] nums, int k) {
		k = k % nums.length;
		int count = 0;
		for (int start = 0; count < nums.length; start++) {
			int current = start;
			int prev = nums[start];
			do {
				int next = (current + k) % nums.length;
				int temp = nums[next];
				nums[next] = prev;
				prev = temp;
				current = next;
				count++;
			} while (start != current);	
		}
		printarr(nums);
	}

	public static void rotate(int[] nums, int k) {
		if (nums.length == 0 || k == 0)
			return;
		if (nums.length == 1) {
			return;
		}
		int next = nums[0];
		int front;
		int i = 0;
//		k = k > nums.length ? k % nums.length : k;
		if (nums.length % k != 0) {
			for (int count = 0; count < nums.length; count++) {
				front = nums[(i + k) % nums.length];
				nums[(i + k) % nums.length] = next;
				i = (i + k) % nums.length;
				next = front;
			}
		} else {
			for (int j = 0; j < k; j++) {
				i = j;
				next = nums[i];
				for (int count = 0; count < nums.length / k; count++) {
					front = nums[(i + k) % nums.length];
					nums[(i + k) % nums.length] = next;
					i = (i + k) % nums.length;
					next = front;
				}
			}
		}
		printarr(nums);
	}

	public static void printarr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " - ");
		}
		System.out.println("");
	}
}
