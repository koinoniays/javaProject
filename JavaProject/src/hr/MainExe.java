package hr;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainExe {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		
		Map<String, String> map = dao.getJobList();
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String,String>> iter = set.iterator();
		while(iter.hasNext()) {
			Entry<String, String> ent = iter.next();
			System.out.println("jobId: " + ent.getKey() + "jobTitle: " + ent.getValue());
		}
		
//		Employee[] empList = dao.empList();
//		List<Employee> empList = dao.getEmpList();
//		System.out.println("salary가 5000 이상인 사원정보>>");
//		for (Employee emp : empList) {
//			if (emp != null && emp.getSalary() > 5000) {
//				System.out.println(emp.toString());
//			}
//		}
//
//		dao = new EmpDAO();
//		Department[] deptList = dao.deptList();
//		for (Department dep : deptList) {
//			if (dep != null) {
//				System.out.println(dep.toString());
//			}
//
//		}
	}
}
