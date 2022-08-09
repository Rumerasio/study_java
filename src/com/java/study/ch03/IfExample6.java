package com.java.study.ch03;

public class IfExample6 {

	public static void main(String[] args) {
		
		
		int a = 7;
		int b = 7;
		int c = 7;
		
		if(a>=b) { //최댓값
			if(a>=c) {
				System.out.println("최댓값은 "+a+" 입니다");
			} else {
				System.out.println("최댓값은 "+c+" 입니다");
			}
		} else {
			if(b>=c) {
				System.out.println("최댓값은 "+b+" 입니다");
			} else {
				System.out.println("최댓값은 "+c+" 입니다");
			}
		}
		if(a<=b) { //최솟값
			if(a<=c) {
				System.out.println("최솟값은 "+a+" 입니다");
			} else {
				System.out.println("최솟값은 "+c+" 입니다");
			}
		} else {
			if(b<=c) {
				System.out.println("최솟값은 "+b+" 입니다");
			} else {
				System.out.println("최솟값은 "+c+" 입니다");
			}
		}
		
		// 같은 수가 있는경우는 그냥 예외처리 (하지 않음) WHY? 한정적이다
		
		int x=2;
		int y=3;
		int z=65;
		
		if(x!=y && y!=z && x!=z) {  //모든 값이 다르다
			if(x>y && x>z) {
				System.out.println("최댓값은 x: "+x);
			} else if(y>z && y>x) {
				System.out.println("최댓값은 y: "+y);
			} else {
				System.out.println("최댓값은 z: "+z);
			}
			
			if(x<y && x<z) {
				System.out.println("최솟값은 x: "+x);
			} else if(y<z && y<x) {
				System.out.println("최솟값은 y: "+y);
			} else {
				System.out.println("최솟값은 z: "+z);
			}
			
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요.");
		}
	}

}
