package objects0303;

public class Member2Example {

	public static void main(String[] args) {
//객체생성		
		Member2 member2 = new Member2();
		
		member2.id = "ong";
		member2.password = "12345";
		
//메소드 호출	
		boolean result = member2.login(member2);
		if(result) {
			System.out.println("로그인 되었습니다.");
			member2.logout(member2);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
	}

}
