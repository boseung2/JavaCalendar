package project;

import java.util.Scanner;

public class Prompt {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while (true) {
			
			int year=0, month = 0;
			
			System.out.println("년도를 입력하세요.(종료하려면 -1입력)");
			System.out.print("year> ");
			year = scanner.nextInt();

			if (year == -1) {
				System.out.println("Bye");
				break;
			} else if (year < -1) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				continue;
			}

			System.out.println("월을 입력하세요.");
			System.out.print("month> ");
			month = scanner.nextInt();
			if (month < 0 || month > 12) {
				System.out.println("잘못입력하셨습니다. 다시입력해주세요");
				continue;
			}

			cal.printCal(year, month);
		}
		scanner.close();
	}
}
