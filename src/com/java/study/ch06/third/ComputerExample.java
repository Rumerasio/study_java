package com.java.study.ch06.third;

public class ComputerExample {

	public static void main(String[] args) {

		int r= 10;
	
		Calculator calculator = new Calculator();
		System.out.println("반지름의 길이가 "+r+"인 원의 넓이는 "+calculator.areaCircle(r)+"입니다.");
		
		Computer computer = new Computer();
		
		System.out.println("반지름의 길이가 "+r+"인 원의 넓이는 "+computer.areaCircle(r)+"입니다.");		

	}

}
