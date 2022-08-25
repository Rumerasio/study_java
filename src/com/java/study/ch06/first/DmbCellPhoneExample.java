package com.java.study.ch06.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		CellPhone cellphone = new CellPhone();
		cellphone.powerOn();
		cellphone.bell();
		cellphone.sendVoice("여보세요~ 나야");
		cellphone.receiveVoice("어 잘들려 왜");
		cellphone.hangUp();
		cellphone.powerOff();
		
		System.out.println(cellphone.model+", 색은 "+cellphone.color+"인 휴대전화를 쓰고있습니다.");
		
		System.out.println("---------------------------");
		DmbCellPhone dmbcellphone = new DmbCellPhone("Iphone", "Black", 4);
		System.out.println("모델: "+dmbcellphone.model+", 색상: "+dmbcellphone.color+" DMB기능 탑재");
		dmbcellphone.powerOn();
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(15);
		dmbcellphone.turnOffDmb();
		dmbcellphone.powerOff();
		
	}

}
