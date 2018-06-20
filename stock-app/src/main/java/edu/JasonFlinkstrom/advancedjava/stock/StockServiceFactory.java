package edu.JasonFlinkstrom.advancedjava.stock;

import javax.validation.constraints.NotNull;

/**
 *  a basic factory class that returns a basic stock service
 */
public class StockServiceFactory{
    /**
     * @return BasicStockService - an implementation of the StockService Interface
     */
    @NotNull
    public static StockService createStockService(){
         return new BasicStockService();
    }
}