package a111_120;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A120 {
	class Solution {
		// ohhhhhhhhhhh
		// 一个自己写的DP。而且通过了，还行
		public int minimumTotal(List<List<Integer>> triangle) {
			if (triangle == null)
				return 0;
			if (triangle.size() == 1)
				return triangle.get(0).get(0);
			List<Integer> list = new ArrayList<Integer>();
			List<Integer> pre;
			pre = triangle.get(0);
			for (int j = 1; j < triangle.size(); j++) {
				list = new ArrayList<>();
				for (int i = 0; i < triangle.get(j).size(); i++) {
					System.out.println(i + "---" + j);
					if (i == 0) {
						list.add(pre.get(i) + triangle.get(j).get(i));
					} else if (i != triangle.get(j).size() - 1) {
						list.add(triangle.get(j).get(i) + Math.min(pre.get(i), pre.get(i - 1)));
					} else {
						list.add(pre.get(i - 1) + triangle.get(j).get(i));
					}
				}
				pre = list;
			}
			return Collections.min(list);
		}
	}
}
