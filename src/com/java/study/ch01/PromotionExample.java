package com.java.study.ch01;

public class PromotionExample {

	public static void main(String[] args) {
		// 데이터 타입은 작은것에서 큰것으로의 변환은 문제가 되지않는다. 
		// 하지만 큰것에서 작은 데이터타입으로 변활할 때 문제가 생긴다. 오류가 발생하거나 데이터의 손실이 일어나게된다.
		// byte < short < int < long < float < double
		
		byte byteValue =10;
		System.out.println("byteValue " + byteValue);
		
		int intValue = byteValue;
		System.out.println("intValue " + intValue);
	
		
		double d=3.14159265358579;
		System.out.println(d);
		
		/*
		float e=d; System.out.println(e);
		 */
	
		int intValue3=200;
		System.out.println("intValue3: "+ intValue3 + "입니다");
		
		double doubleValue = intValue3; 
		System.out.println("doubleValue: " + doubleValue + "입니다");
		
	}

}
