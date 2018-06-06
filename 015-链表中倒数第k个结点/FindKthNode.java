package Offering;

import LeetCode.Util.ListNode;

import java.util.Stack;

public class FindKthNode {
	public ListNode FindKthToTail(ListNode head, int k) {
		if (k <= 0) return null;
		ListNode first = head;
		ListNode second = head;
		for (int i = 1; i < k; i++) {
			if (first != null) {
				first = first.next;
			} else {
				return null;
			}
		}
		if (first == null) return null;
		while (first.next != null) {
			first = first.next;
			second = second.next;
		}
		return second;
	}

	public ListNode FindKthToTailWithStack(ListNode head, int k) {
		if (k <= 0) return null;
		Stack<ListNode> stack = new Stack<>();
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		if (k > stack.size()) return null;
		int i = 1;
		while (i < k) {
			stack.pop();
			i++;
		}
		return stack.pop();
	}
}
