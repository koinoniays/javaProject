package objects0302;

public class Student {

	// �ʵ�(�Ӽ�) : Ÿ�� + �ʵ��̸�
	String studentNo;
	int grade;
	int math;
	int eng;

	
	
	// ������ : �ʵ尪�� �ʱ�ȭ
	public Student() { // �⺻������
		System.out.println("�����ڸ� ȣ���մϴ�.");
	}

	Student(String studentNo) {
		this.studentNo = studentNo;
	}

	Student(int grade, int eng, int math) {
		this.grade = grade;
		this.eng = eng;
		this.math = math;
	}

	
	
	// �޼ҵ�(���)
	public void study() {
		System.out.println("�����մϴ�.");
	}

	public void run() {
		System.out.println("��� �մϴ�.");
	}

	public void introduce() {
		System.out.println("�й� : " + studentNo + ", �г� : " + grade + ", ����: " + eng + ", ����: " + math);

	}

}
