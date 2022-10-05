package com.java.study.ch08.third;

public class BoxExample {

	public static void main(String[] args) {
//		Box<String> box = new Box<String>();
		
		Box<Integer> box = Util.<Integer>boxing(100);
		int rtInt = box.get();
		
		System.out.println("rtInt: " + rtInt);
		
		Box<String> box2 = Util.<String>boxing("Tony");
		String rtString = box2.get();
		
		System.out.println("rtString: " + rtString);
		}

}
