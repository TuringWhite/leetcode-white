package others1;

public class A852 {
	class Solution {

		public int peakIndexInMountainArray(int[] arr) {
			int left = 0, right = arr.length - 1;
			while (left < right) {
				int mid = left + (right - left) / 2;
				if (arr[mid] > arr[mid - 1] & arr[mid] > arr[mid + 1])
					return mid;
				if (arr[mid] > arr[mid - 1]) {
					left = mid;
				} else {
					right = mid;
				}
			}
			return left;
		}
//		线性查找，low了点
//		public int peakIndexInMountainArray(int[] arr) {
//			int i = 0;
//			while (arr[i] <= arr[i + 1])
//				i++;
//			return i;
//		}
	}
}
