package others8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A447 {

	// 有个28/32用例过不去，应该在那里还有边界问题
	class Solution {
		public int numberOfBoomerangs(int[][] points) {
			if (points.length <= 2)
				return 0;
			Map<Integer[], List<Integer>> map = new HashMap<Integer[], List<Integer>>();
			for (int[] point : points) {
				map.put(new Integer[] { point[0], point[1] }, new ArrayList<>());
			}
			for (Integer[] one : map.keySet()) {
				for (Integer[] another : map.keySet()) {
					if (another.equals(one)) {
						continue;
					} else {
						int length = Math.abs((one[0] - another[0]) * (one[0] - another[0])
								+ (one[1] - another[1]) * (one[1] - another[1]));
						map.get(one).add(length);
//						map.get(another).add(length);
					}
				}
			}
			int ans = 0;

			// 统计每个value里的重复值
			for (List<Integer> list : map.values()) {
				ans = ans + count(list);
			}
			return ans * 2;
		}

		public int count(List<Integer> list) {
			int result = 0;
			list.sort(null);
			int left = 0, right = 0;
			while (right < list.size()) {
				while (right < list.size() && list.get(left) == list.get(right)) {
					right++;
				}
				if (right - left >= 2) {
					result = result + (right - left) * (right - left - 1) / 2;
				}
				left = right;
			}
			System.out.println(result);
			return result;
		}
	}
}
