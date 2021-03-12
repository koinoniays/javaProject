package generics;
// ���ϵ�ī��

class Person {
	// �ʵ�
	String name;
	// ������
	Person(String name) {
		this.name = name;
	}
	// �޼ҵ�
	String getName() {
		return this.name;
	}
	
}

// PersonŬ������ ��ӹ޴� WorkerŬ����
class Worker extends Person {
	Worker(String name) {
		super(name);
	}
}

// PersonŬ������ ��ӹ޴� StudentŬ����
class Student extends Person {
	Student(String name) {
		super(name); // �θ�Ŭ���� ������ ȣ��
	}
}

// StudentŬ������ ��ӹ޴� HighStudentŬ����
class HighStudent extends Student {
	HighStudent(String name) {
		super(name);
	}
}

// ��������
public class Course<T> {
	String courseName;
	T [] students; // ���׸� Ÿ�� ����
	Course(String courseName, int capacity) { // capacity = coursename�� �����Ҽ� �ִ� �ο�����
		this.courseName = courseName;
		students = (T[]) new Object[capacity]; // objectŸ���� ���׸�Ÿ������ ĳ����
	}
	public void add(T t) { // students�迭�� �ϳ��� ����ϴ� �޼ҵ�
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	public String getCourseName() { //������ ����
		return this.courseName;
	}
	public T[] getStudents() { // ������ ��� �Ǿ��ִ� �л� ����
		return this.students;
	}
}
