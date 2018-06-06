package Offering;

import LeetCode.Util.ListNode;

import java.util.Stack;

public class ReverseLinkedList {

	public static ListNode ReverseListWithStack(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		ListNode newHead = null;
		ListNode newTail = null;
		while (!stack.isEmpty()) {
			ListNode node = stack.pop();
			if (newHead == null) {
				newHead = node;
				newTail = node;
			}
			newTail.next = node;
			newTail = node;
		}
		if (newTail != null) {
			newTail.next = null;
		}
		return newHead;
	}

	public static ListNode ReverseListWithPointer(ListNode head) {
		ListNode previous = null;
		ListNode current = null;
		while (head != null) {
			current = new ListNode(head.val);
			current.next = previous;
			head = head.next;
			previous = current;
		}
		return current;
	}

	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		one.next = two;
		two.next = three;

		System.out.println(ReverseListWithPointer(one).val);
	}

}
