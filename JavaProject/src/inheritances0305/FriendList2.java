package inheritances0305;

import java.util.Scanner;

public class FriendList2 {

	public static void main(String[] args) {
		Friend[] friend = new Friend[10];
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.print("친구 이름 : ");
				String name = scn.next();
				System.out.print("휴대폰 번호 : ");
				String phone = scn.next();
				Friend friends = new Friend (name, phone);
				for(int i = 0; i<friend.length; i++) {
				if(friends == null) {
					friend[i] = friends;
					break;
					}
				}
			} else if (menu == 2) {
				System.out.print("학교 친구 : ");
				String name = scn.next();
				System.out.print("휴대폰 번호 : ");
				String phone = scn.next();
				System.out.println("학과 : ");
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
