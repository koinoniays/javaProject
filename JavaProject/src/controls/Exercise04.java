package controls;

public class Exercise04 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		while (x + y != 5) {
			x = (int) (Math.random() * 6) + 1;
			y = (int) (Math.random() * 6) + 1;
			System.out.println("(" + x + "," + y + ")");
			if (x + y == 5) {
				break;
			}
		}
	}
}
