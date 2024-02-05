package First.Code;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubArray {

	static List<Integer> subArraySum(int arr[], int n, int sum) {
		int left = 0, right = 0, s = arr[0];
		List<Integer> indices = new ArrayList<Integer>();
		if (sum == s) {
			System.out.println("Sum found " + 1 + "and" + 1);
		}

		while (right < n - 1) {
			if ((s + arr[right + 1]) <= sum) {
				s += arr[right + 1];
				right++;
			} else {
				s -= arr[left];
				left++;
			}
			if (s == sum) {
				indices.add(left + 1);
				indices.add(right + 1);
				return indices;
			}
		}
		indices.add(-1);
		return indices;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 15;
		int arr2[] = { 1, 2, 3, 7, 5 };
		int sum2 = 12;
		int n = arr2.length;
		List<Integer> indices = subArraySum(arr, n, sum);
		if (indices.get(0) != -1) {
			System.out.println("Sum found between " + indices.get(0) + " and " + indices.get(1));
		} else {
			System.out.println("Sum found in " + indices.get(0));
		}
		List<Integer> indices2 = subArraySum(arr2, n, sum2);
		if (indices2.get(0) != -1) {
			System.out.println("Sum found between " + indices2.get(0) + " and " + indices2.get(1));
		} else {
			System.out.println("Sum found in " + indices2.get(0));
		}
	}

}
