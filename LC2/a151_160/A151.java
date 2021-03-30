package a151_160;

public class A151 {
	class Solution {
		public String reverseWords(String s) {
			s = s.trim();
			String[] arr = s.split("\\s+");
			StringBuilder sBuilder = new StringBuilder();
			for (int i = arr.length - 1; i >= 0; i--) {
				sBuilder.append(arr[i] + " ");
			}
			return sBuilder.substring(0, sBuilder.length() - 1);
		}
	}
//
//	public static void main(String[] args) {
//		System.out.println(reverseWords("the sky is blue"));
//		System.out.println(reverseWords("  hello world!  "));
//		System.out.println(reverseWords("a good   example"));
//
//		System.out.println(reverseWords("  Bob    Loves  Alice   "));
//
//		System.out.println(reverseWords("Alice does not even like bob"));
//	}
//
//	public static String reverseWords(String s) {
//		String[] arr = s.split(" ");
//		StringBuffer sBuffer = new StringBuffer();
//		String string;
//		for (int i = arr.length - 1; i >= 0; i--) {
//			string = arr[i];
//			if (string.contains(" ") || string.length() == 0) {
//				continue;
//			} else {
//				sBuffer.append(string + " ");
//			}
//		}
//		return sBuffer.substring(0, sBuffer.length() - 1);
//	}
//
//	public static String nospace(String str) {
//		if (!(str.contains(" ") || str.length() == 0)) {
//			return str;
//		} else {
//			char[] arr = str.toCharArray();
//			StringBuffer sBuffer = new StringBuffer();
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] != ' ')
//					sBuffer.append(arr[i]);
//			}
//			return sBuffer.toString();
//		}
//
////		return str;
//	}

}
