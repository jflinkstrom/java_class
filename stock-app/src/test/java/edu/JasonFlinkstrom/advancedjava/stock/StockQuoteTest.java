package edu.JasonFlinkstrom.advancedjava.stock;

import org.junit.Test;
import java.math.BigDecimal;
import java.util.Date;
import static org.junit.Assert.*;

/**
* Unit test for StockQuote class
 */
public class StockQuoteTest {
    /**
    * Test verifies getSymbol, getDate, and getPrice return correct variable
     */
    @Test
    public void getStockQuotePosTest() {
        String symbol = "APPL";
        Date date = new Date();
        BigDecimal price = new BigDecimal(100);

        StockQuote stockQuote = new StockQuote(symbol, date, price);
        assertEquals(symbol, stockQuote.getSymbol());
        assertEquals(date, stockQuote.getDate());
        assertEquals(price, stockQuote.getPrice());
    }
    /**
    * Test verifies that getSymbol, getDate, and getPrice are null
     */
    @Test
    public void getSymbolNegTest(){
        StockQuote stockQuote = new StockQuote(null, null, null);
        assertNull(stockQuote.getSymbol());
        assertNull(stockQuote.getDate());
        assertNull(stockQuote.getPrice());
    }
}