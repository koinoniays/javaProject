package stream2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exam04 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("È«±æµ¿", 30, 50),
				new Student("±è±æµ¿", 50, 60),
				new Student("¹Ú±æµ¿", 60, 20)
				);
		
		
		Stream<Student> stream = list.stream()
				.filter(new Predicate<Student>() {

					@Override
					public boolean test(Student t) {
						return t.getmScore() + t.geteScore() < 100;
					}
					
				});
				

	}

}
