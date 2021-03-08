package inheritances0305;

import java.util.Scanner;

public class FriendList  {
	static Friend[] friends = new Friend[10];
	
	public static void main(String[] args) {
		
//		friends[0] = new Friend("임성원","01012345678");
//		friends[1] = new ComFriend("정준영","01012123434","총무부서");
//		friends[2] = new UnivFriend("도왕락","01045456767","역사학과");
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
			System.out.println("1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			menu = scn.nextInt();
			if(menu == 1) {
				System.out.print("친구이름> ");
				String name = scn.next();
				System.out.print("전화번호> ");
				String phone = scn.next();
				
				Friend friend = new Friend(name, phone); // name과 phone을 담고있는 인스턴스 생성
				saveFriend(friend);
				
			} else if(menu == 2) {
				System.out.print("친구이름> ");
				String name = scn.next();
				System.out.print("전화번호> ");
				String phone = scn.next();
				System.out.print("전공> ");
				String major = scn.next();
				
				saveFriend(new UnivFriend(name, phone, major));
				
			} else if(menu == 3) {
				System.out.print("친구이름> ");
				String name = scn.next();
				System.out.print("전화번호> ");
				String phone = scn.next();
				System.out.print("부서> ");
				String department = scn.next();
				
				saveFriend(new ComFriend(name, phone, department));
				
			} else if(menu == 4) {
				System.out.println("전체목록");
				for(Friend friend : friends) {
					if(friend != null) {
						System.out.println(friend.toString());
					}
				}
			} else if(menu == 5) {
				System.out.println("찾을 이름 입력>");
				String findName = scn.next();
				for(Friend friend : friends) {
					if(friend !=null && friend.name.equals(findName)) {
						System.out.println("친구정보: " + friend.toString());
					}
				}
				
			} else if(menu == 6) {
				break;
			}
		}
		
		
	}
	public static void saveFriend(Friend friend) { // Friend 타입 (상속받는 요소 어떤것든 올수있다)
		for(int i = 0; i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}
}
