package com.java.study.ch06.first;

public class DmbCellPhone extends CellPhone {
	
	//필드
	int channel=0;
	//생성자
	DmbCellPhone(){}
	
	DmbCellPhone(String model,String color,int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널 "+channel+" DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 "+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}