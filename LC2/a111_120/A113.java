package a111_120;

import java.util.ArrayList;
import java.util.List;

public class A113 {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	class Solution {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		public List<List<Integer>> pathSum(TreeNode root, int sum) {
			if (root == null)
				return ans;
			dfs(root, sum, new ArrayList<>());
			return ans;
		}

		public void dfs(TreeNode root, int n, List<Integer> path) {
			path.add(root.val);
			n -= root.val;
			if (n == 0 && root.left == null && root.right == null) {
				ans.add(path);
				return;
			}
			if (root.left != null) {
				List<Integer> list = new ArrayList<>();
				for (int i : path)
					list.add(i);
				dfs(root.left, n, list);
			}
			if (root.right != null) {
				List<Integer> list = new ArrayList<>();
				for (int i : path)
					list.add(i);
				dfs(root.right, n, list);
			}
		}
	}
}
//
//class Solution {
//	public List<List<Integer>> pathSum(TreeNode root, int sum) {
//		List<List<Integer>> result = new ArrayList();
//		if (root == null)
//			return result;
//		List<Integer> path = new ArrayList();
//		return findPath(root, sum, result, path);
//	}
//
//	private List<List<Integer>> findPath(TreeNode root, int sum, List<List<Integer>> result, List<Integer> path) {
//		sum -= root.val;
//		path.add(root.val);
//		if (sum == 0 && root.left == null && root.right == null) {
//			result.add(new ArrayList(path));
//			return result;
//		}
//		if (root.left != null) {
//			result = findPath(root.left, sum, result, path);// 递归访问左子树
//			path.remove(path.size() - 1);// 此时添加了当前节点的左子树到路径中,要往右子树寻找时,要先删除这个左节点
//		}
//		if (root.right != null) {
//			result = findPath(root.right, sum, result, path);
//			path.remove(path.size() - 1);
//		}
//		return result;
//	}
//}
//
//class Solution {
//	List<List<Integer>> ret = new LinkedList<List<Integer>>();
//	Deque<Integer> path = new LinkedList<Integer>();
//
//	public List<List<Integer>> pathSum(TreeNode root, int sum) {
//		dfs(root, sum);
//		return ret;
//	}
//
//	public void dfs(TreeNode root, int sum) {
//		if (root == null) {
//			return;
//		}
//		path.offerLast(root.val);
//		sum -= root.val;
//		if (root.left == null && root.right == null && sum == 0) {
//			ret.add(new LinkedList<Integer>(path));
//		}
//		dfs(root.left, sum);
//		dfs(root.right, sum);
//		path.pollLast();
//	}
//}
