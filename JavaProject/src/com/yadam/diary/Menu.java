package com.yadam.diary;
// 메뉴 구성 열거형 타입
public enum Menu {
	종료(0), 추가(1), 수정(2), 삭제(3), 전체조회(4), 날짜검색(5), 내용검색(6);
	//	필드
	private int value;
	//	생성자
	private Menu(int value) {
		this.value = value;
	}
	//	메소드
	public int getValue() {
		return value;
	}
	
	public static Menu getMenu(int m) {
		Menu em = null; 
		for(Menu menu : Menu.values()) {
			// values() : 메뉴 값들을 배열타입으로 리턴해주는 메소드
			if(menu.getValue() == m) {
				em = menu;
				break;
			}			
		}
		return em;
	}	
}
