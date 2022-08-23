package com.java.study.ch05;

public class Korean {

	String name ="아무개";
	String ssn ="000000-0000000";
	String nationality ="지구";
	int age=0;
	
	Korean(){}
	
	Korean(String name,String str){
		if(str.length()==14) {
			this.ssn=str;
		} else {
			this.nationality=str;
		}
		this.name = name;
	}
	
	Korean(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
}
