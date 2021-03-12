package example;

import java.util.Scanner;

public class StudentApp {
	private static Scanner scn = new Scanner(System.in);
	private static Students[] array = new Students[10];

	public static void main(String[] args) {

		int menu = 0;
		while (true) {

			System.out.println("=====================================");
			System.out.println("1.�л���� 2.�������� 3.�������� 4.����Ʈ 5.����");
			System.out.println("=====================================");
			System.out.print("����> ");

			menu = scn.nextInt();

			if (menu == 1) {
				create();
			} else if (menu == 2) {
				write();
			} else if (menu == 3) {
				remove();
			} else if (menu == 4) {
				list();
			} else if (menu == 5) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void create() {
		System.out.println("�л����");
		System.out.print("�й�> ");
		int num = scn.nextInt();
		System.out.print("�̸�> ");
		String name = scn.next();
		System.out.print("�޴�����ȣ> ");
		String phone = scn.next();

		Students students = new Students(num, name, phone);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = students;
				System.out.println("��� �Ϸ�");
				break;
			}
		}
	}

	private static void list() {
		System.out.println("�л�����Ʈ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null)
				break;
			System.out.println(array[i].getNum() + "|" + array[i].getName() + "|" + array[i].getPhone());
		}
	}

	private static void write() {
		System.out.println("��������");
		System.out.print("������ �й�> ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if (array[i].getNum() == scn.nextInt()) {
					System.out.print("��ȭ��ȣ ����> ");
					array[i].setPhone(scn.next());
				}
			}
		}
	}
	
	private static void remove() {
		System.out.println("��������");
		System.out.print("������ �̸�> ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if(array[i].getName().equals(scn.next())) {
					array[i] = null;
					System.out.println("���� �Ϸ�");
				}
			}
		}
	}
}
