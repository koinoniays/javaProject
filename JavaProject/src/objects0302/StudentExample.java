package objects0302;

public class StudentExample {
	public static void main(String[] args) {
		
		// Ŭ���� + ���� = new + Ŭ�����̸�
		Student student = new Student(); // �� ������ Student ��ü(�ν��Ͻ�) ����
		// ��ü�� ���� �� �ʵ忡 �� �Ҵ�
		student.studentNo = "s12345"; // ��Ʈ(.)�����ڴ� ��ü ���� ������. ��ü�� �������ִ� �ʵ峪 �޼ҵ带 ����ϰ��� �� �� ���
		student.grade = 2;
		student.eng = 80;
		student.math = 85;
		// �޼ҵ�
		student.study();
		student.run();
		student.introduce();

		
		
		
		// ���ο� ��ü ����
		Student student1 = new Student("s23456");
		student1.grade = 3;
		student1.eng = 76;
		student1.math = 88;
		
		student1.study();
		student1.run();
		student1.introduce();
		
		// ���ο� ��ü ����
		Student student2 = new Student(4, 70, 80);
		student2.studentNo = "s23459";
		
		student2.study();
		student2.run();
		student2.introduce();
		
	}
}
