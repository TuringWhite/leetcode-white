package others7;

public class A557 {
	class Solution {
		public String reverseWords(String s) {
			String[] arr = s.split(" ");
			StringBuilder sBuilder = new StringBuilder();
			for (String sub : arr) {
				sBuilder.append(new StringBuffer(sub).reverse().toString()+" ");
			}
			return sBuilder.substring(0,sBuilder.length()-1);
		}
	}
}
