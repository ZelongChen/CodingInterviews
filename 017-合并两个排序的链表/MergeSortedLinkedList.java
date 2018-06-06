package Offering;

import LeetCode.Util.ListNode;

public class MergeSortedLinkedList {
	public ListNode MergeWithIteration(ListNode list1,ListNode list2) {
		ListNode head = new ListNode(Integer.MIN_VALUE);
		ListNode previous = null;
		while (list1 != null || list2 != null) {
			ListNode min = null;
			if (list1 == null) {
				min = list2;
				list2 = list2.next;
			} else if (list2 == null) {
				min = list1;
				list1 = list1.next;
			} else if (list1.val < list2.val) {
				min = list1;
				list1 = list1.next;
			} else {
				min = list2;
				list2 = list2.next;
			}
			if (previous == null) {
				previous = min;
				head.next = previous;
			} else {
				previous.next = min;
				previous = min;
			}

		}
		return head.next;
	}

	public ListNode MergeWithRecursive(ListNode list1,ListNode list2) {
		if (list1 == null) return list2;
		if (list2 == null) return list1;

		ListNode head = null;
		if (list1.val < list2.val) {
			head = list1;
			head.next = MergeWithRecursive(list1.next, list2);
		} else {
			head = list2;
			head.next = MergeWithRecursive(list1, list2.next);
		}
		return head;
	}

}
