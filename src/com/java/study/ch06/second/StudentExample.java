package com.java.study.ch06.second;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student("김수환","990101-1235021",20200426);
		
		Student student2 = new Student("김수환","990101-1235021");
		
		System.out.println("성명: "+student.name+", 주민번호: "+student.ssn+", 학번: "+student.studentNo);
		
		System.out.println("성명: "+student2.name+", 주민번호: "+student2.ssn+", 학번: "+student2.studentNo);
		
		System.out.println("-----");
	}

}
