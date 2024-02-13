package First.Code;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {

	public static void main(String args[]) {

		String str = "Java developers are jool Dudes".toLowerCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			} else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}

		for (Map.Entry<Character, Integer> elem : map.entrySet()) {
			if (elem.getValue() == 1) {
				System.out.println("First non repeating character: " + elem.getKey());
				return;
			}
		}

	}

}
