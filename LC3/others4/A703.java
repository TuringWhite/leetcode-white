package others4;

import java.util.ArrayList;
import java.util.List;

public class A703 {

	class KthLargest {
		int k;
		List<Integer> list;

		public KthLargest(int k, int[] nums) {
			this.k = k;
			list = new ArrayList<Integer>();
			list = new ArrayList<Integer>();
			for (int i = 0; i < nums.length; i++) {
				list.add(nums[i]);
			}
			list.sort(null);
		}

		public int add(int val) {
			list.add(val);
			list.sort(null);
			return list.get(list.size() - k);
		}
	}

//	class KthLargest {
//		private int k;
//		private List<Integer> list;
//
//		public KthLargest(int k, int[] nums) {
//			this.k = k;
//			Arrays.sort(nums);
//			list = new ArrayList<Integer>();
//			for (int i = 0; i < nums.length; i++) {
//				list.add(nums[i]);
//			}
//		}
//
//		public int add(int val) {
//			if (list.get(0) > val) {
//				list.add(0, val);
//			} else if (list.get(list.size() - 1) < val) {
//				list.add(list.size() - 1, val);
//			} else {
//				for (int i = 0; i < list.size() - 1; i++) {
//					if (list.get(i) <= val && list.get(i + 1) >= val) {
//						list.add(i + 1, val);
//						break;
//					}
//				}
//			}
//			for (int i = 0; i < list.size(); i++) {
//				System.out.print(list.get(i) + "   ");
//			}
//			System.out.println();
//			System.out.println(list.size() - k);
//			return list.get(list.size() - k);
//		}
//	}
}
