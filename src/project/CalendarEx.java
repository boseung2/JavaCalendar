package project;

public class CalendarEx {
	public static void printCal() {
		System.out.println("    일   월   화   수   목   금   토");
		System.out.println("-----------------------");
		for (int i = 1; i < 29; i++) {
			System.out.printf("%3d", i);
			if (i == 7 || i == 14 || i == 21 || i == 28)
				System.out.println();
		}
	}
}
