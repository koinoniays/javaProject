package com.yadam.diary;
// �޴� ���� ������ Ÿ��
public enum Menu {
	����(0), �߰�(1), ����(2), ����(3), ��ü��ȸ(4), ��¥�˻�(5), ����˻�(6);
	//	�ʵ�
	private int value;
	//	������
	private Menu(int value) {
		this.value = value;
	}
	//	�޼ҵ�
	public int getValue() {
		return value;
	}
	
	public static Menu getMenu(int m) {
		Menu em = null; 
		for(Menu menu : Menu.values()) {
			// values() : �޴� ������ �迭Ÿ������ �������ִ� �޼ҵ�
			if(menu.getValue() == m) {
				em = menu;
				break;
			}			
		}
		return em;
	}	
}
