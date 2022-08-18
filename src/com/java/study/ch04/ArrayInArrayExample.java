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
		
		
	}

}
