package inheritances0305;

// ��ӹ��� Ŭ������ �� ��ӹ������ִ�
public class SmartPhone extends DmbPhone {
	@Override
	public String toString() {
		return "SmartPhone => model : " + model + "color : " + color;
	}
	
	@Override
	void powerOn() {
		System.out.println("SmartPhone ������ �մϴ�.");
		// super.powerOn(); //super = �θ�Ŭ������ �������ִ� �޼ҵ带 ȣ��
	}

	@Override
	void powerOff() {
		System.out.println("SmartPhone ������ ���ϴ�.");
	}

}
