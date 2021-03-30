package a111_120;

import java.util.ArrayList;
import java.util.List;

public class A119 {

	class Solution {
		public List<Integer> getRow(int rowIndex) {
			List<Integer> ans = new ArrayList<>();
			ans.add(1);
			if (rowIndex == 0)
				return ans;
			ans.add(1);
			if (rowIndex == 1)
				return ans;
			for (int i = 2; i <= rowIndex; i++) {
				for (int j = 0; j < ans.size() - 1; j++) {
					ans.set(j, ans.get(j) + ans.get(j + 1));
				}
				ans.add(0, 1);
			}
			return ans;
		}
	}
//
//	class Solution {
//		public List<Integer> getRow(int rowIndex) {
//			++rowIndex;
//			List<Integer> result = new ArrayList<>();
//			if (rowIndex == 0)
//				return result;
//			result.add(1);
//			if (rowIndex == 1)
//				return result;
//			result.add(1);
//			if (rowIndex == 2)
//				return result;
//			for (int i = 3; i <= rowIndex; ++i) {
//				for (int j = 0; j < i - 2; ++j) {
//					result.set(j, result.get(j) + result.get(j + 1));
//				}
//				result.add(0, 1);
//			}
//			return result;
//		}
//	}

//	public static void main(String[] args) {
//		getRow(6);
//	}
//	public static List<Integer> getRow(int rowIndex) {
//		rowIndex++;
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> list_copy = new ArrayList<Integer>();
//		list.add(new Integer(1));
//		if (rowIndex == 1) {
//			return list;
//		}
//		list.add(new Integer(1));
//		if (rowIndex == 2) {
//			return list;
//		}
//		list_copy.add(1);
//		list_copy.add(1);
//		for (int i = 3; i <= rowIndex; i++) {
//			list = new ArrayList<Integer>();
//			list.add(1);
//			for (int j = 1; j < i - 1; j++) {
//				list.add(new Integer(list_copy.get(j) + list_copy.get(j - 1)));
//				
//			}
//			list.add(1);
//			list_copy.clear();
//			list_copy = list;
//		}
//		return list;
//
//	}
//	
//	public static void printrow(List<Integer> list ) {
//		for (Integer integer : list) {
//			System.out.print(integer+"-");
//		}
//	}
}
