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
		// String타입의 List인터페이스 컬랙션 = 구현클래스
		list.add("Hong");
		list.add("Kim");
		list.add("Shin");

		list = Arrays.asList("Hong", "Kim", "Park");
		// Arrays의 asList 메소드

		// 확장 for문 활용
		for (String str : list) { // list의 갯수만큼 루핑하여 str변수에 저장
//			System.out.println(str);
		}

		// 반복자 활용
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String val = iter.next();
//			System.out.println(val);
		}

		Stream<String> stream = list.stream(); // list컬렉션이 가지고 있는 stream() 메소드
		
		stream.forEach((String t) -> {
				System.out.println(t);
		});
		
		stream = list.stream();
		int sum = stream.mapToInt(s -> s.length()).sum(); // stream작업
		
		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		Stream<Employee> eStream = empList.stream(); // 오리지날 스트림
		
		
		// salary > 10000 이상인 사원 -> 사원들의 급여 합계
		
		int sum2 = eStream.filter(new Predicate<Employee>() {

			@Override //Predicate 를 구현하는 메소드
			public boolean test(Employee t) {
				return t.getSalary() > 10000;
			}
			
		}).mapToInt(new ToIntFunction<Employee>() {

			@Override
			public int applyAsInt(Employee t) {
				return t.getSalary();
			}
			
		}).sum();
		System.out.println("급여가 10000이상인 사원들의 급여합계");
	}	
	
}
