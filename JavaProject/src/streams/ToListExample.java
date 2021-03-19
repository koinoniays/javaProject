package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import hr.EmpDAO;
import hr.Employee;

public class ToListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hong", "Hwang", "Park");
		// stream �߰�ó�� ���������� ����� �ٽ� List<String>
	
		Collector<Object, ?, List<Object>> col = Collectors.toList();
		
		List<String> newList = list.stream()
		.filter( s -> s.startsWith("H"))
		.collect(Collectors.toList());
		
		System.out.println("==================================================");
		EmpDAO dao = new EmpDAO();
		dao.getEmpList();
		// dao.getEmpList(); // List<Employee>
		Set<Employee> emps = dao.getEmps(); // Set<Employee>
		emps.stream() // ������ IT_PROG ������� �����ͼ� List<Employee> ���
		.filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROG");
			}
			
		})// Stream<Employee>
		.collect(Collectors.toList());
		
		
		for (String str : newList) {
			System.out.println(str);
		}
	}

}
