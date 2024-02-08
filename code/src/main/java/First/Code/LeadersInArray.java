package First.Code;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

	static void findLeaders(int ar[], int n) {
		
		List<Integer> leaders = new ArrayList<Integer>();
		
		if (n == 0) {
			System.out.println("Empty array");
			return;
		}
		     

		if (n == 1) {
			System.out.println(ar[0]);
			return;
		}

		int max = ar[n - 1];
		 leaders.add(max);
		for (int i = n - 2; i >= 0; i--) {
			if (ar[i] > max) {
				leaders.add(ar[i]);
				max = ar[i];
			}
		}
		
		for(int i=leaders.size()-1;i>=0;i--)
			System.out.print(leaders.get(i)+ " ");

	}

	public static void main(String args[]) {
		int ar[] = { 16, 17, 4, 3, 5, 2 };
		int ar1[] = {1,2,3,4,0};
		findLeaders(ar, ar.length);
		System.out.println();
		findLeaders(ar1,ar1.length);
	}
}
