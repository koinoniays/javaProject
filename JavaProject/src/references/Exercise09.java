package references;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.println("--------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();
			
			if (selectNo !=5 && scores == null) {
				System.out.println("학생수를 입력하세요");
				System.out.println();
				continue;
			}
			if (selectNo == 1) {

				System.out.print("학생 수> ");
				studentNum = scn.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {

				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "] >");
					scores[i] = scn.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < studentNum; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
				}
			}
		}
	}
}
