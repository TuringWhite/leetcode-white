package others1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A350 {
	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 2, 1 };
		int[] nums2 = new int[] { 2, 2 };
		printArr(intersect(nums1, nums2));
		int[] nums3 = new int[] { 4, 9, 5 };
		int[] nums4 = new int[] { 9, 4, 9, 8, 4 };
		printArr(intersect(nums3, nums4));
		int[] nums5 = new int[] { 1,2};
		int[] nums6 = new int[] { 1,1};
		printArr(intersect(nums5, nums6));
	}

	// 单hash
	public static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] small = nums1.length < nums2.length ? nums1 : nums2;
		int[] big = nums1.length < nums2.length ? nums2 : nums1;
		addMap(small, map);
		int[] arr = new int[small.length];
		int count = 0;
		for (int i = 0; i < big.length; i++) {
			if (map.containsKey(big[i]) && map.get(big[i]) > 0) {
				arr[count++] = big[i];
				map.replace(big[i], map.get(big[i]) - 1);
			}
		}
		return Arrays.copyOfRange(arr, 0, count);
	}

	// 双hash
//	public static int[] intersect(int[] nums1, int[] nums2) {
//		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
//		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
//		addMap(nums1, map1);
//		addMap(nums2, map2);
//		List<Integer> list = new ArrayList<Integer>();
//		Set<Integer> set = map1.keySet();
//		int min;
//		for (Integer integer : set) {
//			if (map2.containsKey(integer)) {
//				min = map1.get(integer) < map2.get(integer) ? map1.get(integer) : map2.get(integer);
//				for (int i = 0; i < min; i++) {
//					list.add(integer);
//				}
//			}
//		}
//		int[] arr = new int[list.size()];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = list.get(i);
//		}
//		return arr;
//	}

	public static void addMap(int[] nums, Map<Integer, Integer> map) {
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.replace(nums[i], map.get(nums[i]).intValue() + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
