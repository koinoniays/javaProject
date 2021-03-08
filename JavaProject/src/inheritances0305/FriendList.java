package inheritances0305;

import java.util.Scanner;

public class FriendList  {
	static Friend[] friends = new Friend[10];
	
	public static void main(String[] args) {
		
//		friends[0] = new Friend("�Ӽ���","01012345678");
//		friends[1] = new ComFriend("���ؿ�","01012123434","�ѹ��μ�");
//		friends[2] = new UnivFriend("���ն�","01045456767","�����а�");
//		
//		for(Friend friend : friends) {
//			if(friend != null) {
//				System.out.println(friend.toString());
//			}
//		}
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.ģ�� 2.�б�ģ�� 3.ȸ��ģ�� 4.��ü��� 5.ģ���̸� �˻� 6.����");
			System.out.println("-----------------------------------------------");
			System.out.print("����>");
			menu = scn.nextInt();
			if(menu == 1) {
				System.out.print("ģ���̸�> ");
				String name = scn.next();
				System.out.print("��ȭ��ȣ> ");
				String phone = scn.next();
				
				Friend friend = new Friend(name, phone); // name�� phone�� ����ִ� �ν��Ͻ� ����
				saveFriend(friend);
				
			} else if(menu == 2) {
				System.out.print("ģ���̸�> ");
				String name = scn.next();
				System.out.print("��ȭ��ȣ> ");
				String phone = scn.next();
				System.out.print("����> ");
				String major = scn.next();
				
				saveFriend(new UnivFriend(name, phone, major));
				
			} else if(menu == 3) {
				System.out.print("ģ���̸�> ");
				String name = scn.next();
				System.out.print("��ȭ��ȣ> ");
				String phone = scn.next();
				System.out.print("�μ�> ");
				String department = scn.next();
				
				saveFriend(new ComFriend(name, phone, department));
				
			} else if(menu == 4) {
				System.out.println("��ü���");
				for(Friend friend : friends) {
					if(friend != null) {
						System.out.println(friend.toString());
					}
				}
			} else if(menu == 5) {
				System.out.println("ã�� �̸� �Է�>");
				String findName = scn.next();
				for(Friend friend : friends) {
					if(friend !=null && friend.name.equals(findName)) {
						System.out.println("ģ������: " + friend.toString());
					}
				}
				
			} else if(menu == 6) {
				break;
			}
		}
		
		
	}
	public static void saveFriend(Friend friend) { // Friend Ÿ�� (��ӹ޴� ��� ��͵� �ü��ִ�)
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}
}
