import java.util.Stack;

public class MinStackWithTwoStacks {

	private Stack<Integer> dataStack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();

	public void push(int node) {
		dataStack.push(node);
		if (minStack.isEmpty() || minStack.peek() > node) {
			minStack.push(node);
		}
	}

	public void pop() {
		if (dataStack.pop() == minStack.peek()) {
			minStack.pop();
		}
	}

	public int top() {
		return dataStack.peek();
	}

	public int min() {
		return minStack.peek();
	}
}
