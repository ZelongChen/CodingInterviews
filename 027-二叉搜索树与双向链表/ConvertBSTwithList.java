import java.util.ArrayList;
import java.util.List;

public class ConvertBSTwithList {
	public TreeNode Convert(TreeNode pRootOfTree) {
		List<TreeNode> list = new ArrayList<>();
		findNode(list, pRootOfTree);
		if (list.size() <=1) return pRootOfTree;
		for (int i = 1; i < list.size() - 1; i++) {
			if (i == 1) {
				list.get(0).right = list.get(1);
			}
			if (i == list.size() - 2) {
				list.get(i + 1).left = list.get(i);
			}
			list.get(i).left = list.get(i - 1);
			list.get(i).right = list.get(i + 1);
		}

		return list.get(0);
	}

	private void findNode(List<TreeNode> list, TreeNode node) {
		if (node == null) {
			return;
		} else if (node.left == null && node.right == null) {
			list.add(node);
		} else {
			if (node.left != null) {
				findNode(list, node.left);
			}
			list.add(node);
			if (node.right != null) {
				findNode(list, node.right);
			}
		}
	}

}
