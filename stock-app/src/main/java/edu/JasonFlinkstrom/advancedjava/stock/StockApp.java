package edu.JasonFlinkstrom.advancedjava.stock;

import java.util.*;

/**
 * StockApp program prints out a range of stock symbols based on a given date range
 * @author jason
 * @version 1.0
 */
public class StockApp {

    /**
     * main method, prints out the three "getQuote" methods
     * @param args
     */
    public static void main(String[] args) {

        /**
        *first getQuote method
         */
        StockService stockService = StockServiceFactory.createStockService();
         System.out.println(stockService.getQuote(args[0]));

        /**
        *second getQuote method
         */
        List<StockQuote> stockQuote = stockService.getQuote(args[0], parseDate.getParseDate(args[1]),
                                                            parseDate.getParseDate(args[2]));
         System.out.println(stockQuote);


        /**
         * third method
         */
        Interval interval = Interval.DAILY;

        StockService stock = StockServiceFactory.createStockService();
        List<StockQuote> stockQ = stock.getQuote(args[0], parseDate.getParseDate(args[1]),
                                                        parseDate.getParseDate(args[2]), interval);
         System.out.println(stockQ);
        }
}
