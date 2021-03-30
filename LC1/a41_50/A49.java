package a41_50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A49 {
	class Solution {
		public List<List<String>> groupAnagrams(String[] strs) {
			Map<String, List<String>> map = new HashMap<>();
			List<List<String>> result = new ArrayList<List<String>>();
			for (String str : strs) {
				char[] arr = str.toCharArray();
				Arrays.sort(arr);
				String string = String.copyValueOf(arr);
				if (map.containsKey(string)) {
					map.get(string).add(str);
				} else {
					map.put(string, new ArrayList<>());
					map.get(string).add(str);
				}
			}
			result.addAll(map.values());
			return result;
		}
	}
	// 超时了，111/112，没跑过去
//	class Solution {
//		public List<List<String>> groupAnagrams(String[] strs) {
//			List<String> help = new ArrayList<>();
//			for (String string : strs)
//				help.add(string);
//			List<List<String>> result = new ArrayList<List<String>>();
//			while (!help.isEmpty()) {
//				List<String> list = new ArrayList<>();
//				String string = help.get(0);
//				help.remove(0);
//				list.add(string);
//				for (int i = 0; i < help.size(); i++) {
//					if (equalAB(help.get(i), string)) {
//						list.add(help.get(i));
//						help.remove(i);
//						i--;
//					}
//				}
//				result.add(list);
//			}
//			return result;
//		}
//
//		public boolean equalAB(String A, String B) {
//			char[] a = A.toCharArray();
//			char[] b = B.toCharArray();
//			Arrays.sort(a);
//			Arrays.sort(b);
//			return Arrays.equals(a, b);
//		}
//	}

//	public List<List<String>> groupAnagrams(String[] strs) {
//		List<List<String>> list = new ArrayList<List<String>>();
//		for (int i = 0; i < strs.length; i++) {
//			List<String> child = new ArrayList<String>();
//			if (strs[i] == null)
//				continue;
//			child.add(strs[i]);
//			for (int j = i + 1; j < strs.length; j++) {
//				if (strs[j] == null)
//					continue;
//				if (compareStr(strs[i], strs[j])) {
//					child.add(strs[j]);
//					strs[j] = null;
//				}
//			}
//			list.add(child);
//		}
//
//		return list;
//	}
//
//	public static boolean compareStr(String a, String b) {
//		if (a.length() != b.length()) {
//			return false;
//		}
//		char[] arr1 = a.toCharArray();
//		char[] arr2 = b.toCharArray();
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		for (int i = 0; i < arr1.length; i++) {
//			if (arr1[i] != arr2[i])
//				return false;
//		}
//		return true;
//	}
}
