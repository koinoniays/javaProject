package hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmpDAO {
	Connection conn = null;
	
	public EmpDAO(){	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);
	
	}
	
	public Map<String, String> getJobList() {
		String sql = "select * from jobs";
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				map.put(rs.getString("job_id"), rs.getString("job_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		} DBUtil.close(rs,  stmt,  conn);
		
		return map;
	}
	
	
	public Department[] deptList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Department[] departments = new Department[100];
		try {
			psmt = conn.prepareStatement("select * from departments");
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Department dep = new Department();			
					dep.setDepartmentId(rs.getInt("department_id"));
					dep.setDepartmentName(rs.getString("department_name"));
					dep.setManagerId(rs.getString("manager_id"));
					dep.setLocationId(rs.getString("location_id"));
					departments[i++] = dep;				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return departments;
	}
	
	public Set<Employee> getEmps() {
		
		return null;
	}
	
	public List<Employee> getEmpList() {
		String sql = "select * from emp_java";
		List<Employee> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			DBUtil.close(rs,  stmt,  conn);
		}
		return list;
	}
	
	public Employee[] empList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		Employee[] employees = new Employee[100];
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
//				System.out.println(emp.toString());
				employees[i++] = emp;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return employees;
	}
}
