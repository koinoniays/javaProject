package objects1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;

		Service service = new Service1();

		System.out.print("id �Է�> ");
		String id = scn.nextLine();
		System.out.print("pw �Է�> ");
		String pw = scn.nextLine();
		if (id.equals("admin") && pw.equals("super")) {
			System.out.println("�α��� ����");
		} else if (id != "admin") {
			System.out.println("������ ������ Ȯ���ϼ���.");
		} else if (id.equals("admin") && pw != "super") {
			System.out.println("��й�ȣ�� Ȯ���ϼ���.");
		}

		if (id.equals("admin") && pw.equals("super")) {
			while (true) {
				System.out.println("=========================");
				System.out.println("1.�л���� 2.�л��������� 3.�����Է� 4.������ȸ 5.�������� 6.��ü����Ʈ 9.����");
				System.out.println("=========================");
				System.out.println("����> ");
				menu = scn.nextInt();

				if (menu == 1) {
					System.out.println("�л����");
					
					System.out.print("�л���ȣ�Է�> ");
					String num = scn.next();
					System.out.print("�л��̸��Է�> ");
					String name = scn.next();
					System.out.print("�л������Է�> ");
					int age = scn.nextInt();
					System.out.println("�л�����ó�Է�> ");
					String phone = scn.next();
					Student student = new Student(num, name, age, phone, 0);
					service.create(student);
				} else if (menu == 2) {

				} else if (menu == 3) {

				} else if (menu == 4) {

				} else if (menu == 5) {

				} else if (menu == 6) {

				} else if (menu == 9) {
					break;
				}
			}
		}
	}
}
