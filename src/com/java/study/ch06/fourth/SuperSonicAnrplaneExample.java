package com.java.study.ch06.fourth;

public class SuperSonicAnrplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane supersonicairplane = new SupersonicAirplane();
		
		supersonicairplane.takeOff();
		supersonicairplane.fly();
		supersonicairplane.flyMode=Constants.SUPERSONIC;
		supersonicairplane.fly();
		supersonicairplane.flyMode=Constants.NORMAL;
		supersonicairplane.fly();
		supersonicairplane.land();
		
	}

}
