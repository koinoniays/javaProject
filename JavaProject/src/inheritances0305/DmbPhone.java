package inheritances0305;

// �ڽ�Ŭ���� : extends + �θ�Ŭ����
public class DmbPhone extends CellPhone {
	// CellPhone(�θ�Ŭ����)+�ڽ�Ŭ���� �߰� ����
	int channel;
	
	// ������
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��: " + channel + " ����� �����մϴ�.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("ä��: " + channel + " �� �����մϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("����� �����մϴ�.");
	}
	
	// �޼ҵ� ������(@Override) source - �������̵�
	// DmbPhone�� ������ �ִ� �޼ҵ�
	@Override
	void powerOn() {
		System.out.println("DmbPhone ������ �մϴ�.");
		// super.powerOn(); //super = �θ�Ŭ������ �������ִ� �޼ҵ带 ȣ��
	}

	@Override
	void powerOff() {
		System.out.println("DmbPhone ������ ���ϴ�.");
	}

	@Override
	void bell() {
		System.out.println("DmbPhone ���� �︳�ϴ�.");
	}
	
	@Override
	public String toString() {
		return "DmbPhone => model : " + model + "color : " + color + "channel : " + channel;
	
	}
	
}
