import java.util.ArrayList;

public class FindPath {
	private ArrayList<ArrayList<Integer>> result = new ArrayList<>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null) return result;
		ArrayList<Integer> path = new ArrayList<>();
		FindPath(root, path, target, 0);
		return result;
	}

	private void FindPath(TreeNode node, ArrayList<Integer> path , int target, int currentSum) {
		currentSum += node.val;
		path.add(node.val);

		if (currentSum == target && node.left == null && node.right == null) {
			result.add(new ArrayList<>(path));
		}

		if (node.left != null) {
			FindPath(node.left, path, target, currentSum);
		}

		if (node.right != null) {
			FindPath(node.right, path, target, currentSum);
		}

		path.remove(path.size() - 1);
	}
}
