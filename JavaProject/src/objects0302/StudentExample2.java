package objects0302;

public class StudentExample2 {

	public static void main(String[] args) {
		// 생성자 호출
		Student2 s1 = new Student2("홍길동", 90, 85); // Student2타입의 s1
		Student2 s2 = new Student2("김길동", 80, 75);
		Student2 s3 = new Student2("이길동", 70, 95);
		
		Student2 s4 = new Student2(); 
		// s4.name = "최길동";  // 다른 클래스에서 private 제한자의 값들은 사용불가 사용하려면 해당되는 메소드 호출
		s4.setName("최길동");
		//s4.eng = 70;
		s4.setEng(-70);
		//s4.math = 80;
		s4.setMath(80);
		System.out.println(s4.getMath());
	
		
		
		// 생성자 호출 배열객체 생성
		Student2[] student2 = new Student2[4];
		student2[0] = s1;
		student2[1] = s2;
		student2[2] = s3;
		student2[3] = s4;
		
		
		// 향상된 for문을 이용한 메소드 호출
		for(Student2 students : student2) {
			students.showInfo();
		}

	}

}
