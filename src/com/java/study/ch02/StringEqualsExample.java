package com.java.study.ch02;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String str1 ="장원영";
		String str2 ="장원영";
		String str3 = new String("장원영");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		boolean result1 = (str1 == str2);
		System.out.println("result1= "+result1);
		
		boolean result2 = (str1 == str3);
		System.out.println("result2= "+result2);
		
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));
		
		if(str1 == str3) {
			System.out.println("str1과 str3의 주소값이 같습니다.");
		}
		else {
			System.out.println("str1과 str3의 주소값이 다릅니다.");
		}
		
		System.out.println(String.valueOf(str2));
		System.out.println(str1.length());
	}

}
