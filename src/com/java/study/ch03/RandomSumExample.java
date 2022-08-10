package com.java.study.ch03;

import java.util.Random;

public class RandomSumExample {

	public static void main(String[] args) {

		double min = 1;
		double max = 100;
		// Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0.
		int random = (int) (Math.random() * (max-min)+min);
		System.out.println(random);

		
		// 1~ 100사이의 랜덤 정수 2개를 발생시켜 두 수 사이의 합을 구하라
		int random1 = (int) (Math.random()*99 +1);
		int random2 = (int) (Math.random()*99 +1);
		
		/* System.out.println(random1+" + "+random2+" = "+ (random1+random2)); */
		
		int sum=0;
		if(random1 > random2) {
			for(int i = random2 ; i <= random1 ; i++) {
				sum = sum+i;
			}
			System.out.println(random2+" 와 "+random1+" 사이의 정수합: "+sum);
		} else if (random1 < random2) {
			for(int i = random1 ; i <= random2 ; i++) {
				sum = sum+i;
			}
			System.out.println(random1+" 와 "+random2+" 사이의 정수합: "+sum);
		} else {
			System.out.println("같은 수 입니다. 사이 값이 없습니다. 값: "+random1);
		}
		
		
		// 
		
		Random rand = new Random();
		
		int a = rand.nextInt(100);
		int b = rand.nextInt(100);
		
		int sum1=0;
		
		if(a > b) {
			for(int i = b ; i<=a ; i++) {
				sum1 +=i;
				System.out.println(i+" : 누적합 : "+sum1);
			}
		} else if (a <b) {
			for(int i =a ; i<=b; i++) {
				sum1 +=i;
				System.out.println(i+" : 누적합 :"+sum1);
			}
		} else {
			System.out.println("같은 값이라 사잇값이 존재하지 않습니다.");
		}
		
		System.out.println(a+" ~ "+b+" 사이의 정수합 :"+sum1);
	}

}
