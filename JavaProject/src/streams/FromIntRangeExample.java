package streams;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream is = IntStream.range(10, 20); // range() 메소드
		is = IntStream.rangeClosed(10, 20); // rangeClosed() 메소드
//		is.forEach(v -> System.out.println(v));
		
		//15 ~ 35 까지 합하는 스트림
		int from = 15, to = 35;
		IntStream iStream = IntStream.rangeClosed(from, to);
		System.out.println(from + "~" + to + "까지 합: " + iStream.sum());
		
	}

}
