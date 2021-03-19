package com.yadam.diary;

public class DiaryApp {
	DAO dao;

	public void start() {
		dao = new DiaryListDAO();
//		dao = new DiaryOracleDAO();

		int menuNum = 0;

		do {
			menuPrint();
			menuNum = menuChoose();

			process(menuNum);

		} while (menuNum != 0);
		System.out.println("end");
	}

	public void menuPrint() {
		Menu[] arr = Menu.values();
		int i = 0;
		for (Menu menu : arr) {
			System.out.print(String.format("%d:%s", i, menu.name()));
			i++;
		}
		System.out.println();
	}

	// �޴� ����
	public int menuChoose() {
		int menuSize = Menu.values().length - 1;
		int menuNum; // = StdInputUtil.reedInt();
		do {
			menuNum = StdInputUtil.reedInt();
			if (menuNum <= menuSize)
				break;

			System.out.println(menuSize + "������ �Է� �����մϴ�.");

		} while (true);
		return menuNum;
	}

	// �޴� ����
	public void process(int menuNum) {
		Menu menu = Menu.getMenu(menuNum);
		switch (menu) {
		case ����:
			exit();
			break;
		case �߰�:
			insert();
			break;
		case ����:
			update();
			break;
		case ����:
			delete();
			break;
		case ��ü��ȸ:
			selectAll();
			break;
		case ��¥�˻�:
			selectDate();
			break;
		case ����˻�:
			selectContent();
			break;
		}
	}

	// �Է�
	public void insert() {
		System.out.println("�Է¼���>>");
		System.out.println("��¥:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.println("����:");
		String contents = StdInputUtil.readMultiLine();
		
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(contents);
		int cnt = dao.insert(vo);
		System.out.println(cnt + "�� �Է¿Ϸ�");
		
	}

	// �߰�
	public void update() {
		System.out.println("��������>>");
		System.out.println("��¥:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.println("����:");
		String contents = StdInputUtil.readMultiLine();
		
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(contents);
		dao.update(vo);
		System.out.println("�����Ϸ�");
	}

	// ����
	public void delete() {
		System.out.println("��������>>");
		System.out.println("��¥:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		int r = dao.delete(wdate);
		System.out.println(r + "�� ������.");
	}

	// ��ü��ȸ
	public void selectAll() {
		System.out.println("��ü��ȸ����>>");
		for(DiaryVO vo : dao.selectAll()) {
			print(vo);
		}
	}

	// ��¥�˻�
	public void selectDate() {
		System.out.println("��¥�˻�>>");
		System.out.println("��¥:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		
		DiaryVO vo = dao.selectDate(wdate);
		print(vo);
	}
	
	// ����˻�
	public void selectContent() {
		
		
	}
	
	// ����Ҷ� ���
	public void print(DiaryVO vo) {
		System.out.println("��¥��: " + vo.getWdate());
		System.out.println("������: " + vo.getContents());
		System.out.println("----------------------------");
	}
	// ����
	public void exit() {
		System.out.println("���ἱ��>>");
	}
} // end of class