package inheritances0305;

public class CellPhoneEx {

	public static void main(String[] args) {
		// CellPhone �⺻ �����ڸ� ȣ���Ͽ� �ν��Ͻ� ����
		CellPhone cp = new CellPhone(); 
		// �ʵ��Է�
		cp.model = "Galaxy";
		cp.color = "White";
		// �޼ҵ�
		cp.powerOn();
		cp.bell();
		cp.powerOff();
		
		// ������ �θ�Ŭ������ ��� ��� Ŭ�������� objectŬ����(�ֻ���Ŭ����)�� �ִ�.
		cp.equals("");
		cp.getClass();
		cp.toString();
		
		
		System.out.println("================================");
		
		// CellPhone(�θ�Ŭ����) ��� ����
		DmbPhone dp = new DmbPhone();
		dp.model = "Motolora";
		dp.color = "Black";
		dp.channel = 10;
		dp.powerOn();
		dp.bell();
		dp.turnOnDmb();
		dp.changeChannel(20);
		dp.turnOffDmb();
		dp.powerOff();
		
		System.out.println("================================");
		
		// CellPhone, DmbPhone �Ѵ� ��밡��
		SmartPhone sp = new SmartPhone();
		
		sp.model = "LGPhone";
		sp.color = "Pink";
		
		sp.commonMethod();
		System.out.println("================================");
		
		//toString �������̵� ���
		System.out.println(cp.toString());
		System.out.println(dp.toString());
		System.out.println(sp.toString());
	}
	

}
