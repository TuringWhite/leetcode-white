package a111_120;

import java.util.ArrayList;
import java.util.List;

public class A118 {

	class Solution {
		public List<List<Integer>> generate(int numRows) {
			List<List<Integer>> ans = new ArrayList<>();
			if (numRows == 0)
				return ans;
			List<Integer> temp = new ArrayList<>();
			temp.add(1);
			ans.add(temp);
			if (numRows == 1)
				return ans;
			temp = new ArrayList<>();
			temp.add(1);
			temp.add(1);
			ans.add(temp);

			for (int i = 3; i <= numRows; i++) {
				List<Integer> cur = new ArrayList<>();
				cur.add(1);
				for (int j = 0; j < temp.size() - 1; j++) {
					cur.add(temp.get(j) + temp.get(j + 1));
				}
				cur.add(1);
				temp = cur;
				ans.add(temp);
			}
			return ans;

		}
	}
//	class Solution {
//		public List<List<Integer>> generate(int numRows) {
//			List<List<Integer>> result = new ArrayList<>();
//			List<Integer> temp;
//			if (numRows == 0)
//				return result;
//			temp = new ArrayList<>();
//			temp.add(1);
//			result.add(temp);
//			if (numRows == 1)
//				return result;
//			temp = new ArrayList<>();
//			temp.add(1);
//			temp.add(1);
//			result.add(temp);
//			if (numRows == 2)
//				return result;
//			for (int i = 3; i <= numRows; i++) {
//				temp = new ArrayList<>();
//				temp.add(1);
//				List<Integer> pre = result.get(i - 2);
//				for (int j = 0; j < pre.size() - 1; j++) {
//					temp.add(pre.get(j) + pre.get(j + 1));
//				}
//				temp.add(1);
//				result.add(temp);
//			}
//			return result;
//		}
//	}
//	public static void main(String[] args) {
//		generate(5);
//	}
//
//	public static List<List<Integer>> generate(int numRows) {
//		List<List<Integer>> yanghui = new ArrayList<>();
//		if (numRows >= 1) {
//			List<Integer> list = new ArrayList<>();
//			list.add(new Integer(1));
//			yanghui.add(list);
//		}
//		if (numRows >= 2) {
//			List<Integer> list = new ArrayList<>();
//			list.add(new Integer(1));
//			list.add(new Integer(1));
//			yanghui.add(list);
//		}
//		for (int i = 3; i <= numRows; i++) {
//			List<Integer> list = new ArrayList<>();
//			list.add(new Integer(1));
//			List<Integer> front = yanghui.get(i - 2);
//			for (int j = 1; j < i - 1; j++) {
//				list.add(new Integer(front.get(j) + front.get(j - 1)));
//			}
//			list.add(new Integer(1));
//			yanghui.add(list);
//		}
//		printlist(yanghui);
//
//		return yanghui;
//
//	}
//
//	public static void printlist(List<List<Integer>> list) {
//		for (List<Integer> list2 : list) {
//			for (Integer list3 : list2) {
//				System.out.print(list3 + "  ");
//			}
//			System.out.println();
//		}
//	}
}
