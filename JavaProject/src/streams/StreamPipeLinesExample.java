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
				new Member("홍길동", Member.MALE, 30),
				new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 45), 
				new Member("박수미", Member.FEMALE, 27));

		OptionalDouble result = list.stream() // 스트림 Stream<Member>
				.filter(new Predicate<Member>() { // 생성 된 스트림을 받아서 남자 요소 필터링
					@Override
					public boolean test(Member t) {
						return t.getSex() == Member.MALE;
					}
				})// Stream<Member>
				.mapToInt(new ToIntFunction<Member>() { // 매핑 처리 중간 스트림
					@Override
					public int applyAsInt(Member t) {
						return t.getAge();
					}

				})// IntStream
				.average() // OptionalDouble 최종 처리 메소드

		;
//		System.out.println("평균: " + result.getAsDouble());
		
		
		
		
		
		// 컬렉션 -> 스트림 -> 매핑(나이를 가지고 오는) -> 필터(30세 이상) -> 평균나이
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
		System.out.println(result.orElse(0.0)); // 결과를 만족하는 요소가 없을때 출력
		
		if(result.isPresent()) {
		System.out.println("평균: " + result.getAsDouble());		
	} else {
		System.out.println("만족하는 요소가 없습니다.");
		}

	}
}