package a101_110;

public class A108 {
//	class Solution {
//		public TreeNode sortedArrayToBST(int[] nums) {
//			TreeNode root = null;
//			help(nums, 0, nums.length - 1, root);
//			return root;
//		}
//
//		public void help(int[] nums, int left, int right, TreeNode root) {
//
//			if (left <= right) {
//				root = new TreeNode(nums[(left + right) / 2]);
//				System.out.println(root.val);
//				help(nums, left, (left + right) / 2 - 1, root.left);
//				help(nums, (left + right) / 2 + 1, right, root.right);
//			}
//		}
//	}
	
	class Solution {
		public TreeNode sortedArrayToBST(int[] nums) {
			if(nums.length==0)
				return null;
			TreeNode root = new TreeNode();
			help(nums, 0, nums.length - 1, root);
			return root;
		}

		public void help(int[] nums, int left, int right, TreeNode root) {

			if (left <= right) {
				root.val=nums[(left+right)/2];
                
				System.out.println(root.val);
                if(left<=(left + right) / 2 - 1){
                root.left=new TreeNode();
                help(nums, left, (left + right) / 2 - 1, root.left);
                }
                if((left + right) / 2 + 1<=right){
                root.right = new TreeNode();
				help(nums, (left + right) / 2 + 1, right, root.right);
                }
            }
		}
	}
}
