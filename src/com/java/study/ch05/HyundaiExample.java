package com.java.study.ch05;

public class HyundaiExample {

	public static void main(String[] args) {

		Hyundai hyundai = new Hyundai();
		for(int i= 0;i<hyundai.name.length;i++) {
			System.out.println("hyundai.name["+i+"]: " +hyundai.name[i]);
		}
	}

}
