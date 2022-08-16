package com.java.study.ch03;

public class RandomSumExample2 {

	public static void main(String[] args) {
		//1~100 사이의 랜덤 수 두 개의 사잇값 더하기
		
		
		//(1) 1~100 사이의 랜덤값 발생
		int random1 = (int) (Math.random() * (99)+1);
		int random2 = (int) (Math.random() * (99)+1);
		
		//(2) 두 값을 비교해서 큰 값, 작은 값 찾기
		
		int big=0;
		int small=0;
		
		if(random1>random2) {
			big = random1;
			small =random2;
		} else if (random1<random2) {
			big=random2;
			small=random1;
		} else {
			System.out.println("두 값이 동일 합니다");
		}
		
		//(3) 사잇값 더하기
		
		int sum=0;
		for(int i=small;i<=big;i++) {
			sum = sum+i;
			System.out.println(i+" , 누적 합: "+sum);
		}
		System.out.println(small+" 과 "+big+" 사이 값의 합은 "+sum+" 입니다");
		
		
		
	}

}
