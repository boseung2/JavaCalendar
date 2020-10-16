package project;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		System.out.println("두 수의 합은 " + (firstNum + secondNum) + "입니다.");
		
		scanner.close();
	}

}
