package objects0302;

public class CalExample {

	public static void main(String[] args) {
//		System.out.println(getSum(40, 50));
//		System.out.println(getAverage(40, 50));
		Student3 s = new Student3("�ڼҿ�", 87, 92);
		showInfo(s);
	}
	
	public static void showInfo(Student3 st) {
		System.out.println("�̸�: " + st.getName());
		System.out.println("�հ�����: " + getSum(st.getEng(), st.getMath()));
		System.out.println("�������: " + getAverage(st.getEng(), st.getMath()));
	}

	public static int getSum(int num1, int num2) {
		int sum = num1 + num2;
		return sum; // num1, num2 �Ű����� �޾Ƽ� ���� ����� sum�� ����
	}

	public static double getAverage(int a, int b) {
		int sum = a + b;
		double avg = sum / 2.0;
		return avg;
	}
}
