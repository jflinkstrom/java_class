package edu.JasonFlinkstrom.advancedjava.stock;

import jdk.nashorn.internal.ir.annotations.Immutable;
import java.math.BigDecimal;
import java.util.Date;

/**
* This class contains information about a stock symbol
 * Class is immutable
 **/
@Immutable
public class StockQuote {

    private final String symbol;
    private final Date date;
    private final BigDecimal price;

    /**
     * Constructor for StockQuote using Dependency Injection
     * @param symbol
     * @param date
     * @param price
     */
    public StockQuote(String symbol, Date date, BigDecimal price) {
        this.symbol = symbol;
        this.date = date;
        this.price = price;
    }

    /**
     * @return symbol that represents a company's stock
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @return date that represents a a start date and/or end date
     */
    public Date getDate(){ return date; }

    /**
     * @return a BigDecimal that represents a stock price
     */
    public BigDecimal getPrice() { return price; }

    @Override
    public String toString() {

       return " Stock: " + symbol +
               " Price: " + price +
               " Date: " + date;
    }
}