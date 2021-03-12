package example;

import java.util.Scanner;

public class StudentApp {
	private static Scanner scn = new Scanner(System.in);
	private static Students[] array = new Students[10];

	public static void main(String[] args) {

		int menu = 0;
		while (true) {

			System.out.println("=====================================");
			System.out.println("1.학생등록 2.정보수정 3.정보삭제 4.리스트 5.종료");
			System.out.println("=====================================");
			System.out.print("선택> ");

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
		System.out.println("프로그램 종료");
	}

	private static void create() {
		System.out.println("학생등록");
		System.out.print("학번> ");
		int num = scn.nextInt();
		System.out.print("이름> ");
		String name = scn.next();
		System.out.print("휴대폰번호> ");
		String phone = scn.next();

		Students students = new Students(num, name, phone);
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = students;
				System.out.println("등록 완료");
				break;
			}
		}
	}

	private static void list() {
		System.out.println("학생리스트");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null)
				break;
			System.out.println(array[i].getNum() + "|" + array[i].getName() + "|" + array[i].getPhone());
		}
	}

	private static void write() {
		System.out.println("정보수정");
		System.out.print("수정할 학번> ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if (array[i].getNum() == scn.nextInt()) {
					System.out.print("전화번호 수정> ");
					array[i].setPhone(scn.next());
				}
			}
		}
	}
	
	private static void remove() {
		System.out.println("정보삭제");
		System.out.print("삭제할 이름> ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if(array[i].getName().equals(scn.next())) {
					array[i] = null;
					System.out.println("삭제 완료");
				}
			}
		}
	}
}
