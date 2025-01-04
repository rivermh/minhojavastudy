package ch02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		/* 9라인 : 변수 x값 3을 변수 temp에 대입 
		 * 10라인 : 변수 y값 5를 변수 x에 대입 
		 * 11라인: 변수 temp값 3을 변수 y에 대입 
		 */ 
		 
	}

}
