package objects0302;

public class Cal {
	public static void main(String[] args) {
		showInfo("ȫ�浿");
		showInfo("��浿");
		
		
		Student3 std = new Student3();
		std.setName("�ֱ浿");
		std.setEng(90);
		std.setMath(95);
		showInfo(std); 
		
		Student3[] stds = new Student3[3];
		stds[0] = new Student3("�Ӽ���", 77, 88);
		stds[1] = new Student3("���ؿ�", 79, 89);
		stds[2] = new Student3("���ն�", 82, 86);
		showInfo(stds);
		
		
	}
	
	
	public static void showInfo(Student3[] students) {
		for(Student3 std : students) {
			if(std !=null) {
			showInfo(std);	
			}
		}		
	}
	
	public static void showInfo(Student3 student) {
		System.out.println(student.getName() + ", �ȳ��ϼ���.");
		System.out.println("����������" + student.getEng() + ", ����������" + student.getMath() + ", �����հ��" + (student.getEng() + student.getMath()));
	}
	
	public static void showInfo(String name) {
		System.out.println(name + ", �ȳ��ϼ���.");
	}
	
	
}
