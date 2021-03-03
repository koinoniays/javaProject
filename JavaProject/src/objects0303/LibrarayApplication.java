package objects0303;

import java.util.Scanner;

public class LibrarayApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1)도서정보등록 2)회원정보등록 3)도서대여 4)도서반납 5)도서목록 9)종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택>");
			int menu = scn.nextInt();
			if(menu == 1) {
				for(int i =0; i<bookList.length; i++) {
					System.out.print("1)도서정보등록>");
						
				}
			} else if(menu == 2) {
				
			} else if(menu == 3) {
				
			} else if(menu == 4) {
				
			} else if(menu == 5) {
				
			} else if(menu == 9) {
				break;
			}
		}
	}
}
