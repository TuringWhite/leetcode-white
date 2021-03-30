package a161_170;

public class A167 {

	class Solution {
		public int[] twoSum(int[] numbers, int target) {
			int left = 0, right = numbers.length - 1;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				int sum = numbers[left] + numbers[mid];
				if (sum == target) {
					return new int[] { left + 1, right + 1 };
				}
				if (sum >= target) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			return new int[] { -1, -1 };
		}
	}

	// 双指针
//	class Solution {
//		public int[] twoSum(int[] numbers, int target) {
//			int left = 0, right = numbers.length - 1;
//			while (left < right) {
//				int sum = numbers[left] + numbers[right];
//				if (sum == target)
//					return new int[] { left + 1, right + 1 };
//				if (sum > target) {
//					right--;
//				} else {
//					left++;
//				}
//			}
//			return new int[] { -1, -1 };
//		}
//	}

//	public static void main(String[] args) {
//		twoSum(new int[] {2,7,11,15}, 9);
//		twoSum(new int[] {}, 9);
//		twoSum(new int[] {1}, 9);
//	}
//
//	public static int[] twoSum(int[] numbers, int target) {
//		int[] result = new int[2];
//		for (int i = 0; i < numbers.length - 1; i++) {
//			for (int j = i + 1; j < numbers.length; j++) {
//				if (numbers[i] + numbers[j] == target) {
//					result[0] = i+1;
//					result[1] = j+1;
////					printintarr(result);
//					return result;
//				}
//			}
//		}
////		printintarr(result);
//		return result;
//	}
//
//	public static void printintarr(int[] arr) {
//		System.out.println(arr[0]+"---"+arr[1]);
//	}
}
