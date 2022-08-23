package com.java.study.ch05;

public class CarSecond {

	String name="아반떼";
	String color="red";
	int cc = 1500;
	
	
	//생성자
	//이름받는 생성자
	CarSecond(String name) {
		this.name=name;
	}
	//이름과 cc받는 생성자
	CarSecond(String name,int cc) {
		this.name=name;
		this.cc=cc;
	}
	//이름,cc,색 받는 생성자
	CarSecond(String name,int cc, String color) {
		this.name=name;
		this.cc=cc;
		this.color=color;
	}
	// cc 생성자
	CarSecond(int cc) {
		this.cc=cc;
	}
	//기본 생성자 (위에 명시 생성자들이 존재하므로 기본 생성자를 따로 또 만들어줘야한다)
	CarSecond() {}
		
	public void show() {
		System.out.println("차종: "+name);
		System.out.println("차cc: "+cc);
		System.out.println("차색: "+color);
	}
	
}
