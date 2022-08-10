package com.java.study.ch03;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		/*
		 * for(int i =1 ; i<=9 ; i++) { System.out.println("2 * "+i+" = "+(2*i)); }
		 */
	
		
		// 2단부터 9단까지 출력하는 프로그램 작성 : 6줄 이상 되지않게 작성
		
		for(int i = 2 ; i <=9 ; i++ ) {
			System.out.println(i+"단");
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}

}
