import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Permutation {
	private Set<String> set = new TreeSet<>();

	public ArrayList<String> Permutation(String str) {
		ArrayList<String> result = new ArrayList<>();
		if (str == null || str.length() == 0) {
			return result;
		}
		Permutation("", str);
		result.addAll(set);
		return result;
	}

	private void Permutation(String prefix, String str) {
		if (str.length() == 0) {
			set.add(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				Permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
			}
		}
	}
}
