package controls;

public class Exercise0225 {

	public static void main(String[] args) {
		getSumvalue(35, 60);
		getSumvalue(1, 10);
//		getSumvalue2(35, 60);
	}

	public static int getSumvalue(int value1, int value2) {
		int x = value1;
		int y = value2;
		int sum = 0;
		for (int i = y; i >= x; i--) {
			sum = sum + i;
		}
		System.out.println(x + " ~ " + y + " 의 합 : " + sum);
		return sum;
	}

//	public static int getSumvalue2(int n1, int n2) {
//		int startNo = (n1 > n2) ? n2 : n1;
//		int endNo = (n1 > n2) ? n1 : n2;
//		int sum = 0;
//		for (int i = startNo; i <= endNo; i++) {
//			sum = sum + i;
//		}
//		System.out.println(startNo + " ~ " + endNo + " 의 합 : " + sum);
//		return sum;
//	}
}
