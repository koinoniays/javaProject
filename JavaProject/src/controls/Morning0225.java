package controls;

public class Morning0225 {

	public static void main(String[] args) {
		int x = 11;
		int y = 30;
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum = sum + i; // sum += i; 와 동일
		}
		System.out.println(x + " ~ " + y + " 의 합 : " + sum);

		getSum(11, 30);
		getSum(50, 70);

	}

	public static int getSum(int fromValue, int toValue) {
		int x = fromValue;
		int y = toValue;
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum = sum + i;
		}
		System.out.println(x + " ~ " + y + " 의 합 : " + sum);

		return sum;
	}

}
