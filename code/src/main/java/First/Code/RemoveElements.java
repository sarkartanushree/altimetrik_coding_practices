package First.Code;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveElements {

	public static void main(String args[]) {
		int ar[] = { 10, 20, 20, 30 };
		removeElements(ar, ar.length);
	}

	private static void removeElements(int[] ar, int n) {

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsValue(ar[i])) {
				map.remove(i);
			} else
				map.put(i, ar[i]);
		}

		for (Map.Entry<Integer, Integer> num : map.entrySet()) {
			System.out.print(num.getValue() + " ");
		}
	}

}
