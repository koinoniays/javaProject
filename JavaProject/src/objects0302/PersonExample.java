package objects0302;

public class PersonExample {

	public static void main(String[] args) {
//		Person person = new Person();
//		
//		person.name = "ȫ�浿";
//		person.age = 20;
//		
//		person.eat();
//		person.sleep();
//		person.walk();
//		person.introduce();
//		
//		
//		
//		Person person1 = new Person();
//		
//		person1.name = "��浿";
//		person1.age = 21;
//		
//		person1.eat();
//		person1.sleep();
//		person1.walk();
//		person1.introduce();

		
		
		// (���ڿ�:�̸�, ����:����)�� �迭�� �����ϱ� ���ؼ� (String[], int[])���� Ÿ���� �������������
		// Ŭ���� Person[] : Ŭ���� Ÿ�� �迭�� (String, int) Ÿ�� ������� ���𰡴�
		
		Person[] persons = new Person[5];
		persons[0] = new Person("ȫ�浿", 15, 175.5, 72.5);
		persons[1] = new Person("��浿", 25, 125.5, 32.5);
		persons[2] = new Person("�̱浿", 22, 185.5, 82.5);
		persons[3] = new Person("�ڱ浿", 19, 145.5, 42.5);
		persons[4] = new Person("�ֱ浿", 35, 185.5, 82.5);
		for (Person person : persons) { // ���� for��
			if (person.age > 20 && person.height > 180.0) {
				person.introduce();
			}
		}
	}
}
