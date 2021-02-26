package references;

import java.util.Calendar;

enum Kind {
	MALE, FEMALE;
}

enum Choice {
	YES, NO;
}

public class EnumExample {

	public static void main(String[] args) {
		int maleOrFemale = 1; // 1남자, 2여자
		int yesOrNo = 1; // 1 yes, 2 no

		Week today = null;
		today = Week.SUNDAY; // week 데이터의 상수값만 쓸수있음
		// today = "Hello;" -- 컴파일오류
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 " + cal.get(Calendar.YEAR));
		System.out.println("월 " + cal.get(Calendar.MONTH)); // 0~11월
		System.out.println("일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 " + cal.get(Calendar.DAY_OF_WEEK));

		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		if (today == Week.SUNDAY || today == Week.SATURDAY) { // 명확한 표현으로 쓰는게 좋다
//		if(week == 1 || week == 2) { //남자, 여자의 값인지 yes, no의 값인지 week의 값인지 명확하지 않음
			System.out.println("주말에는 여행을 갑니다.");
		} else {
			System.out.println("주중에는 공부를 합니다.");
		}
		
		Kind manOfWoman = Kind.FEMALE;
		if(manOfWoman == Kind.MALE) {
			System.out.println("남성입니다.");
		}else if(manOfWoman == Kind.FEMALE) {
			System.out.println("여성입니다.");
		}
	}
}
