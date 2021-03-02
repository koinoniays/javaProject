package objects0302;

public class CalExample {

	public static void main(String[] args) {
//		System.out.println(getSum(40, 50));
//		System.out.println(getAverage(40, 50));
		Student3 s = new Student3("박소연", 87, 92);
		showInfo(s);
	}
	
	public static void showInfo(Student3 st) {
		System.out.println("이름: " + st.getName());
		System.out.println("합계점수: " + getSum(st.getEng(), st.getMath()));
		System.out.println("평균점수: " + getAverage(st.getEng(), st.getMath()));
	}

	public static int getSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum; // num1, num2 매개값을 받아서 더한 결과를 sum에 리턴
	}

	public static double getAverage(int a, int b) {
		int sum = a + b;
		double avg = sum / 2.0;
		return avg;
	}
}
