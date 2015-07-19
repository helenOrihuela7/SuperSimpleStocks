package com.jpmtest.stock.simplestock;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SimpleStockTest {

	public SimpleStock createSimpleStock(String stockSymbol, String type, int fixedDividend, int lastDividend,
			int parValue) {
		SimpleStock sstock = new SimpleStock();
		sstock.setStockSymbol(stockSymbol);
		sstock.setType(type);
		sstock.setFixedDividend(fixedDividend);
		sstock.setLastDividend(lastDividend);
		sstock.setParValue(parValue);
		return sstock;
	}

	protected void addSimpleStock(SimpleStock ss) {

	}

}
