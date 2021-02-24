package practice;

public class Exercise07 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		System.out.println((x > 7) && (y <= 5));
		System.out.println((x % 3 == 2) || (y % 2 != 1));

		boolean z = (x++ % 2 == 0) || (y++ % 3 == 0); // ||가 2개이면 앞의 식만 확인 후 t/f 산출
		if (z) {
			System.out.println("true : " + x + ", y : " + y);
		} else {
			System.out.println("false : " + x + ", y : " + y);
		}
		boolean j = (x++ % 2 == 0) || (y++ % 3 == 0); // |가 1개이면 두개의 식 전부 확인 후 t/f 산출
		if (j) {
			System.out.println("true : " + x + ", y : " + y);
		} else {
			System.out.println("false : " + x + ", y : " + y);
		}
	}

}
