package streams;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream is = IntStream.range(10, 20); // range() �޼ҵ�
		is = IntStream.rangeClosed(10, 20); // rangeClosed() �޼ҵ�
//		is.forEach(v -> System.out.println(v));
		
		//15 ~ 35 ���� ���ϴ� ��Ʈ��
		int from = 15, to = 35;
		IntStream iStream = IntStream.rangeClosed(from, to);
		System.out.println(from + "~" + to + "���� ��: " + iStream.sum());
		
	}

}
