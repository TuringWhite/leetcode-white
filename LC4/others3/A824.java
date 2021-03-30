package others3;

public class A824 {
	class Solution {
		public String toGoatLatin(String S) {
			String[] arr = S.split(" ");
			StringBuffer sBuffer = new StringBuffer("ma");
			for (int i = 0; i < arr.length; i++) {
				char head = arr[i].charAt(0);
				if (!(head == 'a' || head == 'e' || head == 'i' || head == 'o' || head == 'u' || head == 'A'
						|| head == 'E' || head == 'I' || head == 'O' || head == 'U')) {
					arr[i] = arr[i].substring(1) + (char) head;
				}
				sBuffer.append("a");
				arr[i] = arr[i] + sBuffer.toString();
			}
			StringBuffer result = new StringBuffer();
			for (String string : arr) {
				result.append(string + " ");
			}
			return result.substring(0, result.length() - 1);
		}
	}
}
