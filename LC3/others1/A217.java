package others1;

import java.util.HashMap;
import java.util.Map;

public class A217 {
	public static boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return true;
			} else {
				map.put(nums[i], 0);
			}
		}
		return false;
	}
}
