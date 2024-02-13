package First.Code;

import java.util.ArrayList;
import java.util.List;

public class RemoveNumbers {

	public static List<String> removeNumbers(List<String> list) {
		List<String> modifiedList = new ArrayList<>();

		for (String str : list) {
			// Check if the string contains only letters
			if (str.matches("[a-zA-Z]+")) {
				modifiedList.add(str);
			}
		}

		return modifiedList;
	}

	public static void main(String[] args) {

		// {"ab","orange","1","apple","4","7","guava"}
		List<String> list = new ArrayList<String>();
		list.add("ab");
		list.add("Orange");
		list.add("1");
		list.add("apple");
		list.add("4");
		list.add("7");
		list.add("guava");

		List<String> modifiedList = removeNumbers(list);
        System.out.println("Modified List: " + modifiedList);


	}

}
