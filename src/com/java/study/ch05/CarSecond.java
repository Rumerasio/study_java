package com.java.study.ch05;

public class CarSecond {
	
	String name = "아반떼";
	int cc = 1500;
	String color ="빨강";
	
	CarSecond(){}
	
	CarSecond(String name){
		this.name=name;
	}
	
	CarSecond(String name,int cc){
		this.name=name;
		this.cc=cc;
	}
	
	CarSecond(String name,int cc, String color){
		this.name=name;
		this.cc=cc;
		this.color=color;
	}
	
	public void show(){
		System.out.println("------------");
		System.out.println("차종: "+name);
		System.out.println("차배기량: "+cc+"cc");
		System.out.println("도색: "+color);
	}
	
}
