package First.Code;

public class BuyAndSell 
{
	static int maxProfit(int[] prices, int n)
	{
	    int profit = 0, currentDay = n - 1;
	 
	    // Start from the last day
	    while (currentDay > 0) 
	    {
	        int day = currentDay - 1;
	 
	        // Traverse and keep adding the
	        // profit until a day with
	        // price of stock higher
	        // than currentDay is obtained
	        while (day >= 0 && 
	            (prices[currentDay] > prices[day])) 
	        {
	            profit = profit + (prices[currentDay] - 
	                    prices[day]);
	 
	            day--;
	        }
	 
	        // Set this day as currentDay
	        // with maximum cost of stock
	        // currently
	        currentDay = day;
	    }
	 
	    // Return the profit
	    return profit;
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    // Given array of prices
	    int prices[] = { 2, 3, 5 };
	    //int prices[] = { 8, 5, 1 };
	 
	    int N = prices.length;
	 
	    System.out.print(maxProfit(prices, N));
	}
}


