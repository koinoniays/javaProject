package objects0303;

public class Member2 {
//�ʵ�
	String name;
	String id;
	String password;
	int age;

//������
	Member2() {

	}

	Member2(String name, String id) {
		this.name = name;
		this.id = id;
	}

//�޼ҵ�
	public boolean login(Member2 member) {
		if (id.equals("hong") && password.equals("12345")) 			
			return true;
		else 
			return false;
	}

	void logout(Member2 member) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");

	}
}
