package controls;

public class ForExample2 {

	public static void main(String[] args) {
		int num = 4;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));

			//�޼ҵ带 �̿��� 2 ~ 9 ������ ���
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
