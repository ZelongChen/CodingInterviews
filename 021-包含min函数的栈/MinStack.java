import java.util.Stack;

public class MinStack {

	private Stack<Integer> stack = new Stack<>();
	private int min = Integer.MAX_VALUE;

	public void push(int node) {
		if (node < min) {
			stack.push(min);
			min = node;
		}
		stack.push(node);
	}

	public void pop() {
		if (stack.pop() == min) {
			min = stack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int min() {
		return min;
	}

}
