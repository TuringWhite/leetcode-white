package a81_90;

public class A88 {
	public static void main(String[] args) {
//		int[] arr1 = new int[] { 1, 2, 3, 0, 0, 0 };
//		int[] arr2 = new int[] { 2, 5, 6 };
//		merge(arr1, 3, arr2, 3);
//		int[] arr3 = new int[] { 0 };
//		int[] arr4 = new int[] { 1 };
//		merge(arr3, 0, arr4, 1);
//		int[] arr5 = new int[] { 2, 0 };
//		int[] arr6 = new int[] { 1 };
//		merge(arr5, 1, arr6, 1);
//		int[] arr7 = new int[] { 4, 5, 6, 0, 0, 0 };
//		int[] arr8 = new int[] { 1, 2, 3 };
//		merge(arr7, 3, arr8, 3);
//		int[] arr9 = new int[] { 1, 2, 3, 0, 0, 0 };
//		int[] arr10 = new int[] { 4, 5, 6 };
//		merge(arr9, 3, arr10, 3);
//		int[] arr11 = new int[] { 1, 2, 4, 5, 6, 0 };
//		int[] arr12 = new int[] { 3 };
//		merge(arr11, 5, arr12, 1);
		int[] arr13 = new int[] {-1,0,0,3,3,3,0,0,0};
		int[] arr14 = new int[] { 1,2,2,};
		merge(arr13, 6, arr14, 3);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
			return;
		}
		int length = m;
		int j = 0;
		for (int i = 0; i < m + n - 1 && m + n > length; i++) {
			if (nums1[i] <= nums2[j] && nums1[i + 1] > nums2[j]) {
				for (int x = length; x > i + 1; x--) {
					int temp = nums1[x];
					nums1[x] = nums1[x - 1];
					nums1[x - 1] = temp;
				}
				nums1[i + 1] = nums2[j];
				length++;
				j++;
				i++;
			} else if (nums1[i] > nums2[j]) {
				for (int x = length; x > i; x--) {
					int temp = nums1[x];
					nums1[x] = nums1[x - 1];
					nums1[x - 1] = temp;
				}
				nums1[i] = nums2[j];
				length++;
				j++;
//				i++;
			} else if (nums1[i + 1] == 0) {
				nums1[i + 1] = nums2[j++];
			}
//			System.out.println("i:" + i + "---j:" + j);
			for (int x = 0; x < m + n; x++) {
				System.out.print(nums1[x] + "--");
			}
			System.out.println();
		}
	}
}