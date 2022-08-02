package com.java.study.ch02;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		
		boolean play= true;
		
		System.out.println("play: " + play);
		
		// 논리부정 연산자 : !
		play=!play;
		System.out.println("play: " + play);
		
		play=!play;
		System.out.println("play: " + play);
		
		int j =3;
		
		if(!(j==3)) {
			System.out.println("j 는 3 아님");
		}
		else {
			System.out.println("j 는 3임");
		}
	}

}
