package com.java.study.ch07.test;

public interface RemoteControl {

	int max_volume = 10;
	int min_volume = 0;
	
	void turnon();
	void turnoff();
	void setvolume(int volume);
	
	default void setmute(boolean mute) {
		if(mute == true) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
	
}
