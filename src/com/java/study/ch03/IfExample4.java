package com.java.study.ch03;

public class IfExample4 {

	public static void main(String[] args) {
		
		int a =3;
		int b =12;
		
		if(a>0 & b>0) {
			System.out.println("(a,b)는 1사분면에 위치합니다");
		} else if(a<0 && b>0) {
			System.out.println("(a,b)는 2사분면에 위치합니다");
		} else if(a<0 && b<0) {
			System.out.println("(a,b)는 3사분면에 위치합니다");
		} else if(a>0 && b<0) {
			System.out.println("(a,b)는 4사분면에 위치합니다");
		} else if(a==0 && b!=0) {
			System.out.println("(a,b)는 x축 위에 있습니다");
		} else if(a!=0 && b==0) {
			System.out.println("(a,b)는 y축 위에 있습니다");
		} else {
			System.out.println("(a,b)는 원점입니다.");
		}
		
	}

}
