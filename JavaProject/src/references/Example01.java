package references;
import java.util.Scanner;
public class Example01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int studentNum = 0;
		
		while(true) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.�л��� 2.�����Է� 3.����Ʈ 4.��ȸ 5.�����ְ��� 6.�հ��ְ� 7.����������̻� 9.����");
			System.out.println("----------------------------------------------------------------");
			System.out.print("����>");
			
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("�л���>");
				studentNum = scn.nextInt();
				
			}else if (menu == 2) {
				for(int i = 0; i<studentNum; i++) {
					System.out.println("�л���ȣ>>");
					students[i][0] = scn.nextInt();
					System.out.println("��������>");
					students[i][1] = scn.nextInt();
					System.out.println("��������>");
					students[i][2] = scn.nextInt();
				}				
			}else if (menu == 3) {
				for(int i = 0; i<studentNum; i++) {
					System.out.println("�л����� - " + "��ȣ: " + students[i][0] + "����: " + students[i][1] + "����: " + students[i][2] );
				}
				
			}else if (menu == 4) {
				System.out.print("ã���� �ϴ� �л���ȣ �Է�>");
				
				
			}else if (menu == 5) {
				
			}else if (menu == 6) {
				
			}else if (menu == 7) {
				
			}else if (menu == 9) {
				break;
			}
		}
		System.out.println("���α׷� ����.");
	}

}
