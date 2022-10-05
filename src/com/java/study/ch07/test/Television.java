package com.java.study.ch07.test;

public class Television implements RemoteControl{

	@Override
	public void turnon() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnoff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setvolume(int volume) {
		if(volume > max_volume) {
			volume = max_volume;
		} else if(volume < min_volume) {
			volume = min_volume;
		}
		System.out.println("현재 TV 볼륨: "+volume);
	}

}
