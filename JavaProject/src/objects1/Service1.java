package objects1;


public class Service1 implements Service {

	StdDAO dao = new StdDAO();

	@Override
	public Student[] getStudentList() {
		return dao.studentList();
	}
	
	@Override
	public Student getStudent (int stdId) {

		return dao.select(stdId);
	}

	@Override
	public void create(Student student) {
		dao.insert(student);
	}

	@Override
	public void modify(Student student) {
		dao.update(student);

	}
	
}
