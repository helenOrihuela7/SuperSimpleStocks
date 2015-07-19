package com.jpmtest.stock.simplestock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.joda.time.DateTime;

public class StockCollectionImpl implements StockCollection {

	private HashMap<String, SimpleStock> simpleStockCollection;
	private HashMap<String, List<Trade>> stockTrades;

	public void addSimpleStock(SimpleStock ss) {
		simpleStockCollection.put(ss.getStockSymbol(), ss);

	}

	public Set<SimpleStock> getAllSimpleStocks() {
		Set<SimpleStock> stockList = new HashSet<SimpleStock>(simpleStockCollection.values());
		return stockList;
	}

	public SimpleStock getStock(String stockSymbol) {
		return simpleStockCollection.get(stockSymbol);
	}

	public double getDividendYield(SimpleStock ss) {
		double dividendYield;
		if (ss.getType().equals("Common")) {
			dividendYield = ss.getLastDividend() / getPrice(ss);
		} else {
			dividendYield = (ss.getFixedDividend() * ss.getParValue()) / getPrice(ss);
		}
		return dividendYield;
	}

	public double getRatio(SimpleStock ss) {

		return getPrice(ss) / getDividendYield(ss);
	}

	public double getPrice(SimpleStock ss) {
		List<Trade> listTrades = stockTrades.get(ss.getStockSymbol());
		for(Trade tr: listTrades){
			
		}
		return 0;
	}

	public double getGBCE() {
		double multPrices=1.0;
		for(SimpleStock ss: simpleStockCollection.values()){
			multPrices= multPrices*getPrice(ss);
		}
		return Math.pow(multPrices, 1/simpleStockCollection.size());
	}

	public void addTrade(SimpleStock ss,int quantity,String indicator, double price) {
		Trade trade = new Trade(DateTime.now(),quantity,indicator,price);
		if (stockTrades.get(ss.getStockSymbol()).size() > 0) {
			stockTrades.get(ss.getStockSymbol()).add(trade);
		} else {
			List<Trade> trades = new ArrayList<Trade>();
			trades.add(trade);
			stockTrades.put(ss.getStockSymbol(), trades);
		}

	}

}
