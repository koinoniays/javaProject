package references;

//배열
public class ArrayExample {

	public static void main(String[] args) {
		int score1 = 90;
		int score2 = 91;
		int score3 = 92;
		int score4 = 93;
		int score5 = 94;

		int sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;

		// 선언방법 1
		int[] scores = new int[5]; // 5개의 배열 공간 생성
		scores[0] = 90;
		scores[1] = 91;
		scores[2] = 92;
		scores[3] = 93;
		scores[4] = 94; // scores[인덱스(0부터 시작)]
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		// 값 변경
		scores[0] = 80;
		scores[1] = 81;

		System.out.println("변경후");
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println("-----------for-----------");

		sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + scores[i];
		}
		avg = sum / 5.0;

		// 선언방법 2
		int[] scores2 = { 90, 91, 92, 93, 94 };
		System.out.println("-------------------------");
		System.out.println(scores2[3]);
		System.out.println(scores2[4]);
		System.out.println("-------------------------");

		double[] averages = { 1, 2, 3, 4, 5 };
		System.out.println(averages.length);
		double d1 = averages[0]; // 또 다른 double 타입의 변수에 할당 가능
		averages[3] = 4.5; // 값 변경

		for (int i = 0; i < averages.length; i++) {
			System.out.println(averages[i]);
		}
		System.out.println("-------------------------");
		
		String[] strs = { "Hello", "Good", "Nice", "20" };
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
