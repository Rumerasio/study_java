package com.java.study.ch05;

public class Television {

	public static String company="Samsung";
	public static String model ="QLED";
	static String info;
	
	public String version = "1.0";
	
	static {
		info = company+model;
	}
}
