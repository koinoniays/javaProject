package objects0303;

public class Member2Example {

	public static void main(String[] args) {
//��ü����		
		Member2 member2 = new Member2();
		
		member2.id = "ong";
		member2.password = "12345";
		
//�޼ҵ� ȣ��	
		boolean result = member2.login(member2);
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			member2.logout(member2);
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
		
	}

}
