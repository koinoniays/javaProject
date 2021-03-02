package objects0302;

public class Cal {
	public static void main(String[] args) {
		showInfo("홍길동");
		showInfo("김길동");
		
		
		Student3 std = new Student3();
		std.setName("최길동");
		std.setEng(90);
		std.setMath(95);
		showInfo(std); 
		
		Student3[] stds = new Student3[3];
		stds[0] = new Student3("임성원", 77, 88);
		stds[1] = new Student3("정준영", 79, 89);
		stds[2] = new Student3("도왕락", 82, 86);
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
		System.out.println(student.getName() + ", 안녕하세요.");
		System.out.println("영어점수는" + student.getEng() + ", 수학점수는" + student.getMath() + ", 점수합계는" + (student.getEng() + student.getMath()));
	}
	
	public static void showInfo(String name) {
		System.out.println(name + ", 안녕하세요.");
	}
	
	
}
