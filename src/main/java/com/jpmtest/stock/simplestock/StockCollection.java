package com.jpmtest.stock.simplestock;

import java.util.Set;

public interface StockCollection {
	public void addSimpleStock(SimpleStock ss);

	public Set<SimpleStock> getAllSimpleStocks();

	public SimpleStock getStock(String stockSymbol);

	public double getDividendYield(SimpleStock ss);

	public double getRatio(SimpleStock ss);

	public double getPrice(SimpleStock ss);

	public double getGBCE();

	public void addTrade(SimpleStock ss,int quantity,String indicator, double price);

}
