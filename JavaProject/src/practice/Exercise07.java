package practice;

public class Exercise07 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		System.out.println((x > 7) && (y <= 5));
		System.out.println((x % 3 == 2) || (y % 2 != 1));

		boolean z = (x++ % 2 == 0) || (y++ % 3 == 0); // ||�� 2���̸� ���� �ĸ� Ȯ�� �� t/f ����
		if (z) {
			System.out.println("true : " + x + ", y : " + y);
		} else {
			System.out.println("false : " + x + ", y : " + y);
		}
		boolean j = (x++ % 2 == 0) || (y++ % 3 == 0); // |�� 1���̸� �ΰ��� �� ���� Ȯ�� �� t/f ����
		if (j) {
			System.out.println("true : " + x + ", y : " + y);
		} else {
			System.out.println("false : " + x + ", y : " + y);
		}
	}

}
