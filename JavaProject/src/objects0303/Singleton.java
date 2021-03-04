package objects0303;

// �̱��� 
public class Singleton {
	// �ʵ�
	private static Singleton singleton = new Singleton();
	// �ڽ��� Ÿ������ ���� �ʵ� ���� �ڽ��� ��ü�� ������ �ʱ�ȭ
	// private�� �ٿ� �ܺο��� �ʵ� �� ���� �Ұ��ϵ���

	// ������ - �ܺο��� ȣ�� ���ϵ���
	private Singleton() {

	}

	// �޼ҵ� �ܺο��� ȣ�� �����ϵ���
	public static Singleton getInstance() {
		return singleton;
	}
}
