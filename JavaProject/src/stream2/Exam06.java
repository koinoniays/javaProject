package stream2;

import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class Exam06 {
	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();
		dao.getEmpList();
		Set<Employee> emps = dao.getEmps();
		emps.stream()
		.filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}
			
		});
		
		}

	}

