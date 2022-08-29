package com.java.study.ch06.fifth;

public class Parent {

	//field
	
	int sum=0;
	
	//길이에 상관없이 배열이면 가능하게 설계
	public void sort(int[] a) {
		int dummy=0;
		for(int i=0;i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					dummy=a[i];
					a[i]=a[j];
					a[j]=dummy;
				} 
			}
		}
		System.out.print("오름차순 정렬: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	//3숫자의 합
	public int sum(int[] num) {
		sum=num[0]*num[1]+num[2];
		return sum;
	}
	//배열값 출력
	public void show(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
} 
