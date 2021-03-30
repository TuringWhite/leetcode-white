package others3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A819 {

	// 测试用例有一个很烂的用例，长下面这个样子，不是所有子串都有空格拼接而成，绝了
//	"a, a, a, a, b,b,b,c, c"
//	["a"]
	class Solution {
		public String mostCommonWord(String paragraph, String[] banned) {
			paragraph = paragraph.toLowerCase().trim();
			Map<String, Integer> map = new HashMap<String, Integer>();
			String[] arr = paragraph.split(" ");
			for (String string : arr) {
				if (!(string.charAt(string.length() - 1) >= 'a' && string.charAt(string.length() - 1) <= 'z')) {
					string = string.substring(0, string.length() - 1);

				}
				if (map.containsKey(string)) {
					map.replace(string, map.get(string) + 1);
				} else {
					map.put(string, 1);
				}
			}
			String result = "";
			int count = 0;
			Set<String> ban = new HashSet<>();
			for (String string : banned) {
				ban.add(string);
			}
			for (String key : map.keySet()) {
				if (!ban.contains(key)) {
					if (map.get(key) > count) {
						result = key;
						count = map.get(key);
					}
				}
			}
			return result;
		}
	}
}
