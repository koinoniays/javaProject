package references;
import java.util.Scanner;
public class Example01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int studentNum = 0;
		
		while(true) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7.수학평균점이상 9.종료");
			System.out.println("----------------------------------------------------------------");
			System.out.print("선택>");
			
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("학생수>");
				studentNum = scn.nextInt();
				
			}else if (menu == 2) {
				for(int i = 0; i<studentNum; i++) {
					System.out.println("학생번호>>");
					students[i][0] = scn.nextInt();
					System.out.println("영어점수>");
					students[i][1] = scn.nextInt();
					System.out.println("수학점수>");
					students[i][2] = scn.nextInt();
				}				
			}else if (menu == 3) {
				for(int i = 0; i<studentNum; i++) {
					System.out.println("학생정보 - " + "번호: " + students[i][0] + "영어: " + students[i][1] + "수학: " + students[i][2] );
				}
				
			}else if (menu == 4) {
				System.out.print("찾고자 하는 학생번호 입력>");
				
				
			}else if (menu == 5) {
				
			}else if (menu == 6) {
				
			}else if (menu == 7) {
				
			}else if (menu == 9) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

}
