package abstractClasses0308;

import java.util.Calendar;

public class CalendarExe {

	public static void main(String[] args) {
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("--------------------");

		// 달력만들기
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 4, 1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%3s", " ");
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%3d", i);
			if ((i + firstDay - 1) % 7 == 0) {
				System.out.println();
			}
		}

	}

	public static void showCal(int year, int month) {
		// 해당년월의 달력을 생성해서 보여주는 메소드

	}

}
