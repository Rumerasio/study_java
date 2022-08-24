package com.java.study.ch05;

public class ArithmeticOperation {
	
	//덧셈
	public int sum (int a,int b) {
		int result=a+b;
		return result;
	}
	//뺄셈
	public int minus (int a,int b) {
		int result=a-b;
		return result;
	}
	//곱셈
	public int multiply (int a,int b) {
		int result=a*b;
		return result;
	}
	//나눗셈
	public double divide (int a,int b) {
		double result=(double)a/b;
		return result;
	}
	//double > String 하고 출력 / 만든 문장 String 값 리턴
	public String show(double i) {
		System.out.println("계산한 값은 "+String.valueOf(i)+" 입니다");
		String result="계산한 값은 "+String.valueOf(i)+" 입니다";
		return result;
	}
	// String 두개 ": "하나 두고 합체
	public void stick(String a, String b) {
		System.out.println(a+": "+b);
	}
	
	public String aaa(int a) {
		return "";
	}
	public boolean bbb(int a) {
		return true;
	}
	public double ccc(int a) {
		return 1.1;
	}
	public void ddd(int a) {
	}
	static void staticTest() {
		System.out.println("I'm the Legend");
	}
}
