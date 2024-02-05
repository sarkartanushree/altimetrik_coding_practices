package First.Code;

public class BuyAndSell 
{
	static int maxProfit(int[] prices, int n)
	{
	    int maxProfit = 0, currentDay = n - 1;
	 
	    while (currentDay > 0) 
	    {
	        int day = currentDay - 1;
	        while (day >= 0 && 
	            (prices[currentDay] > prices[day])) 
	        {
	        	maxProfit = maxProfit + (prices[currentDay] - 
	                    prices[day]);
	 
	            day--;
	        }
	        currentDay = day;
	    }
	 	    return maxProfit;
	}
	 
	public static void main(String[] args)
	{
	    int prices[] = { 2, 3, 5 };
	    //int prices[] = { 8, 5, 1 };
	 	 
	    System.out.print(maxProfit(prices, prices.length));
	}
}


