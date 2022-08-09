package com.java.study.ch03;

public class SwitchExample2 {

	public static void main(String[] args) {

			int grade =4;
			int price =30000;
			double sale;
			double aftersale;
			
			System.out.println("가격: "+price+"인 상품");
			switch(grade) {
				case 1: 
					sale=5;
					aftersale = price * (1-(0.01*sale));
					System.out.println("일반등급 "+sale+"%의 할인이 적용되어 "+(int)aftersale+"입니다");
					break;
					
				case 2: 
					sale=10;
					aftersale = price * (1-(0.01*sale));
					System.out.println("브론즈등급 "+sale+"%의 할인이 적용되어 "+(int)aftersale+"입니다");
					break;
					
				case 3: 
					sale=15;
					aftersale = price * (1-(0.01*sale));
					System.out.println("실버등급 "+sale+"%의 할인이 적용되어 "+(int)aftersale+"입니다");
					break;
					
				case 4: 
					sale=20;
					aftersale = price * (1-(0.01*sale));
					System.out.println("골드등급 "+sale+"%의 할인이 적용되어 "+(int)aftersale+"입니다");
					break;
					
				case 5: 
					sale=2.7;
					aftersale = price * (1-(0.01*sale));
					System.out.println("플래티넘등급 "+sale+"%의 할인이 적용되어 "+(int)aftersale+"입니다");
					break;
					
				default: 
					System.out.println("적합한 등급값(1~5사이의 정수)을 입력해주세요");
					break;
			}

	}

}
