package com.java.study.ch03;

public class Skndkfnsldfsf {

	public static void main(String[] args) {
		
		
		int x = (int) (Math.random()*2 +1); //1~2 랜덤 정수 뽑기
		int y = (int) (Math.random()*2 +1);
		
		for(int i = 1; y == x ; i++) {
			System.out.println("같아서 다시 돌류 "+i+"번째");
			y = (int) (Math.random()*2 +1);
		}
		System.out.println(x+" "+y);
		
		// 중복시 다시 돌리기 
		
		int a = (int) (Math.random()*2 +1); 
		int b = (int) (Math.random()*2 +1);
		int c = (int) (Math.random()*2 +1);
		int d = (int) (Math.random()*2 +1);
		int e = (int) (Math.random()*2 +1);
		
		for(int i = 1; b == a ; i++) {
			System.out.println("같아서 다시 돌류 "+i+"번째");
			b = (int) (Math.random()*2 +1);
			for(int j =1; c == b || c == a; j ++) {
				c = (int) (Math.random()*2 +1);
			}
		}
		System.out.println(a+" "+b);
		
		
		
		
		
		
	}

}
