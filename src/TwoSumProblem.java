import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 18;
		int[] indexes = twoSum(numbers, target);
		for (int index : indexes) {
			System.out.print(index + " ");
		}
	}

	public static int[] twoSum(int[] number, int target) {
		if (number == null || number.length < 2) {
			return new int[] { -1, -1 };
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < number.length; i++) {
			if (map.containsKey(number[i])) {
				return new int[] { map.get(number[i]), i };
			} else {
				map.put(target - number[i], i);
			}
		}
		return new int[] { -1, -1 };
	}
}
