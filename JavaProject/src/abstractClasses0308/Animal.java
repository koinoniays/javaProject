package abstractClasses0308;
// �߻�Ŭ����
public abstract class Animal {
	String species;
	
	public Animal() {
		
	}
	public Animal(String species) {
		this.species = species;
	}
	
	public void showInfo() {
		System.out.println("������ " + this.species + "�Դϴ�.");
	}
	public void breathe() {
		System.out.println("���� ����.");
	}
	// �߻�Ŭ������ ���� �߻�޼ҵ� : ��ɾ��� �޼ҵ常 ����, ��ӵǴ� �޼ҵ忡 �ݵ�� �����ؾ���
	public abstract void sound();
	
	
}
