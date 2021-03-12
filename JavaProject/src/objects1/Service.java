package objects1;

public interface Service {

	public Student[] getStudentList();
	public void create(Student student);
	public void modify(Student student);
	public Student getStudent(int stdId);
	
}
