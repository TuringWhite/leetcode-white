package others7;

import java.util.HashMap;
import java.util.Map;

public class A451 {
	class Solution {
		public String frequencySort(String s) {
			Map<Character, Integer> map = new HashMap<>();
			char[] arr = s.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i])) {
					map.replace(arr[i], map.get(arr[i]) + 1);
				} else {
					map.put(arr[i], 1);
				}
			}

			int[][] help = new int[map.size()][2];
			int cur = 0;
			for (char ch : map.keySet()) {
				help[cur][0] = ch;
				help[cur][1] = map.get(ch);
				cur++;
			}

			int[] temp;
			for (int i = 0; i < help.length; i++) {
				for (int j = 0; j < help.length - i - 1; j++) {
					if (help[j][1] < help[j + 1][1]) {
						temp = help[j];
						help[j] = help[j + 1];
						help[j + 1] = temp;
					}
				}
			}

			StringBuffer sBuffer = new StringBuffer();
			for (int i = 0; i < help.length; i++) {
				int count = help[i][1];
				char add = (char) help[i][0];
				System.out.println(add + "  " + count);
				while (count-- > 0) {
					sBuffer.append(add);
				}
			}
			return sBuffer.toString();
		}
	}
}
