package controls;

public class SwitchExample {

	public static void main(String[] args) {
		String grade = "F";
		int num = 70;

		switch (num / 10) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "F";
		}
		
		System.out.println("점수 " + num + "는 " + grade + " 입니다.");
	}

}
