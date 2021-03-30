package a11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A15 {

	// [-1,0,1,2,-1,-4,-2,-3,3,0,4]

	class Solution {

		public List<List<Integer>> threeSum(int[] nums) {
			Arrays.sort(nums);
			List<List<Integer>> result = new ArrayList<List<Integer>>();
			int l, r, target;
			for (int i = 0; i < nums.length - 2; ++i) {
				if (nums[i] > 0)
					break;
				if (i > 0 && nums[i] == nums[i - 1])
					continue;
				l = i + 1;
				r = nums.length - 1;
				target = 0 - nums[i];
				while (l < r) {
					if (nums[l] + nums[r] == target) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[i]);
						list.add(nums[l]);
						list.add(nums[r]);
						list.sort(null);
						result.add(list);
						++l;
						--r;
						while (l < r && nums[l] == nums[l - 1])
							l++;
						while (l < r && nums[r] == nums[r + 1])
							r--;

					} else if (nums[l] + nums[r] > target) {
						--r;
					} else {
						++l;
					}
				}
			}
			return result;
		}

	}

	// 又一个超时的方法，
//	class Solution {
//		public List<List<Integer>> threeSum(int[] nums) {
//			Arrays.sort(nums);
//			List<List<Integer>> result = new ArrayList<List<Integer>>();
//			Map<Integer, Integer> map;
//			int target;
//			for (int i = 0; i < nums.length; i++) {
//				target = 0 - nums[i];
//				map = new HashMap<>();
//				for (int j = i; j < nums.length; j++) {
//					if (j == i)
//						continue;
//					if (map.containsKey(target - nums[j])) {
//						List<Integer> list = new ArrayList<>();
//						list.add(nums[j]);
//						list.add(nums[i]);
//						list.add(target - nums[j]);
//						list.sort(null);
//						if (!result.contains(list)) {
//							result.add(list);
//						}
//					} else {
//						map.put(nums[j], j);
//					}
//				}
//			}
//			return result;
//		}
//	}

//	public static List<List<Integer>> threeSum(int[] nums) {
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
//		for (int i = 0; i < nums.length; i++) {
//			int[] arr = twoSum(nums, -nums[i], i);
//			if (arr.length != 0) {
//				List<Integer> child = new ArrayList<Integer>();
//				child.add(nums[arr[0]]);
//				child.add(nums[arr[1]]);
//				child.add(nums[i]);
//				list.add(child);
//			}
//		}
//for (int i = 0; i < list.size(); i++) {
//			int[] a = new int[3];
//			List<Integer> childList1 = list.get(i);
//			for (int j = 0; j < 3; j++) {
//				a[j] = childList1.get(j);
//			}
//			for (int j = i + 1; j < list.size(); j++) {
//				int[] b = new int[3];
//				List<Integer> childList2 = list.get(j);
//				for (int z = 0; z < 3; z++) {
//					b[z] = childList2.get(z);
//				}
//				Arrays.sort(a);
//				Arrays.sort(b);
//				if (Arrays.equals(a, b)) {
//					list.remove(j);
//					j--;
//				}
//			}
//		}
//		return list;
//	}
//
//	public static int[] twoSum(int[] nums, int target, int skip) {
//		Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
//		for (int i = 0; i < nums.length; ++i) {
//			if (hashtable.containsKey(target - nums[i])) {
//				return new int[] { hashtable.get(target - nums[i]), i };
//			}
//			hashtable.put(nums[i], i);
//			if (i + 1 == skip)
//				i++;
//		}
//		return new int[0];
//	}

	// 下面这个版本还是超时了
	// https://leetcode-cn.com/submissions/detail/117001420/testcase/
//	public static List<List<Integer>> threeSum(int[] nums) {
//		Arrays.sort(nums);
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
//		for (int i = 0; i < nums.length - 2; i++)
//			for (int j = i + 1; j < nums.length - 1; j++)
//				for (int z = j + 1; z < nums.length; z++) {
//					if (nums[i] + nums[j] + nums[z] == 0) {
//						List<Integer> childList = new ArrayList<Integer>();
//						childList.add(nums[i]);
//						childList.add(nums[j]);
//						childList.add(nums[z]);
//						int state = 1;
//						for (List<Integer> child : list) {
//							if (ListIntEqual(child, childList)) {
//								state = 0;
//								break;
//							}
//						}
//						if (state == 1) {
//							list.add(childList);
//						}
//					}
//				}
//
//		return list;
//	}
//
//	public static boolean ListIntEqual(List<Integer> a, List<Integer> b) {
//		Object[] o1 = a.toArray();
//		Object[] o2 = b.toArray();
//		Arrays.sort(o1);
//		Arrays.sort(o2);
//		return Arrays.equals(o1, o2);
//	}
}