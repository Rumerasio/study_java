package com.java.study.ch01;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'a';		//문자를 저장
		String s1="ab";	
		char c2 = 65;		//십진수로 저장
		char c3 = '\u0041';	//16진수로 저장
		char c4 = '갉';
		
		
		System.out.println(c4);
		System.out.println((int)c4);
		System.out.println((int)c1);
		System.out.println(s1);
		System.out.println(c1+"A");
		System.out.println(c2);
		System.out.println(c3);
	}

}
