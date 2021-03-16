package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// StringŸ���� List�������̽� �÷��� = ����Ŭ����
		list.add("Hong");
		list.add("Kim");
		list.add("Shin");

		list = Arrays.asList("Hong", "Kim", "Park");
		// Arrays�� asList �޼ҵ�

		// Ȯ�� for�� Ȱ��
		for (String str : list) { // list�� ������ŭ �����Ͽ� str������ ����
//			System.out.println(str);
		}

		// �ݺ��� Ȱ��
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
//			System.out.println(val);
		}

		Stream<String> stream = list.stream(); // list�÷����� ������ �ִ� stream() �޼ҵ�
		
		stream.forEach((String t) -> {
				System.out.println(t);
		});
		
		stream = list.stream();
		int sum = stream.mapToInt(s -> s.length()).sum(); // stream�۾�
		
		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		Stream<Employee> eStream = empList.stream(); // �������� ��Ʈ��
		
		
		// salary > 10000 �̻��� ��� -> ������� �޿� �հ�
		
		int sum2 = eStream.filter(new Predicate<Employee>() {

			@Override //Predicate �� �����ϴ� �޼ҵ�
			public boolean test(Employee t) {
				return t.getSalary() > 10000;
			}
			
		}).mapToInt(new ToIntFunction<Employee>() {

			@Override
			public int applyAsInt(Employee t) {
				return t.getSalary();
			}
			
		}).sum();
		System.out.println("�޿��� 10000�̻��� ������� �޿��հ�");
	}	
	
}
