package com.java.study.ch10.first;

import java.awt.Toolkit;

public class BeepPrintExample {

public static void main(String[] args) {
		
	//현재 쓰레드 하나로 소리가 나고나서 찍히게 된다. 
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
