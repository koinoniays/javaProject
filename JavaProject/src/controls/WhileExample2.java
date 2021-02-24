package controls;

public class WhileExample2 {

	public static void main(String[] args) {

		int num = 2;
		int i = 1;
		while (true) {
			System.out.println(num + " * " + i + " = " + (num * i));
			i++;
			if (i > 9) {
				break;
			}
		}

		showResult(3);
		showResult(4);
		showResult(5);
		showResult(6);

	}

	public static void showResult(int num) {
		int i = 1;
		while (true) {
			System.out.println(num + " * " + i + " = " + (num * i));
			i++;
			if (i > 9) {
				break;
			}
		}

	}

}
