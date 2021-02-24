package controls;

public class Morning0224 {

	public static void main(String[] args) {
		int n1;
		int n2;
		n1 = (int) (Math.random() * 100) + 1;
		n2 = (int) (Math.random() * 100) + 1;
		int n3 = (n1 + n2) / 2;
		String str = " ";

		if (n3 >= 90) {
			str = "수";
		} else if (n3 >= 80) {
			str = "우";
		} else if (n3 >= 70) {
			str = "미";
		} else {
			str = "가";
		}
		System.out.println("영어 : " + n1 + "\t 수학 : " + n2);
		System.out.println("평균 점수는 " + str + "입니다.");

		getAverage(n1, n2);

	}

	public static String getAverage(int n1, int n2) {
		n1 = (int) (Math.random() * 100) + 1;
		n2 = (int) (Math.random() * 100) + 1;
		int n3 = (n1 + n2) / 2;
		String str = " ";

		if (n3 >= 90) {
			str = "수";
		} else if (n3 >= 80) {
			str = "우";
		} else if (n3 >= 70) {
			str = "미";
		} else {
			str = "가";
		}
		System.out.println("영어 : " + n1 + "\t 수학 : " + n2);
		System.out.println("평균 점수는 " + str + "입니다.");

		return str;
	}

}
