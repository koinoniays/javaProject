package inheritances0305;

public class Tire {
	// �ʵ�
	int maxRotation; // �ִ�ȸ����
	int accumulatedRotation; // ����ȸ����
	String location;
	// ������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		}
	// �޼ҵ�
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "Tire ��ũ ***");
			return false;
		}
	}
}
