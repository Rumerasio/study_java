package com.java.study.ch05;

public class KoreanExample {

	public static void main(String[] args) {

		Korean k1= new Korean("장원영","011225-1234567");
		System.out.println("k1.name : "+k1.name);
		System.out.println("k1.ssn : "+k1.ssn);
		
		Korean k2= new Korean("장원영",45);
		System.out.println("k2.name : "+k2.name);
		System.out.println("k2.nationality : "+k2.age);
		
		int result = Korean.staticTest(2);
		System.out.println(result);
		
		k1.ttest2();
		
	}

}
