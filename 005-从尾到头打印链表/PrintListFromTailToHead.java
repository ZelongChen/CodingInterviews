package Offering;

import LeetCode.Util.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {
	private ArrayList<Integer> result = new ArrayList<>();

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		addNodeToResult(listNode);
		return result;
	}

	private void addNodeToResult(ListNode listNode) {
		if (listNode != null) {
			addNodeToResult(listNode.next);
			result.add(listNode.val);
		}
	}

	public ArrayList<Integer> printListFromTailToHeadWithStack(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		ListNode currentNode = listNode;
		while (currentNode != null) {
			stack.add(currentNode.val);
			currentNode = currentNode.next;
		}

		while (!stack.isEmpty()) {
			result.add(stack.pop());
		}
		return result;
	}
}
