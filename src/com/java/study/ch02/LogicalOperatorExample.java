package com.java.study.ch02;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// && = &: and 
		// || = |: or 
		
		int a =65;
		if(a>=65 & a<=90) {
			System.out.println("a는 65이상 90이하인 값이다.");
		}
		if(a>=65 && a<=90) {
			System.out.println("a는 65이상 90이하인 값이다.");
		}
		
		if(a>=65 | a<=90) {
			System.out.println("a는 65이상이거나 90이하인 값이다.");
		}
		
		if(a>=66 || a<=90) {
			System.out.println("a는 66이상이거나 90이하인 값이다.");
		}
		
		if(a>=66 | a<=30) {
			System.out.println("a는 66이상이거나, 30 이하인 값이다.");
		}
		
		if(a>=65 ^ a<=70) { // ^ 배타적 논리합  XOR: 참 참
			System.out.println("참 거짓 or 거짓 참 이어야 보인다1");
		}
		
		if(a>=66 ^ a<=30) { // ^ 배타적 논리합  XOR: 거짓 거짓
			System.out.println("참 거짓 or 거짓 참 이어야 보인다2");
		}
		
		if(a>=65 ^ a<=30) { // ^ 배타적 논리합  XOR: 참 거짓
			System.out.println("참 거짓 or 거짓 참 이어야 보인다3");
		}
	}

}

