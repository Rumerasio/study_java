package com.java.study.ch02;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		//int 변수 v1 에 초기값 5
		//int 변수 v2 에 초기값 2
		
		int v1 = 5;
		int v2 =2;
		
		// int 변수 result1 에 + 연산 후 출력
		// int 변수 result2 에 - 연산 후 출력
		// int 변수 result3 에 * 연산 후 출력
		// int 변수 result4 에 / 연산 후 출력
		// int 변수 result5 에 % 연산 후 출력
		
		int result1 = v1+v2;
		System.out.println(result1);
		
		int result2 = v1-v2;
		System.out.println(result2);
		
		int result3 = v1*v2;
		System.out.println(result3);
		
		int result4 = v1/v2;
		System.out.println(result4);
		
		int result5 = v1%v2;
		System.out.println(result5);
		
		double result6 = v1/v2;
		System.out.println("정수형 끼리의 계산 result6= "+ result6);
		
		double result7 = (double)v1/v2;
		System.out.println("double 형의 계산 result7= "+ result7);
		
	
	}

}
