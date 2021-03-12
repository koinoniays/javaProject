package objects1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int menu = 0;

		Service service = new Service1();

		System.out.print("id 입력> ");
		String id = scn.nextLine();
		System.out.print("pw 입력> ");
		String pw = scn.nextLine();
		if (id.equals("admin") && pw.equals("super")) {
			System.out.println("로그인 성공");
		} else if (id != "admin") {
			System.out.println("관리자 정보를 확인하세요.");
		} else if (id.equals("admin") && pw != "super") {
			System.out.println("비밀번호를 확인하세요.");
		}

		if (id.equals("admin") && pw.equals("super")) {
			while (true) {
				System.out.println("=========================");
				System.out.println("1.학생등록 2.학생정보수정 3.성적입력 4.성적조회 5.성적수정 6.전체리스트 9.종료");
				System.out.println("=========================");
				System.out.println("선택> ");
				menu = scn.nextInt();

				if (menu == 1) {
					System.out.println("학생등록");
					
					System.out.print("학생번호입력> ");
					String num = scn.next();
					System.out.print("학생이름입력> ");
					String name = scn.next();
					System.out.print("학생나이입력> ");
					int age = scn.nextInt();
					System.out.println("학생연락처입력> ");
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
