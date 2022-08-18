package com.java.study.ch04;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week abc;
		Week xyz;
		
//		abc=1; 
//		abc="absdfsdf";  // 데이터타입과 맞이 않은 값이 들어와서 오류
		 
		abc=Week.THUESDAY;
		
		System.out.println("Week.FRIDAY: "+Week.FRIDAY);
		System.out.println("abc: "+abc);

//		String title = abc; 
		String title = abc.name();
		System.out.println("title: "+title);
		
		int ordinal = abc.ordinal(); //인덱스 퉷
		System.out.println("ordinal: " +ordinal);
		
		xyz=Week.THUESDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		
		Week[] days = Week.values();
		
		int index=0;
		
		for(Week day:days) {
			System.out.println(index+": day: "+day);
			index++;
		}
	}

}
