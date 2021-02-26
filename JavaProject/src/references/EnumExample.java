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
		int maleOrFemale = 1; // 1����, 2����
		int yesOrNo = 1; // 1 yes, 2 no

		Week today = null;
		today = Week.SUNDAY; // week �������� ������� ��������
		// today = "Hello;" -- �����Ͽ���
		Calendar cal = Calendar.getInstance();
		System.out.println("�⵵ " + cal.get(Calendar.YEAR));
		System.out.println("�� " + cal.get(Calendar.MONTH)); // 0~11��
		System.out.println("�� " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("���� " + cal.get(Calendar.DAY_OF_WEEK));

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
		if (today == Week.SUNDAY || today == Week.SATURDAY) { // ��Ȯ�� ǥ������ ���°� ����
//		if(week == 1 || week == 2) { //����, ������ ������ yes, no�� ������ week�� ������ ��Ȯ���� ����
			System.out.println("�ָ����� ������ ���ϴ�.");
		} else {
			System.out.println("���߿��� ���θ� �մϴ�.");
		}
		
		Kind manOfWoman = Kind.FEMALE;
		if(manOfWoman == Kind.MALE) {
			System.out.println("�����Դϴ�.");
		}else if(manOfWoman == Kind.FEMALE) {
			System.out.println("�����Դϴ�.");
		}
	}
}
