package stream2;

import java.util.Set;
import java.util.function.Predicate;

import hr.EmpDAO;
import hr.Employee;

public class Exam05 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		dao.getEmpList();
		Set<Employee> emps = dao.getEmps();
		emps.stream()
		.filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return false;
				
			}
			
		});
	}

}
