package com.java.study.ch04;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] scores = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
		
		System.out.println("scores[1][1]: " +scores[1][1]);
		
		System.out.println("scores[3][0]: " +scores[3][0]);
		
		System.out.println("scores[0][2]: " +scores[0][2]);
		
		System.out.println("scores[2][2]: " +scores[2][2]);
		
		System.out.println("--------------------------------------");
		
		String[] name = {"한찬구","장동건","고소영","박태환","싸이"};
		String[] subject = {"국어","영어","수학"};
		
		
		//1 개인의 평균
		
		for(int i=0; i<5; i++) {
			int sum=0;
			for(int j=0; j<3; j++) {
				sum +=scores[i][j];
			}
			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
		}
		System.out.println("------------------------------");
		
		for(int i=0; i<scores.length; i++) {
			int sum=0;
			for(int j=0; j<scores[i].length; j++) {
				sum +=scores[i][j];
			}
			System.out.println(name[i]+"의 평균 점수는: "+((double)sum/3));
		}
		
		System.out.println("------------------------------");
		//2 과목별 평균
		for(int j=0; j<3; j++) {
			int sum=0;
			for(int i=0; i<5; i++) {
				sum +=scores[i][j];
			}
			System.out.println(subject[j]+" 과목의 평균 점수는: "+((double)sum/5));
		}
		
		for(int j=0; j<scores[j].length; j++) {
			int sum=0;
			for(int i=0; i<scores.length; i++) {
				sum +=scores[i][j];
			}
			System.out.println(subject[j]+" 과목의 평균 점수는: "+((double)sum/5));
		}
		
		//2 (1) 선생님 방법
		// 국어 영어 수학의 점수들을 모을 각각의 sum 값을 배열로 선언
		
		System.out.println("--------------Teacher style!!!!----------------");
		int[] sum2 = new int[3]; //sum2[0] 국어점수의 합, sum2[1] 영어점수의 합, sum2[2] 수학점수의 합
		
		for(int i =0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum2[j] +=scores[i][j];
			}
		}
		
		for(int i=0;i<sum2.length; i++) {
			System.out.println(subject[i]+" 과목의 평균 점수는: "+((double)sum2[i]/scores.length));
		}
		
		
	}

}
