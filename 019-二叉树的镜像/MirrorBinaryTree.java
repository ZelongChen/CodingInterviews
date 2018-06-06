public class MirrorBinaryTree {
	public void MirrorWithRecursive(TreeNode root) {
		if (root != null) {
			TreeNode left = root.left;
			TreeNode right = root.right;
			root.left = right;
			root.right = left;
			MirrorWithRecursive(root.left);
			MirrorWithRecursive(root.right);
		}
	}
}
