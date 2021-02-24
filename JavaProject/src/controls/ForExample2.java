package controls;

public class ForExample2 {

	public static void main(String[] args) {
		int num = 4;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));

			//메소드를 이용한 2 ~ 9 구구단 출력
			for (int j = 2; j <= 9; j++) {
				showResult(j);
			}

		}

	}

	public static void showResult(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

}
