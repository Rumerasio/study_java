package com.java.study.ch03;

public class IfExample2 {

	public static void main(String[] args) {
		
		int vipClass= 5;
		double price = 35000;
		double sale;
		double afterSale;
		
		System.out.println("정가: "+price);
		if(vipClass == 1) {
			sale = 5;
			afterSale = price*(1-(0.01)*sale);
			System.out.println("일반등급 "+sale+"%의 할인이 적용되어 "+(int)afterSale+"입니다");
		} else if(vipClass ==2 ) {
			sale = 10;
			afterSale = price*(1-(0.01)*sale);
			System.out.println("브론즈등급 "+sale+"%의 할인이 적용되어 "+(int)afterSale+"입니다");
		} else if(vipClass ==3 ) {
			sale = 15;
			afterSale = price*(1-(0.01)*sale);
			System.out.println("실버등급 "+sale+"%의 할인이 적용되어 "+(int)afterSale+"입니다");
		} else if(vipClass ==4 ) {
			sale = 20;
			afterSale = price*(1-(0.01)*sale);
			System.out.println("골드등급 "+sale+"%의 할인이 적용되어 "+(int)afterSale+"입니다");
		} else if(vipClass ==5 ) {
			sale = 2.7;
			afterSale = price*(1-(0.01)*sale);
			System.out.println("플래티넘등급 "+sale+"%의 할인이 적용되어 "+(int)afterSale+"입니다");
		} else {
			System.out.println("적합한 등급(1~5의 정수값)을 입력해주세요");
		}
		
	}

}
