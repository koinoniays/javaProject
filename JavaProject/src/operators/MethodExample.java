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
		// result = printAge(25); �����߻�
	}

	public static void printAge(int age) {
		// void = return���� ���� return������ ������ �����߻�
		System.out.println("���̴�: " + age + " �Դϴ�.");
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	} // result ���� ���� ����ϴ� sum()�޼ҵ�

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	} // result ���� ���̸� ����ϴ� minus()�޼ҵ�

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	} // result ���� ���� ����ϴ� multi()�޼ҵ�

	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	} // result ���� ���� ���� ����ϴ� divide()�޼ҵ�
}
