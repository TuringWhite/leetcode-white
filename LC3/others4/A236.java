package others4;

public class A236 {
	//官方解，好麻烦
	class Solution {

	    private TreeNode ans;

	    public Solution() {
	        this.ans = null;
	    }

	    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
	        if (root == null) return false;
	        boolean lson = dfs(root.left, p, q);
	        boolean rson = dfs(root.right, p, q);
	        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
	            ans = root;
	        } 
	        return lson || rson || (root.val == p.val || root.val == q.val);
	    }

	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        this.dfs(root, p, q);
	        return this.ans;
	    }
	}
	//K的，还是靠谱！
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }


}
