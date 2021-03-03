package objects0302;

public class Student {

	// 필드(속성) : 타입 + 필드이름
	String studentNo;
	int grade;
	int math;
	int eng;

	
	
	// 생성자 : 필드값을 초기화
	public Student() { // 기본생성자
		System.out.println("생성자를 호출합니다.");
	}

	Student(String studentNo) {
		this.studentNo = studentNo;
	}

	Student(int grade, int eng, int math) {
		this.grade = grade;
		this.eng = eng;
		this.math = math;
	}

	
	
	// 메소드(기능)
	public void study() {
		System.out.println("공부합니다.");
	}

	public void run() {
		System.out.println("운동을 합니다.");
	}

	public void introduce() {
		System.out.println("학번 : " + studentNo + ", 학년 : " + grade + ", 영어: " + eng + ", 수학: " + math);

	}

}
