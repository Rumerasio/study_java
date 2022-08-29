package com.java.study.ch06.fifth;

public class Example {

	public static void main(String[] args) {

		int[] number= {40,80,20};
		
		Parent parent = new Parent();
		parent.show(number);
		parent.sort(number);
		System.out.println("Parent클래스의 sum method: "+parent.sum(number));
		
		
		Child child = new Child();
		child.show(number);
		child.sort(number);
		System.out.println("Child클래스의 sum method(override): "+child.sum(number));
		
		System.out.println("Parent 메서드2값과 Child 메서드 값 차이: "+Math.abs((parent.sum(number)-child.sum(number))));
		
		parent.sort(number); 
		child.sort(number);
		
	}

}
