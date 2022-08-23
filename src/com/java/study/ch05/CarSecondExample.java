package com.java.study.ch05;

public class CarSecondExample {

	public static void main(String[] args) {

		CarSecond carsecond = new CarSecond();
		carsecond.show();
		
		System.out.println("---------");
		CarSecond carsecond2 = new CarSecond("레이");
		carsecond2.show();
		System.out.println("---------");
		CarSecond carsecond3 = new CarSecond("모닝",999);
		carsecond3.show();
		System.out.println("---------");
		CarSecond carsecond4 = new CarSecond("아이오닉",1800,"Black");
		carsecond4.show();
		System.out.println("---------");
		
		
	}

}
