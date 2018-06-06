public class ReConstructBinaryTree {
	public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
		if (pre == null || in == null) return null;
		if (pre.length != in.length) return null;
		if (pre.length == 0 && in.length == 0) return null;
		TreeNode root = new TreeNode(pre[0]);
		int rootOfIn = 0;
		for (; rootOfIn < in.length; rootOfIn++) {
			if (in[rootOfIn] == root.val) {
				break;
			}
		}
		int[] subLeftPre = new int[rootOfIn];
		int[] subLeftIn = new int[rootOfIn];
		for (int i = 0; i < rootOfIn; i++) {
			subLeftPre[i] = pre[i + 1];
			subLeftIn[i] = in[i];
		}
		root.left = reConstructBinaryTree(subLeftPre, subLeftIn);

		int[] subRightPre = new int[in.length - rootOfIn - 1];
		int[] subRightIn = new int[in.length - rootOfIn - 1];
		for (int i = 0; i + rootOfIn + 1< in.length; i++) {
			subRightPre[i] = pre[i + 1 + subLeftPre.length];
			subRightIn[i] = in[i + rootOfIn + 1];
		}
		root.right = reConstructBinaryTree(subRightPre, subRightIn);

		return root;
	}

	public static void main(String[] args) {
		ReConstructBinaryTree re = new ReConstructBinaryTree();
		re.reConstructBinaryTree(new int[]{1,2,4,3,5,6}, new int[]{4,2,1,5,3,6});
	}
}
