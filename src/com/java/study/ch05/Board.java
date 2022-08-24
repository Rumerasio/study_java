package com.java.study.ch05;

public class Board {

		String title="제목없음";
		int hits=0;;
		boolean use =false;
		static String type = "문자열";
		
		
		//생성자
		Board() {}
		
		Board(String title) {
			this.title=title;
		}
		
		Board(String title,int hits) {
			this.title=title;
			this.hits=hits;
		}
		
		Board(String title,boolean use) {
			this.title=title;
			this.use=use;
		}
		
		Board(String title,int hits, boolean use) {
			this.title=title;
			this.hits=hits;
			this.use=use;
		}
		//method
		public void show() {
			System.out.println("게시판 제목: "+title);
			System.out.println("게시판 조회수: "+hits);
			System.out.println("게시판 사용여부: "+use);
			System.out.println("-------------------");
		}
		
}
