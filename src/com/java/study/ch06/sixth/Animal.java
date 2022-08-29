package com.java.study.ch06.sixth;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	public abstract void sound(String m);
}
