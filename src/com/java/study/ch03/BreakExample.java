package com.java.study.ch03;

public class BreakExample {

	public static void main(String[] args) {
		double min = 1.0;
		double max = 10.0;
		
		
		
		while(true) {
			int random1 = (int) (Math.random()*(max-min)+min);
			System.out.println(random1);
			if(random1 == 7) {
				break;
			}
		}
		aa:
		for(int i = 1;i<=10;i++) {
			for(int j =1; j<=10;j++) {
				int random2 = (int)(Math.random()*9+1);
				System.out.println(i+" : "+j+" : "+random2);
			
			if(random2 == 5) {
				break aa;
			}
			}
		}
	}

}
