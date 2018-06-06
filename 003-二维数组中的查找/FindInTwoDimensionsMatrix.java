public class FindInTwoDimensionsMatrix {
	public boolean FindBrutal(int target, int [][] array) {
		if (array == null) return false;
		for (int[] row : array) {
			for (int element : row) {
				if (target == element) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean Find(int target, int [][] array) {
		if (array == null) return false;
		int row = 0;
		int column = array[0].length - 1;
		while (row <= array.length - 1 && column >= 0) {
			int current = array[row][column];
			if (target < current) {
				column -= 1;
			}
			if (target > current) {
				row += 1;
			}
			if (target == current) return true;
		}
		return false;
	}
}
