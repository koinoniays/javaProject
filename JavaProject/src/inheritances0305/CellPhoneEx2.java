package inheritances0305;

public class CellPhoneEx2 {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
//		cp = (CellPhone) new DmbPhone(); // int = (int) byte �ڵ����º�ȯ
//		cp = new SmartPhone(); // ��� �ڽ�Ŭ������ �ν��Ͻ��� ������ ����
		
		cp.color = "";
		
		if(cp instanceof DmbPhone) { // ���� cp���� CellPhone��ü�� ����� �ֱ⶧����
		DmbPhone dp = (DmbPhone) cp; 
		dp.model = "";
		dp.color = "";
		dp.channel = 15; 
		dp.powerOn();
		} else {
			System.out.println("Casting�� �� �����ϴ�.");
		}
		
		// ������
		// �θ�Ŭ���� = �ڽĵ�...
		// �θ�.�޼ҵ� = �ڽ�.�޼ҵ�;
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
	}

}
