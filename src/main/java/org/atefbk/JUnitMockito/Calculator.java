package org.atefbk.JUnitMockito;

public class Calculator {
	
	CalculatorService service;
	  
	public Calculator(CalculatorService service) {
		this.service = service;
	}

	public int calculate(int i, int j, int k ) {
		return this.service.add(i, j)*k + 1;
//		return (i+j)*k + 1;
	}

}
