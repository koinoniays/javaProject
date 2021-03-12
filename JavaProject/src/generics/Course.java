package generics;
// 와일드카드

class Person {
	// 필드
	String name;
	// 생성자
	Person(String name) {
		this.name = name;
	}
	// 메소드
	String getName() {
		return this.name;
	}
	
}

// Person클래스를 상속받는 Worker클래스
class Worker extends Person {
	Worker(String name) {
		super(name);
	}
}

// Person클래스를 상속받는 Student클래스
class Student extends Person {
	Student(String name) {
		super(name); // 부모클래스 생성자 호출
	}
}

// Student클래스를 상속받는 HighStudent클래스
class HighStudent extends Student {
	HighStudent(String name) {
		super(name);
	}
}

// 수업과정
public class Course<T> {
	String courseName;
	T [] students; // 제네릭 타입 선언
	Course(String courseName, int capacity) { // capacity = coursename에 참석할수 있는 인원제한
		this.courseName = courseName;
		students = (T[]) new Object[capacity]; // object타입을 제네릭타입으로 캐스팅
	}
	public void add(T t) { // students배열에 하나씩 등록하는 메소드
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	public String getCourseName() { //과정명 리턴
		return this.courseName;
	}
	public T[] getStudents() { // 과정에 등록 되어있는 학생 리턴
		return this.students;
	}
}
