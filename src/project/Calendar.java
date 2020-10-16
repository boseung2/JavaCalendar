package project;

public class Calendar {

	private static final int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] maxDaysOfLeanYear = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeanYear(int year) {
		if ((year % 4) == 0) {
			if ((year % 400) == 0)
				return true;
			else if ((year % 100) == 0)
				return false;
			else
				return true;
		} else
			return false;
	}

	public int getMaxDay(int year, int month) {
		if (isLeanYear(year) == true)
			return maxDaysOfLeanYear[month - 1];
		else
			return maxDays[month - 1];
	}

	public int getStartDay(int year, int month, int day) {
		int preYear = year - 1;
		int numOfDays = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);
		for (int i = 0; i < month - 1; i++) {
			if (isLeanYear(year) == true) {
				numOfDays += maxDaysOfLeanYear[i];
			} else
				numOfDays += maxDays[i];
		}
		numOfDays += day;

		return numOfDays % 7;
	}

	public void printCal(int year, int month) {
		System.out.println(year + "년" + month + "월");
		System.out.println("    일   월   화   수   목   금   토");
		System.out.println("-----------------------");
		int i;
		for (i = 1; i <= getStartDay(year, month, 1); i++) {
			System.out.print("   ");
		}
		for (i = getStartDay(year, month, 1) + 1; i <= getMaxDay(year, month) + getStartDay(year, month, 1); i++) {
			System.out.printf("%3d", i - getStartDay(year, month, 1));
			if (i % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}

}