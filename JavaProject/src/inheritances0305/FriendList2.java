package inheritances0305;

import java.util.Scanner;

public class FriendList2 {

	public static void main(String[] args) {
		Friend[] friend = new Friend[10];
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.ģ�� 2.�б�ģ�� 3.ȸ��ģ�� 4.��ü��� 5.ģ���̸� �˻� 6.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����>");
			
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.print("ģ�� �̸� : ");
				String name = scn.next();
				System.out.print("�޴��� ��ȣ : ");
				String phone = scn.next();
				Friend friends = new Friend (name, phone);
				for(int i = 0; i<friend.length; i++) {
				if(friends == null) {
					friend[i] = friends;
					break;
					}
				}
			} else if (menu == 2) {
				System.out.print("�б� ģ�� : ");
				String name = scn.next();
				System.out.print("�޴��� ��ȣ : ");
				String phone = scn.next();
				System.out.println("�а� : ");
				String major = scn.next();
				UnivFriend univfriend = new UnivFriend(name, phone, major);
				
				
			} else if (menu == 3) {
				
			} else if (menu == 4) {
				
			} else if (menu == 5) {
				
			} else if (menu == 6) {
				break;
			}
		}

	}

}
