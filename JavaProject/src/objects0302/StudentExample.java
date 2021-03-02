package objects0302;

public class StudentExample {
	public static void main(String[] args) {
		
		// 클래스 + 변수 = new + 클래스이름
		Student student = new Student(); // 힙 영역에 Student 객체(인스턴스) 생성
		// 객체를 만든 후 필드에 값 할당
		student.studentNo = "s12345"; // 도트(.)연산자는 객체 접근 연산자. 객체가 가지고있는 필드나 메소드를 사용하고자 할 때 사용
		student.grade = 2;
		student.eng = 80;
		student.math = 85;
		// 메소드
		student.study();
		student.run();
		student.introduce();

		
		
		
		// 새로운 객체 생성
		Student student1 = new Student("s23456");
		student1.grade = 3;
		student1.eng = 76;
		student1.math = 88;
		
		student1.study();
		student1.run();
		student1.introduce();
		
		// 새로운 객체 생성
		Student student2 = new Student(4, 70, 80);
		student2.studentNo = "s23459";
		
		student2.study();
		student2.run();
		student2.introduce();
		
	}
}
