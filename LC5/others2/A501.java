package others2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A501 {
	class Solution {
		Map<Integer, Integer> map;

		public int[] findMode(TreeNode root) {
			if (root == null)
				return new int[0];
			map = new HashMap<Integer, Integer>();
			dfs(root);
			int value = 0;
			for (int key : map.keySet()) {
				if (map.get(key) > value) {
					value = map.get(key);
				}
			}
			List<Integer> list = new ArrayList<Integer>();
			for (int key : map.keySet()) {
				if (map.get(key) == value)
					list.add(key);
			}
			int[] arr = new int[list.size()];
			int i = 0;
			for (int num : list) {
				arr[i++] = num;
			}
			return arr;
		}

		public void dfs(TreeNode root) {
			if (root == null)
				return;
			if (map.containsKey(root.val)) {
				map.replace(root.val, map.get(root.val) + 1);
			} else {
				map.put(root.val, 1);
			}
			dfs(root.left);
			dfs(root.right);
		}
	}
}
