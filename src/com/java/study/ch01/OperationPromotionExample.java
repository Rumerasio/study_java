package com.java.study.ch01;

public class OperationPromotionExample {

	public static void main(String[] args) {
		//byte 변수 byteValue 선언하고 12로 초기화
		byte byteValue=12;
		//byte 변수 byteValue2 선언하고 12로 초기화
		byte byteValue2=12;
		//byte 변수 byteValue3 선언하고 위의 두 변수를 합 연산 수행
		int byteValue3= byteValue + byteValue2;
		//byteValue3 결과 출력
		System.out.println(byteValue3);
		
		//short 변수 shortValue 선언하고 12로 초기화
		//short 변수 shortValue2 선언하고 12로 초기화
		//short 변수 shortValue3 선언하고 위의 두 변수의 합 연산 수행
		//shortValue3 결과 출력
		
		short shortValue = 12;
		short shortValue2 = 12;
		/* short shortValue3 = shortValue+shortValue2; */
		int shortValue3 = shortValue+shortValue2;
		System.out.println(shortValue3);
		
		//int 변수 intValue 선언하고 12로 초기화
		//int 변수 intValue2 선언하고 12로 초기화
		//int 변수 intValue3 선언하고 위의 두 변수의 합 연산 수행
		//intValue3 결과 출력
		
		int intValue = 12;
		int intValue2 = 12;
		int intValue3 = intValue+intValue2; 
		System.out.println(intValue3);
		
		//long 변수 longValue 선언하고 12로 초기화
		//long 변수 longValue2 선언하고 12로 초기화
		//long 변수 longValue3 선언하고 위의 두 변수의 합 연산 수행
		//longValue3 결과 출력
		
		long longValue = 12;
		long longValue2 = 12;
		long longValue3 = longValue+longValue2; 
		System.out.println(longValue3);
		
		//float 변수 floatValue 선언하고 12로 초기화
		//float 변수 floatValue2 선언하고 12로 초기화
		//float 변수 floatValue3 선언하고 위의 두 변수의 합 연산 수행
		//floatValue3 결과 출력
		
		float floatValue = 12;
		float floatValue2 = 12;
		float floatValue3 = floatValue+floatValue2; 
		System.out.println("float 연산 :"+floatValue3);
		
		//double 변수 doubleValue 선언하고 12로 초기화
		//double 변수 doubleValue2 선언하고 12로 초기화
		//double 변수 doubleValue3 선언하고 위의 두 변수의 합 연산 수행
		//doubleValue3 결과 출력
		
		double doubleValue = 12;
		double doubleValue2 = 12;
		double doubleValue3 = doubleValue+doubleValue2; 
		System.out.println("double 연산 :"+doubleValue3);
		
		//byte 변수 byteValue4를 선언하고 byteValue intValue 합 연산 수행
		//int 변수 intValue4를 선언하고 byteValue intValue 합 연산 수행
		//intValue4 결과 출력
		
		/* byte byteValue4 = byteValue+intValue; */
		int intValue4 = byteValue + intValue;
		System.out.println("intValue4:"+intValue4);
		
		//int 변수 intValue5를 선언하고 intValue doubleValue 합연산 수행
		//double 변수 doubleValue4 를 선언하고 intValue doubleValue 합 연산 수행
		//doubleValue4 결과 출력
		
		/* int intValue5 = intValue + doubleValue; */
		double doubleValue4 = intValue + doubleValue;
		System.out.println("doubleValue4 :"+doubleValue4);
	}

}
