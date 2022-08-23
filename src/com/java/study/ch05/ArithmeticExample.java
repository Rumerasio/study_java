package com.java.study.ch05;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		ArithmeticOperation calculator = new ArithmeticOperation();
		
		calculator.show(calculator.sum(50,70));
		calculator.show(calculator.minus(100,5));
		calculator.show(calculator.multiply(13,18));
		calculator.show(calculator.divide(100,8));
		
		calculator.stick("덧셈",calculator.show(calculator.sum(50,70)));
	}

}
