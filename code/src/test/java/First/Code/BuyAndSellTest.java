package First.Code;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BuyAndSellTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMaxProfit()
    {
    	int prices[] = { 2, 3, 5 };
	    int prices2[] = { 8, 5, 1 };
	    	    
	    assertEquals(5,BuyAndSell.maxProfit(prices, prices.length));
	    assertEquals(0,BuyAndSell.maxProfit(prices2, prices2.length));  
    }
}
