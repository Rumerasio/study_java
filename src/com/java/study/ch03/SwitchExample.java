package com.java.study.ch03;

public class SwitchExample {

	public static void main(String[] args) {
		
		int num=9;
		
		switch(num) {
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			default:
				System.out.println("1과 2가 아닙니다.");
				break;
		}
		
		String position ="과장";
		
		switch(position) {
			case "사원":
				System.out.println("연봉은 5,000만원 입니다.");
				break;
			case "대리":
				System.out.println("연봉은 7,000만원 입니다.");
				break;
			case "과장":
				System.out.println("연봉은 9,000만원 입니다.");
				break;
			case "부장":
				System.out.println("연봉은 10,000만원 입니다.");
				break;
			case "사장":
				System.out.println("연봉은 15,000만원 입니다.");
				break;
			default:
				System.out.println("적합한 명칭의 직위를 입력해 주세요.");
				break;
		}
	}

}
