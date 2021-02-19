package variables;

public class GetAverageValue {

	public static void main(String[] args) {
		int x, y;
		x = 17;
		y = 18;
		
		double z = x + y;
		double i = z / 2;
		System.out.println("두 수의 평균은 : " + i + " 입니다.");
		
		if (i == 17.5) {
			System.out.println("두 수의 평균은 : 17.5 입니다." );
		} else {
			System.out.println("두 수의 평균은 : 17.5 가 아닙니다");
		}

	}

}
