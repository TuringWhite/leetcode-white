package others7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class A658 {
	public class Solution {
		public List<Integer> findClosestElements(int[] arr, int k, int x) {
			List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
			int n = ret.size();
			if (x <= ret.get(0)) {
				return ret.subList(0, k);
			} else if (ret.get(n - 1) <= x) {
				return ret.subList(n - k, n);
			} else {
				int index = Collections.binarySearch(ret, x);
				if (index < 0)
					index = -index - 1;
				int low = Math.max(0, index - k - 1), high = Math.min(ret.size() - 1, index + k - 1);

				while (high - low > k - 1) {
					if ((x - ret.get(low)) <= (ret.get(high) - x))
						high--;
					else if ((x - ret.get(low)) > (ret.get(high) - x))
						low++;
					else
						System.out.println("unhandled case: " + low + " " + high);
				}
				return ret.subList(low, high + 1);
			}
		}
	}

//	 //一个有问题的二分查找
//	class Solution {
//		public List<Integer> findClosestElements(int[] arr, int k, int x) {
//			int left = 0, right = arr.length;
//			int mid = left + (right - left) / 2;
//			while (left < right) {
//				mid = left + (right - left) / 2;
//				if (arr[mid] == x) {
//					break;
//				}
//				if (arr[mid] < x) {
//					left = mid + 1;
//				} else {
//					right = mid;
//				}
//			}
//			if (left == arr.length) {
//				mid = arr.length - 1;
//			}
//
//			left = mid;
//			right = mid;
//			int[] result = new int[0];
//			while (right - left + 1 != k) {
//				if (left == 0) {
//					result = Arrays.copyOf(arr, k);
//					break;
//				} else if (right == arr.length - 1) {
//					result = Arrays.copyOfRange(arr, arr.length - k, arr.length);
//					break;
//				}
//				if ((x - arr[left - 1]) <= (arr[right + 1] - x)) {
//					left--;
//				} else {
//					right++;
//				}
//			}
//			if (right - left + 1 == k) {
//				result = Arrays.copyOfRange(arr, left, right + 1);
//			}
//			List<Integer> list = new ArrayList<Integer>();
//			System.out.println(left + "      " + right);
//			for (int i : result)
//				list.add(i);
//			return list;
//		}
//	}
}
