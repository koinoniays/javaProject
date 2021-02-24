package controls;

public class IfElseExample {

	public static void main(String[] args) {
		String grade = "F";
		int score = 85;

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade = "A+";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade = "B+";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade = "C+";
			}
		} else {
			grade = "F";
		}
			System.out.println("점수 " + score + "는 " + grade + " 입니다.");
		}
	}
