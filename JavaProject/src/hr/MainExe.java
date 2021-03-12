package hr;

import java.util.List;

public class MainExe {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		Employee[] empList = dao.empList();
		List<Employee> empList = dao.getEmpList();
		System.out.println("salary가 5000 이상인 사원정보>>");
		for (Employee emp : empList) {
			if (emp != null && emp.getSalary() > 5000) {
				System.out.println(emp.toString());
			}
		}

		dao = new EmpDAO();
		Department[] deptList = dao.deptList();
		for (Department dep : deptList) {
			if (dep != null) {
				System.out.println(dep.toString());
			}

		}
	}
}
