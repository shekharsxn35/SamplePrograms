import java.util.Arrays;

public class ThreeSumProblem {

	public static void main(String[] args) {
		int[] numbers = { -1, 2, 1, -4 };
		int target = 1;
		System.out.println(threeSumCloset(numbers, target));
	}

	public static int threeSumCloset(int[] numbers, int target) {
		if (numbers == null || numbers.length < 3) {
			return -1;
		}
		Arrays.sort(numbers);
		int min = Integer.MAX_VALUE;
		int result = 0;
		for (int i = 0; i < numbers.length; i++) {
			int j = i + 1;
			int k = numbers.length - 1;
			while (j < k) {
				int sum = numbers[i] + numbers[j] + numbers[k];
				int diff = Math.abs(sum - target);
				if (diff == 0) {
					return sum;
				}

				if (diff < min) {
					min = diff;
					result = sum;
				}
				if (sum <= target) {
					j++;
				} else {
					k--;
				}
			}
		}

		return result;
	}

}
