package com.java.study.ch01;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환(promotion)
		// 데이터 타입은 작은것에서 큰것으로의 변환은 문제가 되지않는다.
		// 하지만 큰것에서 작은 데이터타입으로 변활할 때 문제가 생긴다. (Casting) 오류가 발생하거나 데이터의 손실이 일어나게된다.
		// byte < short < int < long < float < double

		// promotion
		/*
		 * byte byteValue =10; System.out.println("byteValue " + byteValue);
		 * 
		 * int intValue = byteValue; System.out.println("intValue " + intValue);
		 * 
		 * 
		 * double d=3.14159265358579; System.out.println(d);
		 * 
		 * 
		 * float e=d; System.out.println(e);
		 * 
		 * 
		 * int intValue3=200; System.out.println("intValue3: "+ intValue3 + "입니다");
		 * 
		 * double doubleValue = intValue3; System.out.println("doubleValue: " +
		 * doubleValue + "입니다");
		 */

		// int 에 short 대입 후 출력
		short x = 250;
		System.out.println("short 값:" + x);
		int y = x;
		System.out.println("int로 변환 후 의 값:" + y);

		// long 에 int 대입 후 출력
		int a = 180;
		System.out.println("int 값:" + a);
		long b = a;
		System.out.println("long로 변환 후 의 값:" + b);

		// float 에 long 대입 후 출력
		long za = 899999l;
		System.out.println("long 값:" + za);
		float zb = za;
		System.out.println("float로 변환 후 의 값:" + zb);

		// double 에 float 대입 후 출력
		float aa = 4.989f;
		System.out.println("float 값:" + aa);
		double bb = aa;
		System.out.println("double로 변환 후 의 값:" + bb);
	}

}
