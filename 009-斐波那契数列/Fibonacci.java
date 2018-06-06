package Offering;

public class Fibonacci {
	public int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		int n_1 = 1;
		int n_2 = 0;
		int result = 0;
		for (int i = 2; i <= n; i++) {
			result = n_1 + n_2;
			n_2 = n_1;
			n_1 = result;
		}
		return result;
	}
}
