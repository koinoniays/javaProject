package generics;

public class Mornint {

	public static void main(String[] args) {
		checkGendar("111111-22222222");
		
		//�� ���� ���� ���ϰ� ���� ����� 3�ڸ������� �����ִ� �޼ҵ�
		sum("100000", "234000");
	}
	
	public static void sum(String a, String b) {
		System.out.println(a + b);
	}
	public static String checkGendar (String j) {
		char x = j.charAt(7);
		if(x == '1' || x == '3') {
			System.out.println("����");
		} else if ( x == '2' || x == '4') {
			System.out.println("����");
		}
		
		return j;
		
	}
}
