package com.IT7320.Assignment3_demo;

public class CalImplementation implements ICalculator {
	
	ICalculator obj;

	public int add(int x, int y) {
	
		return obj.add(x, y);
	}

	public int subtract(int x, int y) {
	
		return obj.subtract(x, y);
	}

	public int multiply(int x, int y) {
	
		return obj.multiply(x, y);
	}

	public double divide(int x, int y) {
	
		return obj.divide(x, y);
	}
	public void setObj(ICalculator obj) {
		this.obj =obj;
	};
	

}
