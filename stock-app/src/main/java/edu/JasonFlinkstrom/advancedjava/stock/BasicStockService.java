package edu.JasonFlinkstrom.advancedjava.stock;

import java.math.BigDecimal;
import java.util.*;
/**
 * A class that implements StockService and returns an instance of StockQuote
 */
public class BasicStockService implements StockService {

    /**
     * @param symbol the stock symbol of the company you want a quote for.
     * e.g. APPL for APPLE
     * @return instance of StockQuote
     */
    @Override
    public StockQuote getQuote(String symbol) {
        return new StockQuote(symbol, Calendar.getInstance().getTime(), new BigDecimal(100));
    }

    /**
     * Get a historical list of stock quotes for the provided
     * symbol
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @return a list of StockQuote instances.
     * One for each day in the range specified.
     */
    @Override
    public List<StockQuote> getQuote(String symbol, Calendar from,
                                     Calendar until){
        Date start = from.getTime();
        Date end = until.getTime();

        Calendar calFrom = Calendar.getInstance();
        calFrom.setTime(start);

        List<StockQuote> stockQuote = new ArrayList<>();

        while(start.before(end)) {
            stockQuote.add(new StockQuote(symbol, start, new BigDecimal(100)));
            calFrom.setTime(start);
            calFrom.add(Calendar.DAY_OF_YEAR, 1);
            start = calFrom.getTime();
        }
        return stockQuote;
    }

    /**
    *  Get a historical list of stock quotes for the
     * provide symbol
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @param interval a unit of time
     *                 ex) DAILY = once every 24 hours, HALFDAY = every 12 hours, HOURLY = every 1 hour
     * @return a list of StockQuote instances in the range specified.
     */
    @Override
    public List<StockQuote> getQuote(String symbol, Calendar from, Calendar until, Interval interval){
        Date start = from.getTime();
        Date end = until.getTime();
        int intTime = 0;

        Calendar calFrom = Calendar.getInstance();
        calFrom.setTime(start);

        List<StockQuote> stockQuote = new ArrayList<>();

        switch(interval){
            case DAILY: intTime = 24;
                break;
            case HALFDAY: intTime = 12;
                break;
            case HOURLY: intTime = 1;
                break;
            default : break;
        }

        while(start.before(end)) {
            stockQuote.add(new StockQuote(symbol, start, new BigDecimal (100)));
            calFrom.setTime(start);
            calFrom.add(Calendar.HOUR_OF_DAY, intTime);
            start = calFrom.getTime();
        }
        return stockQuote;
    }
}
