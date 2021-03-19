package streams;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ReduceExample {
	public static void main(String[] args) {
		
		Student[] students = {
				new Student("Hong", 10)
				,new Student("Shin", 20)
				,new Student("Yu", 30)
		};
		int sum = Arrays.stream(students)
		.mapToInt(s -> s.getScore())
		.reduce(0, new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				System.out.println("left: " + left + ", rigth: " + right);
				return left + right;
			}
			
		});
		System.out.println("sum: " + sum);
		
		
	}
	
}
