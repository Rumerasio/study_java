package com.java.study.ch04;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		 
		int[] scoreChemistry = {88,99,45,86,34};
		
		int[] scoreMath = {99,85,92,52,68};
		
		int sum=0;
		
		for(int i = 0; i<=4; i++) {
			sum = sum+scoreChemistry[i];
		}
		System.out.println("화학점수 평균: "+((double)sum/5));
		
		int sum1=0;
		for(int j =0; j<scoreMath.length; j++) {
			sum1 += scoreMath[j];
		}
		System.out.println("수학점수 평균: "+((double)sum1/5));
 	}

}
