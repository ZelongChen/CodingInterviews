package Offering;

public class Power {
	public double Power(double base, int exponent) {
		if (base == 0 && exponent > 0) return 0;
		if (exponent == 0) return 1;
		if (base == 0 && exponent < 0) {
			throw new IllegalArgumentException("base cannot be zero when exponent is negative");
		}
		double result = 1;
		for (int i = 1; i <= Math.abs(exponent); i++) {
			result *= base;
		}
		if (exponent < 0) {
			return 1 / result;
		} else {
			return result;
		}
	}
}