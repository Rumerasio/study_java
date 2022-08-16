package com.java.study.ch03;

public class ForExample {

	public static void main(String[] args) {

		//1
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		//2
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		//3 
		for(int i =1;i<=10;i++) {
			if(i == 10) {
				for(int j =1;j<=i-1;j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j =1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
	}

}
