package controls;

//Scanner.readLine() �޼ҵ�
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �Է�");
		String str = scn.nextLine(); // ����ڰ� �Է��� ���� �޾ƿ��� // scn.nextInt() - ����ڰ� �Է��� ���� ������ ���
		System.out.println("�Է��� ���� : " + str);

		boolean run = true;
		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>>" + str);

			if (str.equals("q")) {
				run = false; //break; �� ����
			}
		} while (run);

		System.out.println("���α׷� ����.");
	}

}
