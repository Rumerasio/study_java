package com.java.study.ch02;

public class IncreaseDecreaseoperatorExample {

	public static void main(String[] args) {
		//		++ / -- 피연산자 : 다른 연산 수행 전에 피연산자 1 증가 / 감소 
		//		피연산자 ++ / -- : 다른 연산 수행 후에 피연산자 1 증가 / 감소
		
		int i=0 , j =0;
		++i;
		j++;
		
		System.out.println("i :"+i+" j : "+j);
		
		//int 변수 a,b 를 선언하고 초기값으로 1을 넣어준다.
		/*a 앞에 감소연산
		 *b 뒤에 감소연산
		 *두 변수의 결과를 출력
		*/
	
		int a =1, b=1;
		--a;
		b++;
		System.out.println("a : " +a+" b : "+b);
		
		//int 변수 k 선언 후 초기값으로 i 뒤에 증감연산
		int k =i++;
		System.out.println("i :"+i+" k : "+k);
		
		int m =++j;
		System.out.println("j : "+j+" m : "+m);
		
		int z = ++i + j++;
		System.out.println("z: "+z+" i: " + i+" j: "+j);
		
		
	}

}
