package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "È«±æµ¿"), 90);
		map.put(new Student(2, "±è¹Î¼ö"), 85);
		map.put(new Student(1, "È«±æµ¿"), 92);
		
		Set<Student> set = map.keySet();
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student.toString());
		}
		

	}

}
