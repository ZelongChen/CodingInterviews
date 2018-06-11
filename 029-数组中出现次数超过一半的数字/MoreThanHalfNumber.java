import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNumber {
	public int MoreThanHalfNum_Solution_With_Map(int [] array) {
		if (array == null || array.length == 0) return 0;
		if (array.length == 1) return array[0];
		Map<Integer, Integer> count = new HashMap<>();
		for (int number : array) {
			Integer oldValue = count.computeIfAbsent(number, key -> 0);
			count.put(number, oldValue + 1);
		}
		int length = array.length / 2;
		for (int number : array) {
			Integer value = count.get(number);
			if (value > length) {
				return number;
			}
		}
		return 0;
	}

	public int MoreThanHalfNum_Solution(int [] array) {
		if (array == null || array.length == 0) return 0;
		if (array.length == 1) return array[0];
		int current = array[0];
		int count = 1;
		for (int i = 1; i < array.length; i++) {
			int number = array[i];
			if (count == 0) {
				current = number;
				count = 1;
			} else {
				if (current == number) {
					count++;
				} else {
					count--;
				}
			}
		}
		count = 0;
		for (int number : array) {
			if (number == current) {
				count++;
			}
		}
		if (count > array.length / 2) {
			return current;
		}
		return 0;
	}

	public static void main(String[] args) {
		MoreThanHalfNumber m = new MoreThanHalfNumber();
		m.MoreThanHalfNum_Solution(new int[] {1,2,3,2,2,2,5,4,2});
	}
}
