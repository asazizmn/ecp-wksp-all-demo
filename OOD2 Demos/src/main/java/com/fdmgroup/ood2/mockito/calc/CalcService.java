package com.fdmgroup.ood2.mockito.calc;

public class CalcService {
	
	private AddService addService;
	
	public CalcService(AddService addService) {
		this.addService = addService;
	}

	public int calc(int num1, int num2) {
		return addService.add(num1, num2);
	}

}