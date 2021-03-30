package a131_140;

import java.util.HashMap;
import java.util.Map;

public class A136 {
	class Solution {
		public int singleNumber(int[] nums) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int num : nums) {
				if (map.containsKey(num)) {
					map.put(num, 2);
				} else {
					map.put(num, 1);
				}
			}
			for (int num : map.keySet()) {
				if (map.get(num) == 1) {
					return num;
				}
			}
			return -1;
		}

	}

//	public static void main(String[] args) {
//		int[] arr = new int[] { 4, 1, 2, 1, 2 };
//		System.out.println(singleNumber(arr));
//	}
//
//	public static int singleNumber(int[] nums) {
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length; i = i + 2) {
//
//			if (i + 1 == nums.length || nums[i] != nums[i + 1]) {
//				return nums[i];
//			}
//		}
//		return -1;
//	}

//	public static int singleNumber(int[] nums) {
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < nums.length; i++) {
//			if (!map.containsKey(nums[i])) {
//				map.put(nums[i], 1);
//			} else {
//				map.replace(nums[i], 2);
//			}
//		}
//		for (int i = 0; i < nums.length; i++) {
//			if (map.get(nums[i]).equals(1)) {
//				return nums[i];
//			}
//		}
//		return -1;
//	}
}
