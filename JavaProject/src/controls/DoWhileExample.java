package controls;

//Scanner.readLine() 메소드
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력");
		String str = scn.nextLine(); // 사용자가 입력한 값을 받아오는 // scn.nextInt() - 사용자가 입력한 값이 숫자일 경우
		System.out.println("입력한 값은 : " + str);

		boolean run = true;
		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>>" + str);

			if (str.equals("q")) {
				run = false; //break; 도 가능
			}
		} while (run);

		System.out.println("프로그램 종료.");
	}

}
