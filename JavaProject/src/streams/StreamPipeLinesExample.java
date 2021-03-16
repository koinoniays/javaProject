package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class StreamPipeLinesExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("�質��", Member.FEMALE, 20),
				new Member("�ſ��", Member.MALE, 45), 
				new Member("�ڼ���", Member.FEMALE, 27));

		OptionalDouble result = list.stream() // ��Ʈ�� Stream<Member>
				.filter(new Predicate<Member>() { // ���� �� ��Ʈ���� �޾Ƽ� ���� ��� ���͸�
					@Override
					public boolean test(Member t) {
						return t.getSex() == Member.MALE;
					}
				})// Stream<Member>
				.mapToInt(new ToIntFunction<Member>() { // ���� ó�� �߰� ��Ʈ��
					@Override
					public int applyAsInt(Member t) {
						return t.getAge();
					}

				})// IntStream
				.average() // OptionalDouble ���� ó�� �޼ҵ�

		;
//		System.out.println("���: " + result.getAsDouble());
		
		
		
		
		
		// �÷��� -> ��Ʈ�� -> ����(���̸� ������ ����) -> ����(30�� �̻�) -> ��ճ���
		result = list.stream().mapToInt(new ToIntFunction<Member>() {

			@Override
			public int applyAsInt(Member value) {
				return value.getAge();
			}

			
		}).filter(new IntPredicate() {

			@Override
			public boolean test(int value) {
				return value > 30;
			}
			
		}).average();
		System.out.println(result.orElse(0.0)); // ����� �����ϴ� ��Ұ� ������ ���
		
		if(result.isPresent()) {
		System.out.println("���: " + result.getAsDouble());		
	} else {
		System.out.println("�����ϴ� ��Ұ� �����ϴ�.");
		}

	}
}