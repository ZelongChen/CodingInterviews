import java.util.HashMap;
import java.util.Map;

public class CloneLinkedList {

	public static RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null) return null;
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		RandomListNode oldHead = pHead;
		RandomListNode head = null;
		RandomListNode current = null;
		while (pHead != null) {
			RandomListNode node = map.get(pHead);
			if (node == null) {
				node = new RandomListNode(pHead.label);
				map.put(pHead, node);
			}
			if (head == null) {
				head = node;
			}
			if (current == null) {
				current = node;
			} else {
				current.next = node;
				current = current.next;
			}
			pHead = pHead.next;
		}
		RandomListNode newHead = head;
		while (oldHead != null) {
			RandomListNode random = oldHead.random;
			if (random != null) {
				newHead.random = map.get(random);
			}
			oldHead = oldHead.next;
			newHead = newHead.next;
		}
		return head;
	}

}
