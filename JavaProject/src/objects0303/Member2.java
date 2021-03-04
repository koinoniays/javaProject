package objects0303;

public class Member2 {
//필드
	String name;
	String id;
	String password;
	int age;

//생성자
	Member2() {

	}

	Member2(String name, String id) {
		this.name = name;
		this.id = id;
	}

//메소드
	public boolean login(Member2 member) {
		if (id.equals("hong") && password.equals("12345")) 			
			return true;
		else 
			return false;
	}

	void logout(Member2 member) {
		System.out.println("로그아웃 되었습니다.");

	}
}
