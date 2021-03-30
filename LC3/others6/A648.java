package others6;

import java.util.List;

public class A648 {
	class Solution {
		public String replaceWords(List<String> dictionary, String sentence) {
			dictionary.sort(null);
			String[] arr = sentence.split(" ");
			int i = -1;
			for (String son : arr) {
				i++;
				for (String pre : dictionary) {
					if (son.length() >= pre.length() && son.substring(0, pre.length()).equals(pre)) {
						arr[i] = pre;
						break;
					}
				}
			}
			StringBuffer sBuffer = new StringBuffer();
			for (String son : arr)
				sBuffer.append(son + " ");
			return sBuffer.substring(0, sBuffer.length() - 1);
		}
	}
}
