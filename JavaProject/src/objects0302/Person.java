package objects0302;

public class Person {
	
	// �ʵ�
	String name;
	int age;
	double weight;
	double height;
	
	//�⺻ ������
	Person() {
		
	}
	
	// Person[] �迭 ������
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	
	
	}
	// �޼ҵ�
	void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("���� ��ϴ�.");
	}
	
	void walk() {
		System.out.println("�Ƚ��ϴ�.");
	}
	void introduce() {
		System.out.println("�̸��� : " + this.name + ", ���̴� : " + this.age + " �Դϴ�.");
	}
}
