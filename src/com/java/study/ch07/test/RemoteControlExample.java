package com.java.study.ch07.test;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl remotecontrol = new Television();
		
		remotecontrol.turnon();
		remotecontrol.setmute(true);
		remotecontrol.setmute(false);
		remotecontrol.setvolume(100);
		RemoteControl.changeBattery();
		remotecontrol.turnoff();
		
		System.out.println("--------------------");
		
		remotecontrol.turnon();
		remotecontrol.setmute(true);
		remotecontrol.setmute(false);
		remotecontrol.setvolume(-10);
		RemoteControl.changeBattery();
		remotecontrol.turnoff();
	}

}
