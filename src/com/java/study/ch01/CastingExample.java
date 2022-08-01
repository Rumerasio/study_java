package com.java.study.ch01;

public class CastingExample {

	public static void main(String[] args) {
		
		// 강제 형변환 : casting : (원하는 형) 변수명
		
		double a = 1.2568453;
		System.out.println("double 변수 a:" +a);
		float b= (float)a;
		System.out.println("double 변수 float으로 casting 후 값:"+b);
		
		//long <- float
		float c = 12.25f;
		System.out.println("float 변수 c:" +c);
		long d= (long)c;
		System.out.println("float 변수 long으로 casting 후 값:"+d);
		
		// int <- long
		long e = 516512351L;
		System.out.println("long 변수 e:" +e);
		int f= (int)e;
		System.out.println("long 변수 int으로 casting 후 값:"+f);
		
		//short <- int
		int g = 184151;
		System.out.println("int 변수 g:" +g);
		short h= (short)g;
		System.out.println("int 변수 short으로 casting 후 값:"+h);
		
		//byte <- short
		short x = 240;
		System.out.println("short 변수 x:" +x);
		byte y= (byte)x;
		System.out.println("short 변수 byte으로 casting 후 값:"+y);
		
		
		//int를 string 으로 
		int aaa = 159845;
		System.out.println("int 변수 aaa:"+aaa);
		String bbb = Integer.toString(aaa);
		String xxx = String.valueOf(aaa);
		System.out.println("String 으로 변환, Integer.toString() :"+bbb);
		System.out.println("String 으로 변환, String.valueOf() : "+ xxx);
		
		
		//int:		원시데이터 
		//integer:	참조데이터
		
		//string을 int로
		String ccc = "19950428";
		System.out.println("String 값 ccc: "+ccc);
		int ddd= Integer.parseInt(ccc);
		System.out.println("int로 변환 후 값: "+ ddd);
	}

}
