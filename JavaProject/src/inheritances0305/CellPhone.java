package inheritances0305;
// �θ�Ŭ����
public class CellPhone {
	// �ʵ�
	String model;
	String color;

	// ������

	// �޼ҵ�
	void powerOn() {
		System.out.println("CellPhone ������ �մϴ�.");
	}

	void bell() {
		System.out.println("CellPhone ���� �︳�ϴ�.");
	}

	void hangUp() {
		System.out.println("CellPhone ��ȭ�� �����ϴ�.");

	}

	void powerOff() {
		System.out.println("CellPhone ��ȭ�� ���ϴ�.");
	}
	
	void commonMethod() {
		System.out.println("�� : " + model + ", ���� : " + color);
				
	}
	
	//toString �������̵� ���
	@Override
	public String toString() {
		return "CellPhone => model : " + model + "color : " + color;
	}
	
	
}