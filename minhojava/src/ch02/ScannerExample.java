package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("x 값 입력: ");
			String strX = scanner.nextLine();
			int x = Integer.parseInt(strX);
			
			System.out.println("y 값 입력: ");
			String strY = scanner.nextLine();
			int y = Integer.parseInt(strY);
			
			int result = x + y;
			System.out.println("x + y: " + result);
			System.out.println();
			
			while(true) {
				System.out.println("입력문자열: ");
				String data = scanner.nextLine();
				if(data.equals("q")) {
					break;
				}
				System.out.println("출력 문자열: " + data);
				System.out.println();
			}
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

}
