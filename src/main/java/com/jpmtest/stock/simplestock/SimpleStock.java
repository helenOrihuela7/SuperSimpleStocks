package com.jpmtest.stock.simplestock;

/**
 * Hello world!
 *
 */
public class SimpleStock 
{
	private String stockSymbol;
	private String type;
	private int lastDividend;
	private int fixedDividend;
	private int parValue;
	
	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getLastDividend() {
		return lastDividend;
	}

	public void setLastDividend(int lastDividend) {
		this.lastDividend = lastDividend;
	}
	
	public int getFixedDividend() {
		return fixedDividend;
	}

	public void setFixedDividend(int fixedDividend) {
		this.fixedDividend = fixedDividend;
	}
	
	public int getParValue() {
		return parValue;
	}

	public void setParValue(int parValue) {
		this.parValue = parValue;
	}

}
