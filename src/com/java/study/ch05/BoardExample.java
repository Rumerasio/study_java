package com.java.study.ch05;

public class BoardExample {

	public static void main(String[] args) {
		
		Board board = new Board();
		board.show();
		
		Board board2=new Board("나랏말싸미");
		board2.show();
		
		Board board3=new Board("꿀잠자는 방법",2);
		board3.show();
		
		Board board4=new Board("오늘도 피곤한 당신을 위한 꿀팁",true);
		board4.show();
		
		Board board5=new Board("신논현역 맛집4선",5320,true);
		board5.show();
		
		System.out.println(Board.type);
		
	}

}
