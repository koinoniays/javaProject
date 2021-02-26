package references;

public class ArrayExample2 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int random = 0;
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++) {
			random = (int) (Math.random() * 100) + 1;
			array[i] = random;
			sum = sum + array[i];
			avg = sum / array.length;
		}
			System.out.println("Че : " + sum + "\t ЦђБе : " + avg);
	}
}
