package references;

public class ArrayExample1 {

	public static void main(String[] args) {

		int[] arys = new int[5];
		int max = 0;
		
		for (int i = 0; i < arys.length; i++) {
			int random = (int) ((Math.random()) * 10) + 1;
			arys[i] = random;
			System.out.println(arys[i]);
		}
		for (int i = 1; i < arys.length; i++) {
			if (arys[i] > max) {
				max = arys[i];
			}
		}
		System.out.println("�ִ밪 : " + max);
	}
}
