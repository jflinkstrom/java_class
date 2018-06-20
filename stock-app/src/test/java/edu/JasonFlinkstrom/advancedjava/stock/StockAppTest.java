package edu.JasonFlinkstrom.advancedjava.stock;

import org.junit.Test;

/**
* Test StockApp class using mockito
* NOTE: does not work yet
 */
public class StockAppTest {
    /**
     * Test that a Null Pointer Exception is thrown when main args are null
     */
    @Test(expected = NullPointerException.class)
    public void StockAppMainNull() {
        StockApp.main(null);
    }

    /**
     * Test that main args are passed and print correctly
     */
    @Test
    public void StockAppMainArgs(){
        String sym = "APPL";
        String from = "01-01-2018";
        String until = "01-05-2018";
        StockApp.main(new String[] {sym, from, until});
    }
}