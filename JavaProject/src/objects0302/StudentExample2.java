package objects0302;

public class StudentExample2 {

	public static void main(String[] args) {
		// ������ ȣ��
		Student2 s1 = new Student2("ȫ�浿", 90, 85); // Student2Ÿ���� s1
		Student2 s2 = new Student2("��浿", 80, 75);
		Student2 s3 = new Student2("�̱浿", 70, 95);
		
		Student2 s4 = new Student2(); 
		// s4.name = "�ֱ浿";  // �ٸ� Ŭ�������� private �������� ������ ���Ұ� ����Ϸ��� �ش�Ǵ� �޼ҵ� ȣ��
		s4.setName("�ֱ浿");
		//s4.eng = 70;
		s4.setEng(-70);
		//s4.math = 80;
		s4.setMath(80);
		System.out.println(s4.getMath());
	
		
		
		// ������ ȣ�� �迭��ü ����
		Student2[] student2 = new Student2[4];
		student2[0] = s1;
		student2[1] = s2;
		student2[2] = s3;
		student2[3] = s4;
		
		
		// ���� for���� �̿��� �޼ҵ� ȣ��
		for(Student2 students : student2) {
			students.showInfo();
		}

	}

}
