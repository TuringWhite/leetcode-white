package a51_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A56 {

	
	
	//过了！ohhhhhhhhhhhhhh，大进步
	class Solution {
		public int[][] merge(int[][] intervals) {
			if (intervals.length < 2)
				return intervals;

			// 这里要有一个二位数组的排序算法
			Arrays.sort(intervals, new Comparator<int[]>() {
				public int compare(int[] interval1, int[] interval2) {
					return interval1[0] - interval2[0];
				}
			});
			printintervals(intervals);
			List<Integer[]> list = new ArrayList<Integer[]>();
			int[] temp = intervals[0];
			for (int i = 1; i < intervals.length; i++) {
				int[] next = intervals[i];
				if (temp[1] >= next[0]) {
					temp[1] = Math.max(temp[1], next[1]);
				} else {
					Integer[] integers = new Integer[2];
					integers[0] = temp[0];
					integers[1] = temp[1];
					list.add(integers);
					temp = next;
				}
			}
			Integer[] integers = new Integer[2];
			integers[0] = temp[0];
			integers[1] = temp[1];
			list.add(integers);
			int[][] result = new int[list.size()][2];
			int i = 0;
			for (Integer[] integers2 : list) {
				result[i][0] = integers2[0];
				result[i][1] = integers2[1];
				i++;
			}
			return result;
		}

		public void printintervals(int[][] intervals) {
			for (int[] child : intervals) {
				System.out.println(child[0] + "    " + child[1]);
			}
		}
	}
//	public static void main(String[] args) {
//
//		int[][] arr = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
//		System.out.println(merge(arr));
//		int[][] arr2 = new int[][] { { 1, 4 }, { 0, 4 } };
//		System.out.println(merge(arr2));
//		int[][] arr10 = new int[][] { { 1, 4 }, { 0, 1 } };
//		System.out.println(merge(arr10));
//		int[][] arr3 = new int[][] { { 1, 4 }, { 1, 4 } };
//		System.out.println(merge(arr3));
//		int[][] arr4 = new int[][] { { 1, 4 }, { 2, 3 } };
//		System.out.println(merge(arr4));
//		int[][] arr5 = new int[][] { { 2, 3 }, { 1, 4 } };
//		System.out.println(merge(arr5));
//		int[][] arr6 = new int[][] { { 2, 3 }, { 4, 6 }, { 6, 7 }, { 1, 10 } };
//		System.out.println(merge(arr6));
//	}
//
//	public static int[][] merge(int[][] intervals) {
//		if (intervals.length <= 1) {
//			return intervals;
//		}
//		boolean swapped = true;
//		for (int i = 0; i < intervals.length - 1; i++) {
//			// 如果没有发生过交换，说明剩余部分已经有序，排序完成
//			if (!swapped)
//				break;
//			// 设置 swapped 为 false，如果发生交换，则将其置为 true
//			swapped = false;
//			for (int j = 0; j < intervals.length - 1 - i; j++) {
//				if (intervals[j][0] > intervals[j + 1][0]) {
//					// 如果左边的数大于右边的数，则交换，保证右边的数字最大
//					int[] temp = intervals[j];
//					intervals[j] = intervals[j + 1];
//					intervals[j + 1] = temp;
//					// 表示发生了交换
//					swapped = true;
//				}
//			}
//		}
//		ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
//		int[] arr = new int[2];
//		arr = intervals[0];
////		for(int i = 0;i<intervals.length;i++) {
////			System.out.print(intervals[i][0] + "---" + intervals[i][1]);
////			System.out.println();
////		}
//		for (int i = 0; i < intervals.length - 1; i++) {
//			if ((!(arr[1] < intervals[i + 1][0])) && (arr[1] <= intervals[i + 1][1])) {
//				arr[1] = intervals[i + 1][1];
//				arr[0] = Math.min(arr[0], intervals[i + 1][0]);
//			} else if ((!(arr[0] > intervals[i + 1][1])) && (intervals[i + 1][0] <= arr[0])) {
//				arr[0] = intervals[i + 1][0];
//				arr[1] = Math.max(arr[1], intervals[i + 1][1]);
//			} else if (arr[0] == intervals[i + 1][0] && arr[1] == intervals[i + 1][1]) {
//				continue;
//			} else if (arr[0] < intervals[i + 1][0] && arr[1] > intervals[i + 1][1]) {
//				continue;
//			} else if (arr[0] > intervals[i + 1][0] && arr[1] < intervals[i + 1][1]) {
//				arr = intervals[i + 1];
//			} else {
//				arrayList.add(new Integer[] { new Integer(arr[0]), new Integer(arr[1]) });
//				arr = intervals[i + 1];
//			}
//		}
//		arrayList.add(new Integer[] { new Integer(arr[0]), new Integer(arr[1]) });
//		int[][] aw = new int[arrayList.size()][2];
//		for (int i = 0; i < aw.length; i++) {
//			aw[i][0] = (int) arrayList.get(i)[0];
//			aw[i][1] = (int) arrayList.get(i)[1];
//		}
////		for (int i = 0; i < aw.length; i++) {
////			System.out.print(aw[i][0] + "---" + aw[i][1]);
////			System.out.println();
////		}
//		return aw;
//
////	       Arrays.sort(arr, new Comparator<Integer>() {
////	            public int compare(Integer a, Integer b) {
////	                return b-a;
////	            }
////	        });
//	}
}
