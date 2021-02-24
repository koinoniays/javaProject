package controls;

public class WhileExample {

	public static void main(String[] args) {

		// for (초기값; 조건식; 증감식;)
		int sum = 0;
		int i = 1; 					// 초기값
		while (i <= 10) { 			// 조건식
			sum = sum + i;			// 실행문
			i++; 					// 증감식
		}
		System.out.println("1 ~ 10 합: " + sum);
		
		
		i = 1;
		sum = 0;
		while (true) {
			sum = sum + i;
			if (i >= 10) {
				break;
			}
			i++; 					//위치중요
		}
		System.out.println("1 ~ 10 합: " + sum);
		
	}
}
