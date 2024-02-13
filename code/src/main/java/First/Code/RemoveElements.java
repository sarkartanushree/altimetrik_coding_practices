package First.Code;

public class RemoveElements {

	public static void main(String args[]) {
		int ar[] = { 10, 20, 20, 30 };
		int newLength = removeDuplicates(ar);

		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(ar[i] + " ");
		}
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;

		int uniqueCount = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[uniqueCount] = nums[i];
				uniqueCount++;
			}
		}

		return uniqueCount;
	}

}
