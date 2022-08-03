package com.java.study.ch02;

public class ArithmeticOperatorTr {

	public static void main(String[] args) {
		
		double result1;
		result1 = (((double)5/3) -((double)5/8))* (9+((double)4/5));
		System.out.println(result1);
		
		
		int a =5;
		double b = 3.25;
		double c = 1+(double)5/6;
		double d = (double)12/17;
		
		double result2;
		result2 = a-(b-c)*d;
		System.out.println(result2);
		
		int num1=8,num2=7,num3=5;
		int answer1=num1+num2+num3;
		System.out.println(num1+" + "+num2+" + "+num3+" = "+answer1);
		
		int num4=1,num5=9,num6=5;
		int answer2=num4+num5+num6;
		System.out.println(num4+" + "+num5+" + "+num6+" = "+answer2);
		
		int a3=5,b3=6,c3=6;
		int ans3=a3+b3+c3;
		System.out.println(a3+" + "+b3+" + "+c3+" = "+ans3);
		
		sum(5,7,9);
		sum(6,1,85);
		
		avg("홍길동",60,70,85,90,45);
		avg("박말순",50,75,70,60,70);
		avg("고장난",55,60,64,58,90);
		avg("도룡뇽",80,70,63,88,78);
		
		
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
	}
	
	public static void avg(String name, int eng, int math, int physic, int music, int PE) {
		double avg = ((double)eng + math+ physic+music+PE)/5;
		System.out.println(name+"님의 평균 점수는 "+avg+ "점입니다.");
	}

}
