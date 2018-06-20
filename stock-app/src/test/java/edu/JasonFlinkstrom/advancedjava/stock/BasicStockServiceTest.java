package edu.JasonFlinkstrom.advancedjava.stock;

import org.junit.Test;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;

/**
* Unit Test for BasicStockService class
 */
public class BasicStockServiceTest {

   private BasicStockService basicStockService = new BasicStockService();
   private String symbol = "APPL";
   private Interval interval = Interval.DAILY;
   private Date date = new Date();

    /**
    * Test verifies getQuote returns correct symbol
     */
    @Test
    public void getQuotePosTest() {
        StockQuote result = basicStockService.getQuote(symbol);
        assertEquals(result.getSymbol(), "APPL");
    }

    /**
    * Test verifies getQuote returns null
     */
    @Test
    public void getQuoteNegTest(){
        StockQuote result = basicStockService.getQuote(null);
        assertNull(result.getSymbol());
    }

    /**
     * Test verifies second getListQuote is not null
     */
    @Test
    public void getListQuotePosTest(){
        Calendar from = Calendar.getInstance();
        from.setTime(date);

        Calendar until = Calendar.getInstance();
        until.setTime(date);
        until.add(Calendar.DAY_OF_YEAR, 1);

        List<StockQuote> stockQuote = basicStockService.getQuote(symbol, from, until);

        assertNotNull(stockQuote);
    }

    /**
     * Test verifies third method of getListQuote is not null
     */
    @Test
    public void getListQuoteIntervalTest(){
        Calendar from = Calendar.getInstance();
        from.setTime(date);

        Calendar until = Calendar.getInstance();
        until.setTime(date);
        until.add(Calendar.DAY_OF_YEAR, 1);

        List<StockQuote> stockQuote = basicStockService.getQuote(symbol, from, until, interval);

        assertNotNull(stockQuote);
    }
}