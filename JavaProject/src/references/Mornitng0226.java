package references;

public class Mornitng0226 {

	public static void main(String[] args) {
		int[] engScores = new int[3];
		int[] mathScores = new int[3];

		engScores = new int[] { 85, 95, 70 };
		mathScores = new int[] { 75, 80, 90 };

		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < engScores.length; i++) {
			sum = sum + engScores[i];
			avg = sum / engScores.length;
		}
		System.out.println("sum : " + sum + "\t avg : " + avg);

		int sum2 = 0;
		double avg2 = 0.0;
		for (int i = 0; i < mathScores.length; i++) {
			sum2 = sum2 + mathScores[i];
			avg2 = sum2 / mathScores.length;
		}
		System.out.println("sum : " + sum2 + "\t avg : " + avg2);

	}

}
