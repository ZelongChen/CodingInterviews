package Offering;

import LeetCode.Util.TreeNode;

public class HasSubTree {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if (root2 == null) return false;
		if (root1 == null) return false;
		boolean doesHasChild = false;
		if (root1.val == root2.val) {
			doesHasChild = DoesParentHasChild(root1, root2);
		}
		if (!doesHasChild) {
			return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
		} else {
			return true;
		}
	}

	public boolean DoesParentHasChild(TreeNode parent, TreeNode child) {
		if (child == null) return true;
		if (parent == null) return false;
		if (parent.val == child.val) {
			return DoesParentHasChild(parent.left, child.left) && DoesParentHasChild(parent.right, child.right);
		} else {
			return false;
		}
	}
}
