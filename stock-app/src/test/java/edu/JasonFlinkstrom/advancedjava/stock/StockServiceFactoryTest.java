package edu.JasonFlinkstrom.advancedjava.stock;
import org.junit.Test;
import static org.junit.Assert.*;
/**
* Unit Test for StockServiceFactory class
 */
public class StockServiceFactoryTest {
    /**
    * Verifies method createStockService is an instance of StockService
     */
    @Test
    public void createStockServicePosTest() {
        StockServiceFactory stockServiceFactory = new StockServiceFactory();
        assertEquals("BasicStockService is an instance of StockService",
                true, stockServiceFactory.createStockService() instanceof BasicStockService);
    }
    /**
    * Verifies method createStockService is NOT an instance of StockQuote
     */
    @Test
    public void createStockServiceNegTest(){
        StockServiceFactory stockServiceFactory = new StockServiceFactory();
        assertEquals("BasicStockService is NOT an instance of StockService",
                false, stockServiceFactory.createStockService() instanceof StockQuote);
    }
}