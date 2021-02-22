package operators;

public class MethodExample {

	public static void main(String[] args) {
		int result = sum(10, 20);
		int result1 = minus(30, 20);
		int result2 = multi(15, 13);
		int result3 = divide(30, 12);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		printAge(25);
		// result = printAge(25); 에러발생
	}

	public static void printAge(int age) {
		// void = return값이 없음 return구문이 있으면 에러발생
		System.out.println("나이는: " + age + " 입니다.");
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	} // result 값의 합을 계산하는 sum()메소드

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	} // result 값의 차이를 계산하는 minus()메소드

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	} // result 값의 곱을 계산하는 multi()메소드

	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	} // result 값의 나눈 몫을 계산하는 divide()메소드
}
