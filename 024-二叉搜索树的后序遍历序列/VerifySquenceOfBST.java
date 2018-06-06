public class VerifySquenceOfBST {
	public boolean VerifySquenceOfBST(int [] sequence) {
		if (sequence.length == 0) return false;
		return verify(sequence, 0, sequence.length - 1);
	}

	private boolean verify(int[] sequence, int start, int end) {
		if (start >= end) return true;
		int right = end - 1;
		while (right > 0 && sequence[right] > sequence[end]) {
			right--;
		}
		int left = start;
		while (left < right && sequence[left] < sequence[end]) {
			left++;
		}
		if (left < right) {
			return false;
		}
		return verify(sequence, start, left - 1) && verify(sequence, right + 1, end - 1);
	}

	public static void main(String[] args) {
		int[] sequence = new int[]{5,4,3,2,1};
		new VerifySquenceOfBST().VerifySquenceOfBST(sequence);
	}
}
