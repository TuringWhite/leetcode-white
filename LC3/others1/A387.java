package others1;

import java.util.HashMap;
import java.util.Map;

public class A387 {
	public static int firstUniqChar(String s) {
		char[] arr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.replace(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == 1) {
				return i;
			}
		}
		return -1;
	}
}
