package hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps();
		
		TreeSet<Employee> tSet = (TreeSet<Employee>) dao.getEmps();
		Iterator<Employee> iter = tSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
