package com.java.study.ch05;

public class CarSecondExample {

	public static void main(String[] args) {

		CarSecond carsecond = new CarSecond();
		carsecond.show();
		
		CarSecond carsecond2 = new CarSecond("레이");
		carsecond2.show();
		CarSecond carsecond3 = new CarSecond("모닝",999);
		carsecond3.show();
		CarSecond carsecond4 = new CarSecond("아이오닉",1800,"Black");
		carsecond4.show();
		
		
	}

}
